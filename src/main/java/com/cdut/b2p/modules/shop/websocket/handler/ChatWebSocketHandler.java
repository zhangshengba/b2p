package com.cdut.b2p.modules.shop.websocket.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.cdut.b2p.common.utils.CacheUtils;
import com.cdut.b2p.common.utils.JsonUtils;
import com.cdut.b2p.modules.shop.po.ShopUser;
import com.cdut.b2p.modules.shop.service.ShopUserService;
import com.cdut.b2p.modules.shop.websocket.po.Message;

import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;

@Component
public class ChatWebSocketHandler implements WebSocketHandler {
	private static final Map<String, WebSocketSession> userSocketSessionMap = new ConcurrentHashMap<String, WebSocketSession>();
	private static Logger logger = LoggerFactory.getLogger(ChatWebSocketHandler.class);
	
	@Autowired
	private ShopUserService shopUserService;
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		Iterator<Entry<String, WebSocketSession>> it = userSocketSessionMap.entrySet().iterator();
		// 移除Socket会话
		while (it.hasNext()) {
			Entry<String, WebSocketSession> entry = it.next();
			if (entry.getValue().getId().equals(session.getId())) {
				userSocketSessionMap.remove(entry.getKey());
				logger.debug("Socket会话已经移除:用户ID" + entry.getKey());
				break;
			}
		}
	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		String uid = (String) session.getAttributes().get("uid");
		if (userSocketSessionMap.get(uid) == null) {
			userSocketSessionMap.put(uid, session);
		}
	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable throwable) throws Exception {
		if (session.isOpen()) {
			session.close();
		}
		Iterator<Entry<String, WebSocketSession>> it = userSocketSessionMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, WebSocketSession> entry = it.next();
			if (entry.getValue().getId().equals(session.getId())) {
				userSocketSessionMap.remove(entry.getKey());
				logger.error("Socket会话已经移除:用户ID"+ entry.getKey(),throwable);
				break;
			}
		}
		
	}
	
	@Override
	public boolean supportsPartialMessages() {
		
		return false;
	}
 
	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> msg) throws Exception {
		if(msg.getPayloadLength()==0) {
			return;
		}
		String uid = (String) session.getAttributes().get("uid");
		Message message = (Message) JsonUtils.fromJsonString(
				msg.getPayload().toString(), Message.class);
		message.setFrom_id(uid);
		ShopUser from = (ShopUser) CacheUtils.get("user_" + message.getFrom_id());
		if(from == null) {
			from = shopUserService.findUserById(message.getFrom_id());
		}
		ShopUser to = (ShopUser) CacheUtils.get("user_" + message.getTo_id());
		if(to == null) {
			to = shopUserService.findUserById(message.getTo_id());
		}
		
		message.setFrom_img(from.getUserImage());
		message.setFrom_name(from.getUserNickname());
		message.setTo_name(to.getUserNickname());
		message.setTo_img(to.getUserImage());
		message.setDate(new Date());
		
		List<Message> list = (List<Message>) CacheUtils.get("chat_cache_" 
				+ message.getFrom_id() +"_"+message.getTo_id());
		if(list == null) {
			list = new ArrayList<Message>();
		}
		list.add(message);
		CacheUtils.put("chat_cache_" 
					+ message.getFrom_id() +"_"+message.getTo_id(),list);
		
		List<String> list1 = (List<String>) CacheUtils.get("chat_cache_" + message.getFrom_id());
		if(list1 == null) {
			list1 = new ArrayList<String>();
		}
		if(!list1.contains(message.getTo_id())){
			list1.add(message.getTo_id());
		}
		CacheUtils.put("chat_cache_" + message.getFrom_id(),list1);
		
		List<String> list2 = (List<String>) CacheUtils.get("chat_cache_" + message.getTo_id());
		if(list2 == null) {
			list2 = new ArrayList<String>();
		}
		if(!list2.contains(message.getFrom_id())){
			list2.add(message.getFrom_id());
		CacheUtils.put("chat_cache_" + message.getTo_id(),list2);
		
		
		sendMessageToUser(message.getTo_id(), new TextMessage(JsonUtils.toJsonString(message)));
		}
	}

	/**
	 * 给某个用户发送消息
	 * 
	 * @param userName
	 * @param message
	 * @throws IOException
	 */
	public void sendMessageToUser(String uid, TextMessage message)
			throws IOException {
		WebSocketSession session = userSocketSessionMap.get(uid);
		if (session != null && session.isOpen()) {
			session.sendMessage(message);
		}
		
	}
	
	
	
}