package com.cdut.b2p.modules.shop.service;

import com.cdut.b2p.modules.shop.po.ShopWallet;

/**
 * @desc ShopWalletService是有关钱包的处理类
 * @author zsb
 *
 */
public interface ShopWalletService {
	/**
	 * @desc 添加一个钱包
	 * @param shopWallet
	 * @return
	 */
	public boolean addWallet(ShopWallet shopWallet);
	/**
	 * @desc 根据主键进行查询相应的记录
	 * @param id
	 * @return
	 */
	public ShopWallet findWallet(String id);
	
}
