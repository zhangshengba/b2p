package com.cdut.b2p.modules.shop.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.cdut.b2p.common.controller.BaseController;
import com.cdut.b2p.common.utils.EmailUtils;
import com.cdut.b2p.modules.shop.po.ShopUser;
import com.cdut.b2p.modules.shop.service.ShopUserService;
import com.cdut.b2p.modules.shop.service.impl.TestService;
import com.cdut.b2p.modules.shop.utils.ShopCacheUtils;

@Controller
@RequestMapping("${shopPath}/")
public class ShopUserController extends BaseController{

	@Autowired
	private ShopUserService shopUserService;

	/**
	 * 用户登录
	 */

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		return renderString(response, model);

	}
	
	/**
	 * 用户注册
	 */
	@RequestMapping(value = "reg", method = RequestMethod.POST)
	public String reg(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		return renderString(response, model);

	}
	
	/**
	 * 用户注册时邮箱验证
	 */
	@RequestMapping(value = "reg/validateEmail", method = RequestMethod.POST)
	public String validateEmail(HttpServletRequest request, HttpServletResponse response, Model model,
			String email) {
		
		//EmailUtils.Send(receiveMailAccount, text, title);
		
		return renderString(response, model);
	}

}
