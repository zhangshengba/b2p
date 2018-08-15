package com.cdut.b2p.modules.shop.service;

import com.cdut.b2p.modules.shop.po.ShopUser;
import com.cdut.b2p.modules.shop.po.ShopWallet;

public interface ShopUserService {
	
	public void saveUser(ShopUser shopUser);
	
	public void saveWallet(ShopWallet shopWallet);
	
	public ShopUser findUserByUsername(String username);


}
