package com.cdut.b2p.modules.shop.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cdut.b2p.modules.shop.mapper.ShopGoodsMapper;
import com.cdut.b2p.modules.shop.po.ShopGoods;
import com.cdut.b2p.modules.shop.po.ShopGoodsExample;
import com.cdut.b2p.common.utils.IdUtils;
import com.cdut.b2p.common.utils.StringUtils;
import com.cdut.b2p.modules.shop.mapper.ShopGoodsMapper;
import com.cdut.b2p.modules.shop.mapper.ShopUserMapper;
import com.cdut.b2p.modules.shop.po.ShopGoods;
import com.cdut.b2p.modules.shop.po.ShopUser;
import com.cdut.b2p.modules.shop.service.ShopGoodsService;
import com.cdut.b2p.modules.sys.po.SysUser;


@Service
@Transactional
public class ShopGoodsServiceImpl implements ShopGoodsService{
	@Autowired
	private ShopGoodsMapper shopGoodsMapper;
	/**
	 * @desc 查询上一个月每新增加的商品数量
	 * @author zsb
	 * @return
	 */
	@Transactional(readOnly = true)
	@Override
	public Integer addGoodsCountByMonth() {
		Date date=new Date();
		int year=date.getYear()>100?2000+date.getYear()%100:date.getYear();
		int month=date.getMonth();
		int day=date.getDate();
		//上一月的开始时间[默认为每月的时间为31天]
		Date startDate=new Date(year,month,1);
		//上一月的结束时间
		Date endDate=new Date(year,month,31);
		
		ShopGoodsExample shopGoodsExample=new ShopGoodsExample();
		shopGoodsExample.or().andCreateDateBetween(startDate, endDate);
		List<ShopGoods> list=shopGoodsMapper.selectByExample(shopGoodsExample);
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
	}
	/**
	 * @desc 查询所有的商品
	 * @author zsb
	 * @return List<ShopGoods>
	 */
	@Transactional(readOnly = true)
	@Override
	public List<ShopGoods> findAllGoods() {
		ShopGoodsExample example=new  ShopGoodsExample();
		List<ShopGoods> list=shopGoodsMapper.selectByExample(example);
		return list;
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
		ShopGoodsExample example=new  ShopGoodsExample();
		example.or().andCreateDateBetween(startDate, endDate);
		List<ShopGoods> list=shopGoodsMapper.selectByExample(example);
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
		int count=shopGoodsMapper.updateByPrimaryKey(shopGoods);
		if(count>0) {
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
		int count=shopGoodsMapper.deleteByPrimaryKey(id);
		return true;
	}


}
