package com.cdut.b2p.modules.shop.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cdut.b2p.common.controller.BaseController;
import com.cdut.b2p.modules.shop.po.ShopUser;
import com.cdut.b2p.modules.shop.service.ShopUserService;

@Controller
public class ShopUserController {

	@Autowired
	private ShopUserService shopUserService;

	/**
	 * 用户登录
	 */
	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
		ShopUser su = new ShopUser();
		su.setId("1");
		su.setUserEmail("1");
		su.setUserName("1");
		su.setUserPassword("1");
		su.setUserNickname("1");
		su.setUserEmail("1");
		su.setUserImage("1");
		su.setUserWalletId("1");
		su.setUserScore(1);
		su.setUserStatus("1");
		su.setUpdateBy("1");
		su.setCreateBy("1");
		su.setDelFlag("1");
		su.setCreateDate(new Date());
		su.setUpdateDate(new Date());
		shopUserService.saveUser(su);

		return "modules/error/400";
	}

}
