package com.cdut.b2p.modules.sys.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdut.b2p.modules.sys.po.SysLog;
import com.cdut.b2p.modules.sys.po.SysLogWithBLOBs;

/**
 * @title SysLogService
 * @Desc  SysLogService是实现管理员登录日志记录的服务接口
 * @author zsb
 * @Date   2018/8/14
 *
 */

public interface SysLogService {
	/**
	 * @desc 添加一条管理员登录日志记录
	 * @param sysLog
	 * @return
	 */
	public int addSysLog(SysLogWithBLOBs sysLog);

}
