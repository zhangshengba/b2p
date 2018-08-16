package com.cdut.b2p.modules.shop.service;

import java.util.Date;
import java.util.List;


import com.cdut.b2p.modules.shop.po.ShopOrder;

public interface ShopOrderService {
	/**
	 * @desc 上一个月成交的订单数量
	 * @author zsb
	 */
	public Integer addOrdersCountByMonth();
	/**
	 * @desc 查询某一时间段内的用户订单
	 * @author zsb
	 * @param startDate
	 * @param enDate
	 * @return
	 */
	public List<ShopOrder> findOrderByDate(Date startDate,Date enDate);
	/**
	 * @desc 查询生成的所有订单
	 * @author zsb
	 * @return
	 */
	public List<ShopOrder> findAllOrder();
	/**
	 * @desc 根据id，更新相应的订单信息
	 * @author zsb
	 * @param shopOrder
	 * @return
	 */
	public boolean updateOrder(ShopOrder shopOrder);
	/**
	 * @desc 根据id，删除相应的订单
	 * @author zsb
	 * @param id
	 * @return
	 */
	boolean deleteOrder(String id);
}
