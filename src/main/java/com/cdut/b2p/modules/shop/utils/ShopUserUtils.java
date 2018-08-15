package com.cdut.b2p.modules.shop.utils;

import java.io.Serializable;

import com.cdut.b2p.modules.shop.po.ShopUser;

public class ShopUserUtils implements Serializable {
	private static final long serialVersionUID = 1L;
	private static ThreadLocal<ShopUser> shopUserThreadLocal = new ThreadLocal<>();
    
	public static ShopUser getUser() {
        return shopUserThreadLocal.get();
    }
 
    public static void setUser(ShopUser entity) {
    	shopUserThreadLocal.set(entity);
    }
 
    public static void removeUser() {
    	shopUserThreadLocal.remove();
    }
}
