package com.cdut.b2p.modules.shop.service;

import com.cdut.b2p.modules.shop.po.ShopGoods;

public interface ShopGoodsService {

	public Integer addGoodsCountByMonth();

	public void save(ShopGoods shopGoods);
}
