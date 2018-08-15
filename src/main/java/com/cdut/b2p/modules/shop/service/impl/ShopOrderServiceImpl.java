package com.cdut.b2p.modules.shop.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdut.b2p.modules.shop.mapper.ShopOrderMapper;
import com.cdut.b2p.modules.shop.po.ShopOrder;
import com.cdut.b2p.modules.shop.po.ShopOrderExample;
import com.cdut.b2p.modules.shop.service.ShopOrderService;

@Service
@Transactional
public class ShopOrderServiceImpl implements ShopOrderService{
	@Autowired
	private ShopOrderMapper shopOrderMapper;
	/**
	 * @desc 上一个月成交的订单数量
	 * @author zsb
	 */
	@Override
	public Integer addOrdersCountByMonth() {
		Date date=new Date();
		int year=date.getYear()>100?2000+date.getYear()%100:date.getYear();
		int month=date.getMonth();
		int day=date.getDate();
		//上一月的开始时间[默认为每月的时间为31天]
		Date startDate=new Date(year,month,1);
		//上一月的结束时间
		Date endDate=new Date(year,month,31);
		//开始查询
		ShopOrderExample shopOrderExample=new ShopOrderExample();
		shopOrderExample.or().andCreateDateBetween(startDate, endDate);
		List<ShopOrder> list=shopOrderMapper.selectByExample(shopOrderExample);
		return list.size();
	}

}
