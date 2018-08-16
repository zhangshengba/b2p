package com.cdut.b2p.modules.sys.controller;

import java.util.Date;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cdut.b2p.common.controller.BaseController;
import com.cdut.b2p.modules.shop.service.ShopGoodsService;
import com.cdut.b2p.modules.shop.service.ShopOrderService;
import com.cdut.b2p.modules.shop.service.ShopUserService;
import com.cdut.b2p.modules.sys.po.SysUser;
import com.cdut.b2p.modules.sys.service.SysLogService;
import com.cdut.b2p.modules.sys.service.SysUserService;
import com.sun.org.apache.bcel.internal.generic.Select;

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
	private ShopUserService shopUserService;//外部用户服务接口
	@Autowired
	private ShopGoodsService shopGoodsService;//商品服务接口
	@Autowired
	private ShopOrderService shopOrderService;//订单服务接口
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
			/*
			SysLogWithBLOBs sysLog=new SysLogWithBLOBs();
			sysLog.setLogRemoteAddr(request.getRemoteAddr());
			sysLog.setLogRequestUri(request.getRequestURL().toString());
			sysLog.setCreateDate(new Date());
			*/
			String url=request.getRequestURL().toString();
			String remoteAddr=request.getRemoteAddr();
			sysLogService.addSysLog(url,remoteAddr);
			//登录成功，记录登录日志
			//将用户保存到Session中
			request.getSession().setAttribute("SYSUSER", user);
			model.addObject("SYSUSER", user);
			model.addObject("Message", "index");
			System.out.println("login success");
			System.out.println("sessionId:"+request.getSession().getId());
			System.out.println(request.getSession().getAttribute("SYSUSER"));
			
			response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
			response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
			response.setHeader("Access-Control-Max-Age", "3600");
			response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
			response.setHeader("Access-Control-Allow-Credentials", "true"); // 是否支持cookie跨域
			
			
			
			
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
	public String register(HttpServletResponse response,HttpSession session,SysUser sysUser) {
		ModelAndView model=new ModelAndView();
		System.out.println("注册信息:"+sysUser);
		int count = sysUserService.addSysUser(sysUser);
		if(count!=0) {
			session.setAttribute("SYSUSER",sysUser);
			model.addObject("Message", "index");
			//输出sessionid
			System.out.println(session.getId());
			return renderString(response, model);
		}
		//表示表示注册信息失败
		model.addObject("Message","error");
		System.out.println("返回error");
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
		System.out.println("sessionId:"+request.getSession().getId());
		System.out.println(request.getSession().getAttribute("SYSUSER"));
		
		ModelAndView model=new ModelAndView();
		//取出该回话过程中的用户信息
		SysUser user=(SysUser) request.getSession().getAttribute("SYSUSER");
		model.addObject("User", user);
		//查询新增的用户数[一个月时间之内]
		Integer increUsers=shopUserService.addUserCountByMonth();
		//查询新增的商品数[一个月时间之内]
		Integer increGoods=shopGoodsService.addGoodsCountByMonth();
		//查询新增的订单数[一个月时间之内]
		Integer increOrders=shopOrderService.addOrdersCountByMonth();
		//查询新增的浏览用户数[一个月时间之内,即没有上传商品或者购买商品]
		Integer increVisitors=shopUserService.addVistorCountByMonth();
		//统计商品趋势表[一个月时间之内]
		model.addObject("IncreUsers", increUsers);
		model.addObject("IncreGoods", increGoods);
		model.addObject("IncreOrders", increOrders);
		model.addObject("IncreVisitors", increVisitors);
		return renderString(response, model);
	}
	/**
	 * @desc 通过时间段查询注册用户信息
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/selectByDate", method = RequestMethod.POST)
	public String selectByDate(HttpServletResponse response,HttpServletRequest request) {
		Date startDate=new Date((String)request.getAttribute("startDate"));
		Date enDate=new Date((String)request.getAttribute("endDate"));
		
		return null;
	}
	/**
	 * @desc 根据用户的详细信息查询某个用户
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/selectByUser", method = RequestMethod.POST)
	public String selectByUser(HttpServletResponse response) {
		return null;
	}
	
	
	
	
	@RequestMapping(value="/exit",method = RequestMethod.GET)
	public String exit(HttpServletResponse response ,HttpServletRequest request,Model model) {
		/*清空Session中缓存的数据*/
		request.getSession().invalidate();
		model.addAttribute("Message", "exit");
		return renderString(response, model);
	}
	/**s
	 * @desc 测试用例
	 */
	@RequestMapping(value="test",method = RequestMethod.GET)
	public String test() {
		System.out.println("测试成功！");
		return null;
	}
}
