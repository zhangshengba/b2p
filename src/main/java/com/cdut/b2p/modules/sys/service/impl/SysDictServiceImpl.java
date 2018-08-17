package com.cdut.b2p.modules.sys.service.impl;

/**
 * @title  SysDictServiceImpl
 * @desc   SysDictServiceImpl是SysDictService服务接口的实现类
 * @author zsb
 * @Date   2018/8/14
 *
 */
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdut.b2p.common.utils.CacheUtils;
import com.cdut.b2p.common.utils.IdUtils;
import com.cdut.b2p.common.utils.StringUtils;
import com.cdut.b2p.modules.shop.po.ShopUser;
import com.cdut.b2p.modules.sys.mapper.SysDictMapper;
import com.cdut.b2p.modules.sys.po.SysArea;
import com.cdut.b2p.modules.sys.po.SysDict;
import com.cdut.b2p.modules.sys.po.SysDictExample;
import com.cdut.b2p.modules.sys.po.SysUser;
import com.cdut.b2p.modules.sys.service.SysDictService;

@Service
@Transactional
public class SysDictServiceImpl implements SysDictService{

	@Autowired
	private SysDictMapper sysDictMapper;
	
	private void preInsert(SysDict sysDict) {
		sysDict.setUpdateDate(new Date());
		sysDict.setCreateDate(sysDict.getUpdateDate());
	}
	
	@Transactional(readOnly = false)
	@Override
	public void save(SysDict sysDict) {
		
		preInsert(sysDict);
		sysDictMapper.insertSelective(sysDict);
		CacheUtils.get("dictList");
	}

	@Transactional(readOnly = true)
	@Override
	public SysDict findByLabel(String label,String type) {
		SysDictExample sde = new SysDictExample();
		sde.or().andDictLabelEqualTo(label).andDictTypeEqualTo(type);
		List<SysDict> list = sysDictMapper.selectByExample(sde);
		return (list == null || list.isEmpty()) ? null : list.get(0);
	}
	
	@Transactional(readOnly = true)
	@Override
	public String findIdByType(String type) {
		SysDictExample sde = new SysDictExample();
		sde.or().andDictTypeEqualTo(type);
		List<SysDict> list = sysDictMapper.selectByExample(sde);
		return (list == null || list.isEmpty()) ? null : list.get(0).getId();
	}
}
