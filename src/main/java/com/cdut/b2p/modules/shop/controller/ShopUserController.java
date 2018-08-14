package com.cdut.b2p.modules.shop.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cdut.b2p.common.controller.BaseController;
import com.cdut.b2p.modules.shop.service.ShopUserService;

@Controller
public class ShopUserController extends BaseController{

	@Autowired
	private ShopUserService shopUserService;

	/**
	 * 用户登录
	 */
	@RequestMapping(value = "${shopPath}/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("user login");
		model.addAttribute("1","1");
		return renderString(response, model);
	}

}
