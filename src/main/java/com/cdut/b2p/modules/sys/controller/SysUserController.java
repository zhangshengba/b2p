package com.cdut.b2p.modules.sys.controller;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cdut.b2p.common.controller.BaseController;
import com.cdut.b2p.modules.sys.po.SysLogWithBLOBs;
import com.cdut.b2p.modules.sys.po.SysUser;
import com.cdut.b2p.modules.sys.service.SysLogService;
import com.cdut.b2p.modules.sys.service.SysUserService;

/**
 * @desc   有关管理员用户的处理类
 * @author zsb
 * @Date   2018/8/14
 *
 */
@Controller
@RequestMapping("${sysPath}/admin")
public class SysUserController extends BaseController{
	@Autowired
	private SysUserService sysUserService;//管理员用户服务接口
	@Autowired
	private SysLogService sysLogService;//管理员日志服务接口
	/**
	 * @desc 用户【管理员】登录处理
	 * @param response
	 * @param model
	 * @param sysUser
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String  login(HttpServletResponse response,HttpServletRequest request,Model model,SysUser sysUser) {
		System.out.println(model.containsAttribute("sysUser"));
		/*
		Model层
		在注入对象时，首先会将其加载到Model层；再到传入目标处理方法中
		*/
		System.out.println("用户登录测试："+sysUser);
		SysUser user=sysUserService.findSysUser(sysUser);
		ModelAndView modelAndView=new ModelAndView();
		if(user!=null) {
			SysLogWithBLOBs sysLog=new SysLogWithBLOBs();
			sysLog.setLogRemoteAddr(request.getRemoteAddr());
			sysLog.setLogRequestUri(request.getRequestURL().toString());
			sysLog.setCreateDate(new Date());
			 sysLogService.addSysLog(sysLog);
			//登录成功，记录登录日志
			//将用户保存到Session中
			request.getSession().setAttribute("SYSUSER", user);
			modelAndView.addObject("register", "register");
			return renderString(response, model);
		}
		//表示账号或邮箱密码错误
		//map.put("error", "login");
		
		modelAndView.addObject("error", "login");
		return renderString(response, modelAndView);
	}
	/**
	 * @desc 用户【管理员】注册处理
	 * @param response
	 * @param model
	 * @param sysUser
	 * @return
	 */
	@RequestMapping(value = "${sysPath}/register", method = RequestMethod.POST)
	public String register(HttpServletResponse response,SysUser sysUser) {
		ModelAndView model=new ModelAndView();
		int count = sysUserService.addSysUser(sysUser);
		if(count!=0) {
			model.addObject("index", "index");
			return renderString(response, model);
		}
		//表示表示注册信息错误
		model.addObject("error","register");
		return renderString(response, model);
	}

	/**s
	 * @desc 测试用例
	 */
	@RequestMapping("/test")
	public String test() {
		System.out.println("测试成功！");
		return null;
	}
}
