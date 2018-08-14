package com.cdut.b2p.modules.sys.utils;

import com.cdut.b2p.common.utils.CacheUtils;

public class SysCacheUtils {
	private static final String SYS_CACHE = "sysCache";
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public static Object get(String key) {
		return CacheUtils.get(SYS_CACHE, key);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public static void put(String key, Object value) {
		CacheUtils.put(SYS_CACHE, key, value);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public static void remove(String key) {
		CacheUtils.remove(SYS_CACHE, key);
	}

}
