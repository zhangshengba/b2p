package com.cdut.b2p.modules.shop.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdut.b2p.common.controller.BaseController;
import com.cdut.b2p.common.utils.CacheUtils;
import com.cdut.b2p.common.utils.EmailUtils;
import com.cdut.b2p.common.utils.MacUtils;
import com.cdut.b2p.common.utils.NetWorkUtils;
import com.cdut.b2p.common.utils.StringUtils;
import com.cdut.b2p.common.utils.TimestampUtils;
import com.cdut.b2p.common.utils.ValidateUtils;
import com.cdut.b2p.modules.shop.security.annotation.ShopAuth;
import com.cdut.b2p.modules.shop.service.ShopUserService;

@Controller
@RequestMapping("${shopPath}/")
public class ShopUserController extends BaseController {
	
	@Autowired
	private ShopUserService shopUserService;

	/**
	 * 用户信息
	 */
    @ShopAuth
	@RequestMapping(value = "user/info", method = RequestMethod.POST)
	public String info(HttpServletRequest request, HttpServletResponse response, Model model) {

		return renderString(response, model);

	}

	/**
	 * 用户登录
	 */
	@RequestMapping(value = "user/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		return renderString(response, model);

	}

	/**
	 * 用户注册
	 */
	@RequestMapping(value = "user/reg", method = RequestMethod.POST)
	public String reg(HttpServletRequest request, HttpServletResponse response, 
			String emailcode, String email, String username
			, String password, String nickname) {
		try {
			String mac = MacUtils.getMac();
			String ip = NetWorkUtils.getIpAddress(request);
			String id = ip + mac + "regEmailCode";
			String code = (String) CacheUtils.get(id);
			if (code != null && code.equals(emailcode)
					&&ValidateUtils.validateUsername(username) 
					&& ValidateUtils.validatePwd(password)
					&& ValidateUtils.validateText(nickname,2,10)) {
				shopUserService.regUser(username,password,nickname,email);
			}

		} catch (Exception e) {
			return renderErrorString(response, "注册失败");
		}
		return renderSuccessString(response, "注册成功");
	}

	/**
	 * 用户注册时发送
	 */
	@RequestMapping(value = "user/reg/sendEmail", method = RequestMethod.POST)
	public String sendEmail(HttpServletRequest request, HttpServletResponse response,
			String email) {
		try {
			String mac = MacUtils.getMac();
			String ip = NetWorkUtils.getIpAddress(request);
			String id = ip + mac + "regEmailCode";
			String code = (String) CacheUtils.get(id);
			if (code != null && !StringUtils.isBlank(code)) {
				Long t =  (Long) CacheUtils.get(id + "time");
				if(!TimestampUtils.IsAfter(t)) {
					return renderErrorString(response, "已经发送邮件,请等待五分钟");
				}
			}
			String regEmailCode = StringUtils.genRandomStringOfInt(6);
			Long time = TimestampUtils.timeAfter(5);
			CacheUtils.put(id, regEmailCode);
			CacheUtils.put(id + "time", time);
			EmailUtils.Send(email, StringUtils.genRandomStringOfInt(6), "注册验证码");

		} catch (Exception e) {
			return renderErrorString(response, "发送邮件失败");
		}
		return renderSuccessString(response, "发送邮件成功");
	}
}
