package com.cdut.b2p.modules.shop.service;

import com.cdut.b2p.modules.shop.po.ShopUser;
import com.cdut.b2p.modules.shop.po.ShopWallet;

public interface ShopUserService {
	
	public void saveUser(ShopUser shopUser);
	
	public void regUser(String username, String password, String nickname, String email);

	/**
	 * @desc 查询上一个月增加的用户数
	 * @author zsb
	 * @return
	 */
	public Integer addUserCountByMonth();
	/**
	 * @desc 查询上一个月内，浏览网站的游客数量【只注册了，为进行商品买卖行为】
	 * @author zsb
	 * @return
	 */
	public Integer addVistorCountByMonth();

	
	public void saveWallet(ShopWallet shopWallet);
	
	public ShopUser findUserByUsername(String username);



}
