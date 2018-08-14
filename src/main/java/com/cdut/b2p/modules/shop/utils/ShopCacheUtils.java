package com.cdut.b2p.modules.shop.utils;

import com.cdut.b2p.common.utils.CacheUtils;

public class ShopCacheUtils {
	
	private static final String SHOP_CACHE = "shopCache";
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public static Object get(String key) {
		return CacheUtils.get(SHOP_CACHE, key);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public static void put(String key, Object value) {
		CacheUtils.put(SHOP_CACHE, key, value);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public static void remove(String key) {
		CacheUtils.remove(SHOP_CACHE, key);
	}




}
