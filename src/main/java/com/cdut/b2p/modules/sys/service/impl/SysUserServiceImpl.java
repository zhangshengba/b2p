package com.cdut.b2p.modules.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdut.b2p.common.utils.IdUtils;
import com.cdut.b2p.modules.sys.mapper.SysUserMapper;
import com.cdut.b2p.modules.sys.po.SysUser;
import com.cdut.b2p.modules.sys.po.SysUserExample;
import com.cdut.b2p.modules.sys.service.SysUserService;

/**
 * @title  SysUserServiceImpl
 * @desc   SysUserServiceImpl是SysUserService服务接口的实现类
 * @author zsb
 * @Date   2018/8/14
 *
 */
@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {
	@Autowired
	private SysUserMapper sysUserMapper;
	/**
	 * @desc 根据用户输入信息，进行查询
	 */
	@Override
	public SysUser findSysUser(SysUser sysUser) {
		SysUserExample sysUserExample=new SysUserExample();
		sysUserExample.or().andUserNameEqualTo(sysUser.getUserName()).andUserPasswordEqualTo(sysUser.getUserPassword());
		List<SysUser> sysUserList=sysUserMapper.selectByExample(sysUserExample);
		if(sysUserList.size()>0) {//表示账号和密码登录
			return sysUserList.get(0);
		}
		sysUserExample.or().andUserEmailEqualTo(sysUser.getUserName()).andUserPasswordEqualTo(sysUser.getUserPassword());
		sysUserList=sysUserMapper.selectByExample(sysUserExample);
		if(sysUserList.size()>0) {//表示邮箱和密码登录
			return sysUserList.get(0);
		}
		return null;
	}
	/**
	 * @desc 根据用户注册信息，进行添加用户
	 */
	@Override
	public int addSysUser(SysUser sysUser) {
		if(sysUser==null) {
			return 0;
		}
		sysUser.setId(IdUtils.randomBase62(64));
		return sysUserMapper.insert(sysUser);
	}

}
