package com.cdut.b2p.modules.shop.utils;

import java.util.Map;

public class ShopUserUtils {
	private static final long serialVersionUID = 1L;
	private static ThreadLocal<Map<Object,Object>> shopMapThreadLocal=new ThreadLocal<>();
    
	public static Map<Object,Object> getMap() {
        return shopMapThreadLocal.get();
    }
 
    public static void setMap(Map<Object,Object> entity) {
    	shopMapThreadLocal.set(entity);
    }
 
    public static void removeMap() {
    	shopMapThreadLocal.remove();
    }

}
