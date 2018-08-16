package com.cdut.b2p.modules.sys.utils;

import java.util.Map;

public class SysUserUtils {
	private static final long serialVersionUID = 1L;
	private static ThreadLocal<Map<Object,Object>> sysMapThreadLocal=new ThreadLocal<>();
    
	public static Map<Object,Object> getMap() {
        return sysMapThreadLocal.get();
    }
 
    public static void setMap(Map<Object,Object> map) {
    	sysMapThreadLocal.set(map);
    }
 
    public static void removeMap() {
    	sysMapThreadLocal.remove();
    }

}
