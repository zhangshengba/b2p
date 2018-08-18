package com.cdut.b2p.modules.shop.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cdut.b2p.modules.shop.mapper.ShopGoodsMapper;
import com.cdut.b2p.modules.shop.po.ShopGoods;
import com.cdut.b2p.modules.shop.po.ShopGoodsExample;
import com.cdut.b2p.modules.shop.po.ShopGoodsInfo;
import com.cdut.b2p.common.po.Page;
import com.cdut.b2p.common.utils.CacheUtils;
import com.cdut.b2p.common.utils.IdUtils;
import com.cdut.b2p.common.utils.StringUtils;
import com.cdut.b2p.modules.shop.mapper.ShopGoodsMapper;
import com.cdut.b2p.modules.shop.mapper.ShopUserMapper;
import com.cdut.b2p.modules.shop.po.ShopGoods;
import com.cdut.b2p.modules.shop.po.ShopUser;
import com.cdut.b2p.modules.shop.service.ShopGoodsService;
import com.cdut.b2p.modules.sys.mapper.SysAreaMapper;
import com.cdut.b2p.modules.sys.mapper.SysDictMapper;
import com.cdut.b2p.modules.sys.po.SysArea;
import com.cdut.b2p.modules.sys.po.SysAreaExample;
import com.cdut.b2p.modules.sys.po.SysDict;
import com.cdut.b2p.modules.sys.po.SysDictExample;
import com.cdut.b2p.modules.sys.po.SysUser;
import com.cdut.b2p.modules.sys.service.SysAreaService;

@Service
@Transactional
public class ShopGoodsServiceImpl implements ShopGoodsService {
	@Autowired
	private ShopGoodsMapper shopGoodsMapper;
	@Autowired
	private SysDictMapper sysDictMapper;
	@Autowired
	private SysAreaService sysAreaService;
	@Autowired
	private SysAreaMapper sysAreaMapper;
	@Autowired
	private ShopUserMapper shopUserMapper;

	/**
	 * @desc 查询上一个月每新增加的商品数量
	 * @author zsb
	 * @return
	 */
	@SuppressWarnings("deprecation")
	@Transactional(readOnly = true)
	@Override
	public Integer addGoodsCountByMonth() {
		Date date = new Date();
		int year = date.getYear();
		int month = date.getMonth();
		int day = date.getDate();
		// 上一月的开始时间[默认为每月的时间为31天]
		Date startDate = new Date(year, month, 1);
		// 上一月的结束时间
		Date endDate = new Date(year, month, 31);

		ShopGoodsExample shopGoodsExample = new ShopGoodsExample();
		shopGoodsExample.or().andCreateDateBetween(startDate, endDate);
		List<ShopGoods> list = shopGoodsMapper.selectByExample(shopGoodsExample);
		return list.size();
	}

	private void preInsert(ShopGoods shopGoods) {
		shopGoods.setUpdateDate(new Date());
		shopGoods.setCreateDate(shopGoods.getUpdateDate());
	}

	@Transactional(readOnly = false)
	@Override
	public void save(ShopGoods shopGoods) {
		preInsert(shopGoods);
		shopGoodsMapper.insertSelective(shopGoods);
		CacheUtils.remove("goodslist");
	}

	@Transactional(readOnly = true)
	@Override
	public List<SysDict> findAllBrandByGoodsType(String goods_type) {
		List<SysDict> dictList = (List<SysDict>) CacheUtils.get(goods_type + "dictList");
		if (dictList == null) {
			SysDictExample sde = new SysDictExample();
			sde.or().andDictTypeEqualTo(goods_type);
			dictList = sysDictMapper.selectByExample(sde);
			if (dictList.size() > 0) {
				CacheUtils.put(goods_type + "dictList", dictList);
			}
		}
		return dictList;

	}

	@Transactional(readOnly = true)
	@Override
	public List<SysDict> findAllDict() {
		List<SysDict> dictList = (List<SysDict>) CacheUtils.get("dictList");
		if (dictList == null) {
			SysDictExample sde = new SysDictExample();
			sde.or();
			dictList = sysDictMapper.selectByExample(sde);
			CacheUtils.put("dictList", dictList);
		}
		return dictList;
	}

	@Transactional(readOnly = true)
	@Override
	public List<ShopGoods> findAllGoods() {
		List<ShopGoods> goodslist = (List<ShopGoods>) CacheUtils.get("goodslist");
		if (goodslist == null) {
			ShopGoodsExample sge = new ShopGoodsExample();
			sge.or();
			goodslist = shopGoodsMapper.selectByExample(sge);
			CacheUtils.put("goodslist", goodslist);
		}
		return goodslist;
	}

