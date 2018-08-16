package com.cdut.b2p.modules.shop.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

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
		Map<Object,Object> map = ShopUserUtils.getMap();
		ShopUser user = (ShopUser) map.get("user");
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
		Map<Object,Object> map = ShopUserUtils.getMap();
		ShopUser user = (ShopUser) map.get("user");
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
	/**
	 * @desc 查询上一个月增加的用户数
	 */
	@Override
	public Integer addUserCountByMonth() {
		Date date=new Date();
		int year=date.getYear()>100?2000+date.getYear()%100:date.getYear();
		int month=date.getMonth();
		int day=date.getDate();
		//上一月的开始时间[默认为每月的时间为31天]
		Date startDate=new Date(year,month,1);
		//上一月的结束时间
		Date endDate=new Date(year,month,31);
		//
		ShopUserExample example=new ShopUserExample();
		example.or().andCreateDateBetween(startDate, endDate);
		List<ShopUser> list=shopUserMapper.selectByExample(example);
		return list.size();
	}
	/**
	 * @desc 查询上一个月内，浏览网站的游客数量【只注册了，为进行商品买卖行为】
	 * @author zsb
	 * @return
	 */
	@Override
	public Integer addVistorCountByMonth() {
		Date date=new Date();
		int year=date.getYear()>100?2000+date.getYear()%100:date.getYear();
		int month=date.getMonth();
		int day=date.getDate();
		//上一月的开始时间[默认为每月的时间为31天]
		Date startDate=new Date(year,month,1);
		//上一月的结束时间
		Date endDate=new Date(year,month,31);
		//进行查询(仔细思考)
		
		return 100;
	}

}
