package com.cdut.b2p.modules.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdut.b2p.modules.shop.mapper.ShopUserMapper;
import com.cdut.b2p.modules.shop.po.ShopUser;
import com.cdut.b2p.modules.shop.po.ShopUserExample;
import com.cdut.b2p.modules.shop.service.ShopUserService;

@Service
@Transactional
public class ShopUserServiceImpl implements ShopUserService{
	
	@Autowired
	private ShopUserMapper shopUserMapper;
	
	@Transactional(readOnly = false)
	public void saveUser(ShopUser shopUser) {
		ShopUserExample sue = new ShopUserExample();
		sue.or().andUserNicknameEqualTo("1");
		List<ShopUser> list= shopUserMapper.selectByExample(sue);
	}

}