	@Transactional(readOnly = true)
	@Override
	public Page<ShopGoodsInfo> findGoodsofOnePage(String type, String brand, Integer min_price, Integer max_price,
			String area, Integer pageNum, Integer pageSize, String keyword) {

		// List<ShopGoods> goodslist = findAllGoods();
		type = findAllBrandByGoodsType(type).get(0).getId();

		if (type == null || StringUtils.isBlank(type)) {
			return null;
		}

		ShopGoodsExample sge = new ShopGoodsExample();
		ShopGoodsExample.Criteria cri = sge.createCriteria();
		sge.setLimit(pageSize);
		sge.setOffset(pageNum.equals(0) ? 0 : (long) ((pageNum - 1) * pageSize));
		cri.andGoodsCategoryIdEqualTo(type);

		if (area != null && !StringUtils.isBlank(area)) {
			List<SysArea> arealist = sysAreaService.findAllChildrenByParentId(area);
			List<String> areaIdList = new ArrayList<String>();
			for (SysArea sa : arealist) {
				areaIdList.add(sa.getId());
			}
			if (areaIdList != null && !areaIdList.isEmpty()) {
				cri.andGoodsAreaIdIn(areaIdList);
			} else {
				cri.andGoodsAreaIdEqualTo(area);
			}
		}
		if (brand != null && !StringUtils.isBlank(brand)) {
			cri.andGoodsBrandIdEqualTo(brand);
		}
		if (min_price != null && min_price > 0) {
			cri.andGoodsPresentPriceGreaterThanOrEqualTo(new BigDecimal(min_price));
		}
		if (max_price != null && max_price > 0) {
			cri.andGoodsPresentPriceLessThanOrEqualTo(new BigDecimal(max_price));
		}
		if (keyword != null && !StringUtils.isBlank(keyword)) {
			cri.andGoodsTitleLike("%" + keyword + "%");
		}

		List<ShopGoods> goodslist = shopGoodsMapper.selectByExampleWithBLOBs(sge);
		Long size_long = shopGoodsMapper.countByExample(sge);
		Integer size = size_long.intValue();
		Integer now_size = goodslist.size();

		List<ShopGoodsInfo> list1 = new ArrayList<ShopGoodsInfo>();

		for (ShopGoods goods : goodslist) {
			ShopGoodsInfo info = new ShopGoodsInfo();
			info.setId(goods.getId());
			info.setGoodsBrandModel(goods.getGoodsBrandModel());
			info.setGoodsClickTimes(goods.getGoodsClickTimes());
			info.setGoodsOldLevel(goods.getGoodsOldLevel());
			info.setGoodsOriginalPrice(goods.getGoodsOriginalPrice());
			info.setGoodsPics(goods.getGoodsPics());
			info.setGoodsPresentPrice(goods.getGoodsPresentPrice());
			info.setGoodsTitle(goods.getGoodsTitle());
			info.setGoodsNums(size);
			info.setGoodsStatus(goods.getGoodsStatus());
			if (goods.getGoodsDiscrible().length() > 120) {
				info.setGoodsDesc(goods.getGoodsDiscrible().substring(0, 120) + "...");
			} else {
				info.setGoodsDesc(goods.getGoodsDiscrible());
			}

			ShopUser seller = shopUserMapper.selectByPrimaryKey(goods.getGoodsSellerId());
			info.setGoodsSellerNickname(seller.getUserNickname());
			info.setGoodsSellerImg(seller.getUserImage());

			SysDict dict = sysDictMapper.selectByPrimaryKey(goods.getGoodsBrandId());
			info.setGoodsBrand(dict.getDictLabel());

			SysArea sysarea = sysAreaMapper.selectByPrimaryKey(goods.getGoodsAreaId());
			info.setGoodsArea(sysarea.getAreaName());

			SysArea sysarea1 = sysAreaMapper.selectByPrimaryKey(sysarea.getAreaParentId());
			info.setGoodsCity(sysarea1.getAreaName());

			SysArea sysarea2 = sysAreaMapper.selectByPrimaryKey(sysarea1.getAreaParentId());
			info.setGoodsProvince(sysarea2.getAreaName());

			list1.add(info);
		}

		Page<ShopGoodsInfo> pages = new Page<ShopGoodsInfo>();
		pages.setList(list1);

		pages.setPageNum(pageNum);

		if ((size % pageSize) == 0) {
			pages.setPages(size / pageSize);

		} else {
			pages.setPages((size / pageSize) + 1);
		}

		pages.setPageSize(pageSize);
		pages.setTotal(size);
		pages.setSize(now_size);

		return pages;
	}

	/**
	 * @desc 查询某一时间段内，上架的商品
	 * @author zsb
	 * @param startDate
	 * @param endDate
	 * @return List<ShopGoods>
	 */
	@Transactional(readOnly = true)
	@Override
	public List<ShopGoods> findGoodsByDate(Date startDate, Date endDate) {
		ShopGoodsExample example = new ShopGoodsExample();
		example.or().andCreateDateBetween(startDate, endDate);
		List<ShopGoods> list = shopGoodsMapper.selectByExample(example);
		return list;
	}

