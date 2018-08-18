package com.cdut.b2p.modules.shop.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdut.b2p.modules.shop.mapper.ShopChatMapper;
import com.cdut.b2p.modules.shop.po.ShopChat;
import com.cdut.b2p.modules.shop.po.ShopChatExample;
import com.cdut.b2p.modules.shop.po.ShopComment;
import com.cdut.b2p.modules.shop.service.ShopChatService;

@Service
@Transactional
public class ShopChatServiceImpl implements ShopChatService{
	@Autowired
	private ShopChatMapper shopChatMapper;
	/**
	 * @desc  添加一条聊天记录
	 * @param shopChat
	 * @return boolean
	 */
	@Transactional(readOnly=false)
	@Override
	public boolean addChat(ShopChat shopChat) {
		int count=shopChatMapper.insert(shopChat);
		if(count>0) {
			return true;
		}
		return false;
	}
	/**
	 * @desc 根据id，删除相应的聊天记录
	 * @param id
	 * @return Boolean
	 */
	@Transactional(readOnly=false)
	@Override
	public boolean deleteChat(String id) {
		int count=shopChatMapper.deleteByPrimaryKey(id);
		if(count>=0) {
			return true;
		}
		return false;
	}
	/**
	 * @desc 根据id，更新相应的聊天记录
	 * @param shopChat
	 * @return
	 */
	@Transactional(readOnly=false)
	@Override
	public boolean updateChat(ShopChat shopChat) {
		int count=shopChatMapper.updateByPrimaryKey(shopChat);
		if(count>0) {
			return true;
		}
		return false;
	}
	/**
	 * @desc 根据id，查询相应的聊天记录
	 * @param id
	 * @return
	 */
	@Transactional(readOnly=true)
	@Override
	public ShopChat findChatById(String id) {
		ShopChatExample example=new ShopChatExample();
		example.or().andIdEqualTo(id);
		List<ShopChat> list=shopChatMapper.selectByExample(example);
		if(list!=null) {
			return list.get(0);
		}
		return null;
	}
	/**
	 * @desc 根据用户id，查询其所发表的交流
	 * @param id
	 * @return
	 */
	@Transactional(readOnly=true)
	@Override
	public List<ShopChat> findChatByUser(String uid) {
		ShopChatExample example=new ShopChatExample();
		example.or().andChatUserIdEqualTo(uid);
		List<ShopChat> list=shopChatMapper.selectByExample(example);
		return list;
	}
	/**
	 * @desc 根据商品id，查询其被发表的交流
	 * @param gid
	 * @return
	 */
	@Transactional(readOnly=true)
	@Override
	public List<ShopChat> findChatByGoods(String gid) {
		ShopChatExample example=new ShopChatExample();
		example.or().andChatGoodsIdEqualTo(gid);
		List<ShopChat> list=shopChatMapper.selectByExample(example);
		return list;
	}
	/**
	 * @desc 查询所有的交流记录
	 * @return
	 */
	@Transactional(readOnly=true)
	@Override
	public List<ShopChat> findAllChat() {
		ShopChatExample example=new ShopChatExample();
		List<ShopChat> list=shopChatMapper.selectByExample(example);
		return list;
	}
	/**
	 * @desc 查询某一段时间内，发表的交流记录
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	@Transactional(readOnly=true)
	@Override
	public List<ShopChat> findChatByDate(Date startDate, Date endDate) {
		ShopChatExample example=new ShopChatExample();
		example.or().andCreateDateBetween(startDate, endDate);
		List<ShopChat> list=shopChatMapper.selectByExample(example);
		return list;
	}

}
