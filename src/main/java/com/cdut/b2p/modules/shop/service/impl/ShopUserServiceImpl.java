package com.cdut.b2p.modules.shop.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdut.b2p.common.utils.IdUtils;
import com.cdut.b2p.common.utils.StringUtils;
import com.cdut.b2p.modules.shop.mapper.ShopUserMapper;
import com.cdut.b2p.modules.shop.mapper.ShopWalletMapper;
import com.cdut.b2p.modules.shop.po.ShopUser;
import com.cdut.b2p.modules.shop.po.ShopUserExample;
import com.cdut.b2p.modules.shop.po.ShopWallet;
import com.cdut.b2p.modules.shop.service.ShopUserService;
import com.cdut.b2p.modules.shop.utils.ShopUserUtils;
import com.cdut.b2p.modules.sys.po.SysDict;
import com.cdut.b2p.modules.sys.po.SysDictExample;
import com.cdut.b2p.modules.sys.po.SysUser;
import com.cdut.b2p.modules.sys.utils.SysUserUtils;

@Service
@Transactional
public class ShopUserServiceImpl implements ShopUserService{
	
	@Autowired
	private ShopUserMapper shopUserMapper;
	@Autowired
	private ShopWalletMapper shopWalletMapper;
	
	private void preInsertWallet(ShopWallet shopWallet) {
		if (shopWallet.getId() == null || StringUtils.isBlank(shopWallet.getId())) {
			shopWallet.setId(IdUtils.uuid());
		}
		ShopUser user = ShopUserUtils.getUser();
		if(user == null) {
			user = new ShopUser();
		}
		if (StringUtils.isNotBlank(user.getId())) {
			shopWallet.setUpdateBy(user.getId());
			shopWallet.setCreateBy(user.getId());
		}
		shopWallet.setUpdateDate(new Date());
		shopWallet.setCreateDate(shopWallet.getUpdateDate());
	}
	
	private void preInsertUser(ShopUser shopUser) {
		if (shopUser.getId() == null || StringUtils.isBlank(shopUser.getId())) {
			shopUser.setId(IdUtils.uuid());
		}
		ShopUser user = ShopUserUtils.getUser();
		if(user == null) {
			user = new ShopUser();
		}
		if (StringUtils.isNotBlank(user.getId())) {
			shopUser.setUpdateBy(user.getId());
			shopUser.setCreateBy(user.getId());
		}
		shopUser.setUpdateDate(new Date());
		shopUser.setCreateDate(shopUser.getUpdateDate());
	}
	
	@Transactional(readOnly = false)
	@Override
	public void saveUser(ShopUser shopUser) {
		preInsertUser(shopUser);
		shopUserMapper.insertSelective(shopUser);
	}

	@Transactional(readOnly = false)
	@Override
	public void saveWallet(ShopWallet shopWallet) {
		preInsertWallet(shopWallet);
		shopWalletMapper.insertSelective(shopWallet);
	}

	@Transactional(readOnly = true)
	@Override
	public ShopUser findUserByUsername(String username) {
		ShopUserExample sue = new ShopUserExample();
		sue.or().andUserNameEqualTo(username);
		return shopUserMapper.selectByExample(sue).get(0);
	}

}
