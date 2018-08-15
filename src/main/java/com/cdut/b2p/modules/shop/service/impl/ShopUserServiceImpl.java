package com.cdut.b2p.modules.shop.service.impl;

import java.util.Date;
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
		
		shopUserMapper.insert(shopUser);
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
