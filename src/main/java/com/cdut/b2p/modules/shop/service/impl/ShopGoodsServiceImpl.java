package com.cdut.b2p.modules.shop.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdut.b2p.common.utils.IdUtils;
import com.cdut.b2p.common.utils.StringUtils;
import com.cdut.b2p.modules.shop.mapper.ShopGoodsMapper;
import com.cdut.b2p.modules.shop.mapper.ShopUserMapper;
import com.cdut.b2p.modules.shop.po.ShopGoods;
import com.cdut.b2p.modules.shop.po.ShopUser;
import com.cdut.b2p.modules.shop.service.ShopGoodsService;
import com.cdut.b2p.modules.shop.utils.ShopUserUtils;

@Service
@Transactional
public class ShopGoodsServiceImpl implements ShopGoodsService{
	
	@Autowired
	private ShopGoodsMapper shopGoodsMapper;
	
	private void preInsert(ShopGoods shopGoods) {
		if (shopGoods.getId() == null || StringUtils.isBlank(shopGoods.getId())) {
			shopGoods.setId(IdUtils.uuid());
		}
		ShopUser user = ShopUserUtils.getUser();
		if(user == null) {
			user = new ShopUser();
		}
		if (StringUtils.isNotBlank(user.getId())) {
			shopGoods.setUpdateBy(user.getId());
			shopGoods.setCreateBy(user.getId());
		}
		shopGoods.setUpdateDate(new Date());
		shopGoods.setCreateDate(shopGoods.getUpdateDate());
	}
	
	@Transactional(readOnly = false)
	@Override
	public void save(ShopGoods shopGoods) {
		preInsert(shopGoods);
		shopGoodsMapper.insertSelective(shopGoods);
	}


}