	/**
	 * @desc 根据id，更新某一件商品
	 * @param shopGoods
	 * @return boolean
	 */
	@Transactional(readOnly = false)
	@Override
	public boolean updateGoods(ShopGoods shopGoods) {
		int count = shopGoodsMapper.updateByPrimaryKey(shopGoods);
		if (count > 0) {
			return true;
		}
		return false;
	}

	/**
	 * @desc 根据商品id，删除某一件商品
	 * @param id
	 * @return
	 */
	@Transactional(readOnly = false)
	@Override
	public boolean deleteGoods(String id) {
		int count = shopGoodsMapper.deleteByPrimaryKey(id);
		return true;
	}

	@Transactional(readOnly = true)
	@Override
	public ShopGoodsInfo findGoodsofOnePage(String goods_id) {

		ShopGoods goods = shopGoodsMapper.selectByPrimaryKey(goods_id);
		ShopGoodsInfo info = new ShopGoodsInfo();

		info.setId(goods.getId());
		info.setGoodsBrandModel(goods.getGoodsBrandModel());
		info.setGoodsClickTimes(goods.getGoodsClickTimes());
		info.setGoodsOldLevel(goods.getGoodsOldLevel());
		info.setGoodsOriginalPrice(goods.getGoodsOriginalPrice());
		info.setGoodsPics(goods.getGoodsPics());
		info.setGoodsPresentPrice(goods.getGoodsPresentPrice());
		info.setGoodsTitle(goods.getGoodsTitle());
		info.setGoodsStatus(goods.getGoodsStatus());
		info.setGoodsDesc(goods.getGoodsDiscrible());

		ShopUser seller = shopUserMapper.selectByPrimaryKey(goods.getGoodsSellerId());
		info.setGoodsSellerNickname(seller.getUserNickname());
		info.setGoodsSellerImg(seller.getUserImage());
		info.setGoodsSellerAutograph(seller.getUserAutograph());

		SysDict dict = sysDictMapper.selectByPrimaryKey(goods.getGoodsBrandId());
		info.setGoodsBrand(dict.getDictLabel());

		SysArea sysarea = sysAreaMapper.selectByPrimaryKey(goods.getGoodsAreaId());
		info.setGoodsArea(sysarea.getAreaName());

		SysArea sysarea1 = sysAreaMapper.selectByPrimaryKey(sysarea.getAreaParentId());
		info.setGoodsCity(sysarea1.getAreaName());

		SysArea sysarea2 = sysAreaMapper.selectByPrimaryKey(sysarea1.getAreaParentId());
		info.setGoodsProvince(sysarea2.getAreaName());

		return info;
	}

	@Transactional(readOnly = true)
	@Override
	public List<ShopGoodsInfo> findRecommendGoods(String uid) {

		ShopGoodsExample sge = new ShopGoodsExample();
		ShopGoodsExample.Criteria cri = sge.createCriteria();
		sge.setLimit(15);
		List<ShopGoods> goodslist = shopGoodsMapper.selectByExampleWithBLOBs(sge);
		List<ShopGoodsInfo> list1 = new ArrayList<ShopGoodsInfo>();

		for (ShopGoods goods : goodslist) {
			ShopGoodsInfo info = new ShopGoodsInfo();
			info.setId(goods.getId());
			info.setGoodsBrandModel(goods.getGoodsBrandModel());
			info.setGoodsClickTimes(goods.getGoodsClickTimes());
			info.setGoodsOldLevel(goods.getGoodsOldLevel());
			info.setGoodsOriginalPrice(goods.getGoodsOriginalPrice());
			info.setGoodsPics(goods.getGoodsPics());
			info.setGoodsPresentPrice(goods.getGoodsPresentPrice());
			info.setGoodsTitle(goods.getGoodsTitle());
			info.setGoodsStatus(goods.getGoodsStatus());
			if (goods.getGoodsDiscrible().length() > 120) {
				info.setGoodsDesc(goods.getGoodsDiscrible().substring(0, 120) + "...");
			} else {
				info.setGoodsDesc(goods.getGoodsDiscrible());
			}
			ShopUser seller = shopUserMapper.selectByPrimaryKey(goods.getGoodsSellerId());
			info.setGoodsSellerNickname(seller.getUserNickname());
			info.setGoodsSellerImg(seller.getUserImage());

			SysDict dict = sysDictMapper.selectByPrimaryKey(goods.getGoodsBrandId());
			info.setGoodsBrand(dict.getDictLabel());

			SysArea sysarea = sysAreaMapper.selectByPrimaryKey(goods.getGoodsAreaId());
			info.setGoodsArea(sysarea.getAreaName());

			SysArea sysarea1 = sysAreaMapper.selectByPrimaryKey(sysarea.getAreaParentId());
			info.setGoodsCity(sysarea1.getAreaName());

			SysArea sysarea2 = sysAreaMapper.selectByPrimaryKey(sysarea1.getAreaParentId());
			info.setGoodsProvince(sysarea2.getAreaName());

			list1.add(info);
		}
		return list1;

	}

}
