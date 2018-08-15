package com.cdut.b2p.modules.sys.service;

import com.cdut.b2p.modules.sys.po.SysArea;

public interface SysAreaService {
	
	public void save(SysArea sysArea);
	
	public String findIdbyAreaName(String name);

}
