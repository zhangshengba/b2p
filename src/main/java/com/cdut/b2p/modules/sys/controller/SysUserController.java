package com.cdut.b2p.modules.sys.controller;


import java.util.Date;
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
	public String  login(HttpServletResponse response,HttpServletRequest request,SysUser sysUser) {
		ModelAndView model=new ModelAndView();
		/*
		Model层
		在注入对象时，首先会将其加载到Model层；再到传入目标处理方法中
		*/
		SysUser user=sysUserService.findSysUser(sysUser);
		if(user!=null) {
			SysLogWithBLOBs sysLog=new SysLogWithBLOBs();
			sysLog.setLogRemoteAddr(request.getRemoteAddr());
			sysLog.setLogRequestUri(request.getRequestURL().toString());
			sysLog.setCreateDate(new Date());
			 sysLogService.addSysLog(sysLog);
			//登录成功，记录登录日志
			//将用户保存到Session中
			request.getSession().setAttribute("SYSUSER", user);
			model.addObject("Message", "index");
			return renderString(response, model);
		}
		//表示账号或邮箱密码错误
		//map.put("error", "login");
		
		model.addObject("Message", "error");
		return renderString(response, model);
	}
	/**
	 * @desc 用户【管理员】注册处理
	 * @param response
	 * @param model
	 * @param sysUser
	 * @return
	 */
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(HttpServletResponse response,SysUser sysUser) {
		ModelAndView model=new ModelAndView();
		System.out.println("注册信息:"+sysUser);
		
		if(sysUser.getUserImage()==null||sysUser.getUserImage()=="") {
			sysUser.setUserImage("../dist/img/user2-160x160.jpg");
		}
		System.out.println("注册信息:"+sysUser);
		int count = sysUserService.addSysUser(sysUser);
		if(count!=0) {
			model.addObject("Message", "index");
			return renderString(response, model);
		}
		//表示表示注册信息失败
		model.addObject("Message","error");
		return renderString(response, model);
	}
	/**
	 * @desc 系统用户进入操作首页，进行查询相关信息
	 * 个人信息【】
	 * 新增订单信息【】
	 * 新增商品【】
	 * 新增注册用户【】
	 * 新增浏览用户【】
	 * 商品销售趋势表【】
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String Index(HttpServletResponse response,HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		//取出该回话过程中的用户信息
		SysUser user=(SysUser) request.getSession().getAttribute("SYSUSER");
		modelAndView.addObject("User", user);
		//查询新增的用户数
		//查询新增的商品数
		//查询新增的订单数
		//查询新增的浏览用户数
		//统计价格趋势表
		return renderString(response, modelAndView);
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
