package com.cdut.b2p.modules.sys.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @desc   有关管理员用户的处理类
 * @author zsb
 * @Date   2018/8/14
 *
 */
@Controller
@RequestMapping("admin")
public class SysUserController {
	@RequestMapping("/register")
	public String register() {
		return "modules/sys/register";
	}
}
