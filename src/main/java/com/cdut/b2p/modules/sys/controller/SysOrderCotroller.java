package com.cdut.b2p.modules.sys.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cdut.b2p.common.controller.BaseController;
import com.cdut.b2p.common.utils.DateUtils;
import com.cdut.b2p.modules.shop.po.ShopOrder;
import com.cdut.b2p.modules.shop.service.ShopOrderService;

/**
 * @title SysOrderCotroller
 * @desc SysOrderCotroller类是有关商品订单的处理类
 * @author zsb
 *
 */
@Controller
@RequestMapping("${sysPath}/admin/orders")
public class SysOrderCotroller extends BaseController{
	@Autowired
	private ShopOrderService shopOrderService;
	/**
	 * @desc 查询所有的商品订单
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/all",method=RequestMethod.POST)
	public String getAll(HttpServletResponse response) {
		ModelAndView model=new ModelAndView();
		List<ShopOrder> list=shopOrderService.findAllOrder();
		model.addObject("OrderList", list);
		return renderString(response, model);
	}
	public String getOrderByDate(HttpServletResponse response,HttpServletRequest request) {
		ModelAndView model=new ModelAndView();
		Date startDate=DateUtils.parseDate(request.getParameter("startDate"));
		Date endDate=DateUtils.parseDate(request.getParameter("endDate"));
		List<ShopOrder> list=shopOrderService.findOrderByDate(startDate, endDate);
		return renderString(response, model);
	}
}
