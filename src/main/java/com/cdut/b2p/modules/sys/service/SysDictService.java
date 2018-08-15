package com.cdut.b2p.modules.sys.service;

import com.cdut.b2p.modules.sys.po.SysDict;

public interface SysDictService {
	public void save(SysDict sysDict);
	
	public SysDict findByLabel(String label,String type);
	
	public String findIdByType(String type);

}
