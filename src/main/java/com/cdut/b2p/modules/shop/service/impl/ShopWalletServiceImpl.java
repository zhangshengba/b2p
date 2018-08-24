package com.cdut.b2p.modules.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdut.b2p.modules.shop.mapper.ShopWalletMapper;
import com.cdut.b2p.modules.shop.po.ShopWallet;
import com.cdut.b2p.modules.shop.service.ShopWalletService;
/**
 * @desc ShopWalletServiceImpl是ShopWalletService的实现类
 * @author zsb
 * @version 1.0
 * @Date 2018/08/23
 *
 */
@Service
@Transactional
public class ShopWalletServiceImpl implements ShopWalletService{
	@Autowired
	private ShopWalletMapper ShopWalletMapper;
	/**
	 * @desc 添加钱包
	 */
	@Transactional(readOnly=false)
	@Override
	public boolean addWallet(ShopWallet shopWallet) {
		int count=ShopWalletMapper.insertSelective(shopWallet);
		if(count>0) {
			return true;
		}
		return false;
	}
    /**
     * @desc 根据主键发现相应的记录
     */
	@Transactional(readOnly=true)
	@Override
	public ShopWallet findWallet(String id) {
		ShopWallet wallet=ShopWalletMapper.selectByPrimaryKey(id);
		return wallet;
	}

}
