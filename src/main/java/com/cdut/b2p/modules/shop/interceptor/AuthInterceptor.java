package com.cdut.b2p.modules.shop.interceptor;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.cdut.b2p.common.security.annotation.Auth;
import com.cdut.b2p.common.utils.JsonUtils;
import com.cdut.b2p.common.utils.StringUtils;

public class AuthInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		if (handler.getClass().isAssignableFrom(HandlerMethod.class)) {
			Auth auth = ((HandlerMethod) handler).getMethodAnnotation(Auth.class);
			if (auth == null || auth.validate() == false)
				return true;
			else {
				HttpSession session = request.getSession();
				String uid = (String) session.getAttribute("shopUser");
				if (uid == null || StringUtils.isBlank(uid)) {
					response.reset();
					response.setContentType("application/json");
					response.setCharacterEncoding("utf-8");
					HashMap<Object,Object> map = new HashMap<Object,Object>();
					map.put("status", "1");
					map.put("msg", "用户未登陆");
					map.put("success", false);
					response.getWriter().print(JsonUtils.toJsonString(map));
					return false;
				} else {
					return true;

				}
			}
		} else {
			return true;

		}
	}
}
