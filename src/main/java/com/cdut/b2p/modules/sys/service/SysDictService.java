package com.cdut.b2p.modules.sys.service;

import com.cdut.b2p.modules.sys.po.SysDict;
/**
 * @title  SysDictService
 * @desc   SysDictService是用于实现操作数据字典的服务接口
 * @author zsb
 * @Date   2018/8/14
 *
 */

public interface SysDictService {
	public void save(SysDict sysDict);
	
	public SysDict findByLabel(String label,String type);
	
	public String findIdByType(String type);

}
