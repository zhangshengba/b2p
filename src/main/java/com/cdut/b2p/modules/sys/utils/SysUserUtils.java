package com.cdut.b2p.modules.sys.utils;

import java.io.Serializable;

import com.cdut.b2p.modules.sys.po.SysUser;

public class SysUserUtils implements Serializable {
	private static final long serialVersionUID = 1L;
	private static ThreadLocal<SysUser> sysUserThreadLocal=new ThreadLocal<>();
    
	public static SysUser getUser() {
        return sysUserThreadLocal.get();
    }
 
    public static void setUser(SysUser entity) {
    	sysUserThreadLocal.set(entity);
    }
 
    public static void removeUser() {
    	sysUserThreadLocal.remove();
    }
}
