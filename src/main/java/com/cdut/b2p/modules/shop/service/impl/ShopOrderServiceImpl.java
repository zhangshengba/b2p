package com.cdut.b2p.modules.shop.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.io.filefilter.FalseFileFilter;
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
	@SuppressWarnings("deprecation")
	@Transactional(readOnly=true)
	@Override
	public Integer addOrdersCountByMonth() {
		Date date=new Date();
		int year=date.getYear()>100?2000+date.getYear()%100:date.getYear();
		int month=date.getMonth();
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
	/**
	 * @desc 查询某一时间段内的用户订单
	 * @author zsb
	 * @param startDate
	 * @param enDate
	 * @return
	 */
	@Transactional(readOnly=true)
	@Override
	public List<ShopOrder> findOrderByDate(Date startDate, Date enDate) {
		ShopOrderExample example=new ShopOrderExample();
		example.or().andCreateDateBetween(startDate, enDate);
		List<ShopOrder> list=shopOrderMapper.selectByExample(example);
		return list;
	}
	/**
	 * @desc 查询生成的所有订单
	 * @author zsb
	 * @return
	 */
	@Transactional(readOnly=true)
	@Override
	public List<ShopOrder> findAllOrder() {
		ShopOrderExample example=new ShopOrderExample();
		List<ShopOrder> list=shopOrderMapper.selectByExample(example);
		return list;
	}
	/**
	 * @desc 根据id，更新相应的订单信息
	 * @author zsb
	 * @param shopOrder
	 * @return
	 */
	@Transactional(readOnly=false)
	@Override
	public boolean updateOrder(ShopOrder shopOrder) {
		int count=shopOrderMapper.updateByPrimaryKey(shopOrder);
		if(count>0) {
			return true;
		}
		return false;
	}
	/**
	 * @desc 根据id，删除相应的订单
	 * @author zsb
	 * @param id
	 * @return
	 */
	@Transactional(readOnly=false)
	@Override
	public boolean deleteOrder(String id) {
		int count=shopOrderMapper.deleteByPrimaryKey(id);
		if(count>0) {
			return true;
		}
		return false;
	}

}
