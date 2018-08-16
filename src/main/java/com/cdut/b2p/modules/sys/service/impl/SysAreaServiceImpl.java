package com.cdut.b2p.modules.sys.service.impl;



/**
 * @title  SysAreaServiceImpl
 * @desc   SysAreaServiceImpl是SysAreaService服务接口的实现类
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
import com.cdut.b2p.common.utils.IdUtils;
import com.cdut.b2p.common.utils.StringUtils;
import com.cdut.b2p.modules.shop.po.ShopUser;
import com.cdut.b2p.modules.sys.mapper.SysAreaMapper;
import com.cdut.b2p.modules.sys.po.SysArea;
import com.cdut.b2p.modules.sys.po.SysAreaExample;
import com.cdut.b2p.modules.sys.po.SysDictExample;
import com.cdut.b2p.modules.sys.po.SysUser;
import com.cdut.b2p.modules.sys.service.SysAreaService;

@Service
@Transactional
public class SysAreaServiceImpl implements SysAreaService {

	@Autowired
	private SysAreaMapper sysAreaMapper;

	private void preInsert(SysArea sysArea) {
		sysArea.setUpdateDate(new Date());
		sysArea.setCreateDate(sysArea.getUpdateDate());
	}

	@Transactional(readOnly = false)
	@Override
	public void save(SysArea sysArea) {
		SysAreaExample se = new SysAreaExample();
		if (sysArea.getAreaParentId() == null || StringUtils.isBlank(sysArea.getAreaParentId())
				|| "0".equals(sysArea.getAreaParentId())) {
			sysArea.setAreaParentId(null);
		} else {
			SysArea par = sysAreaMapper.selectByPrimaryKey(sysArea.getAreaParentId());
			if (par == null || StringUtils.isBlank(par.getId())) {
				return;
			}
		}

		if (sysArea.getAreaParentId() == null) {
			sysArea.setAreaParentId("0");
			sysArea.setAreaParentIds("");
		}

		// 获取修改前的parentIds，用于更新子节点的parentIds
		String oldParentIds = sysArea.getAreaParentIds();

		// 设置新的父节点串
		if (sysArea.getAreaParentId().equals("0")) {
			sysArea.setAreaParentIds(sysArea.getAreaParentId() + ",");
		} else {
			SysArea par = sysAreaMapper.selectByPrimaryKey(sysArea.getAreaParentId());
			sysArea.setAreaParentIds(par.getAreaParentIds() + par.getId() + ",");
		}
		preInsert(sysArea);
		sysAreaMapper.insertSelective(sysArea);
		// 更新子节点 parentIds
		se.clear();
		se.or().andAreaParentIdsLike(sysArea.getId());
		List<SysArea> list = sysAreaMapper.selectByExample(se);
		for (SysArea e : list) {
			if (e.getAreaParentIds() != null && oldParentIds != null) {
				e.setAreaParentIds(e.getAreaParentIds().replace(oldParentIds, sysArea.getAreaParentIds()));
				preInsert(sysArea);
				sysAreaMapper.updateByPrimaryKeySelective(e);
			}
		}

	}

	@Transactional(readOnly = true)
	@Override
	public String findIdbyAreaName(String name) {
		SysAreaExample sae = new SysAreaExample();
		sae.or().andAreaNameEqualTo(name);
		return sysAreaMapper.selectByExample(sae).get(0).getId();
	}
}
