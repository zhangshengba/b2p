package com.cdut.b2p.modules.sys.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdut.b2p.modules.sys.po.SysUser;

/**
 * @title  SysUserService
 * @desc   SysUserService是用于操作管理员的服务接口
 * @author zsb
 * @Date   2018/8/14
 */
public interface SysUserService {
	/**
	 * @desc 通过用户输入的信息，进行查询该用户【管理员】是否存在
	 * @return SysUser
	 */
	public SysUser findSysUser(SysUser sysUser);
	/**
	 * @desc 添加一个用户【系统管理员】
	 * @param sysUser
	 * @return 用户总数
	 */
	public int addSysUser(SysUser sysUser);
}
