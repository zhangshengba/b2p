package com.cdut.b2p.modules.sys.controller;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdut.b2p.common.controller.BaseController;
import com.cdut.b2p.modules.shop.service.impl.TestService;
import com.cdut.b2p.modules.sys.po.SysArea;
import com.cdut.b2p.modules.sys.service.SysAreaService;

@Controller
@RequestMapping("${sysPath}/")
public class SysAreaController extends BaseController{
	
	@Autowired
	private SysAreaService sysAreaService;
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "init", method = RequestMethod.POST)
	public String init(HttpServletRequest request, HttpServletResponse response, Model model) {
		//testService.start();
		return renderString(response, model);

	}
	

}
