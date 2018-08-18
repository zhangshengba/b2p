package com.cdut.b2p.modules.shop.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdut.b2p.common.controller.BaseController;
import com.cdut.b2p.common.utils.CacheUtils;
import com.cdut.b2p.modules.shop.po.ShopChat;
import com.cdut.b2p.modules.shop.po.ShopUser;
import com.cdut.b2p.modules.shop.security.annotation.ShopAuth;
import com.cdut.b2p.modules.shop.service.ShopChatService;
import com.cdut.b2p.modules.shop.service.ShopUserService;
import com.cdut.b2p.modules.shop.websocket.po.Message;

@Controller
public class ShopChatController extends BaseController {
	
	@Autowired
	private ShopChatService shopChatService;
	
	@Autowired
	private ShopUserService shopUserService;

	@ShopAuth
	@RequestMapping(value = "chat/message/get", method = RequestMethod.POST)
	public String getMessage(HttpServletRequest request, HttpServletResponse response,String
			from_id) {
		
		String uid = (String) request.getAttribute("uid");
		List<Message> list = (List<Message>) CacheUtils.get("chat_cache_" 
				+ from_id +"_"+ uid);
		if(list == null) {
			List<ShopChat> list1 = shopChatService.findChatByFromTo(from_id, uid);
			list = new ArrayList<Message>();
			ShopUser from = (ShopUser) CacheUtils.get("user_" + from_id);
			if(from == null) {
				from = shopUserService.findUserById(from_id);
			}
			ShopUser to = (ShopUser) CacheUtils.get("user_" + uid);
			if(to == null) {
				to = shopUserService.findUserById(uid);
			}
			
			for(ShopChat chat : list1) {
				Message msg = new Message();
				msg.setFrom_id(from_id);
				msg.setTo_id(uid);
				msg.setDate(chat.getCreateDate());
				msg.setMsg(chat.getChatMessage());
				msg.setType(chat.getChatType());
				msg.setFrom_img(from.getUserImage());
				msg.setFrom_name(from.getUserNickname());
				msg.setTo_name(to.getUserNickname());
				msg.setTo_img(to.getUserImage());
				
				list.add(msg);
			}
		}

		return renderSuccessString(response, "获取消息成功",list);

	}
	
	@ShopAuth
	@RequestMapping(value = "chat/message/list", method = RequestMethod.POST)
	public String getMessage1(HttpServletRequest request, HttpServletResponse response) {
		String uid = (String) request.getAttribute("uid");
		
		List<String> list = (List<String>) CacheUtils.get("chat_cache_" + uid);
		if(list == null) {
			list = shopChatService.findChatByFromOrTo(uid);
		}
		
		List<Message> list1 = new ArrayList<Message>();
		for(String s : list) {
			Message msg = new Message();
			ShopUser u = (ShopUser) CacheUtils.get("user_" + s);
			if(u == null) {
				u = shopUserService.findUserById(s);
			}
			if(!s.equals(uid)) {
				msg.setTo_id(s);
				msg.setTo_img(u.getUserImage());
				msg.setTo_name(u.getUserNickname());
			}
			list1.add(msg);
		}

		return renderSuccessString(response, "获取列表成功",list1);
	}


}
