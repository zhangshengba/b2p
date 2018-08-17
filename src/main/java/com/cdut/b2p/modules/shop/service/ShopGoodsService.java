package com.cdut.b2p.modules.shop.service;

import java.util.List;

import com.cdut.b2p.common.po.Page;
import com.cdut.b2p.modules.shop.po.ShopGoods;
import com.cdut.b2p.modules.shop.po.ShopGoodsInfo;
import com.cdut.b2p.modules.sys.po.SysDict;

public interface ShopGoodsService {

	public Integer addGoodsCountByMonth();

	public void save(ShopGoods shopGoods);
	
	public List<SysDict> findAllBrandByGoodsType(String goods_type);

	public List<SysDict> findAllDict();
	
	public List<ShopGoods> findAllGoods();
	
	public Page<ShopGoodsInfo> findGoodsofOnePage(String type,String brand,
			Integer min_price,Integer max_price,
			String area,Integer pageNum,Integer pageSize);
}
