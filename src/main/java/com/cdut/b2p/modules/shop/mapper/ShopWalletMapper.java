package com.cdut.b2p.modules.shop.mapper;

import com.cdut.b2p.common.po.annotation.MyBatisMapper;
import com.cdut.b2p.modules.shop.po.ShopWallet;
import com.cdut.b2p.modules.shop.po.ShopWalletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatisMapper
public interface ShopWalletMapper {
    long countByExample(ShopWalletExample example);

    int deleteByExample(ShopWalletExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopWallet record);

    int insertSelective(ShopWallet record);

    List<ShopWallet> selectByExample(ShopWalletExample example);

    ShopWallet selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopWallet record, @Param("example") ShopWalletExample example);

    int updateByExample(@Param("record") ShopWallet record, @Param("example") ShopWalletExample example);

    int updateByPrimaryKeySelective(ShopWallet record);

    int updateByPrimaryKey(ShopWallet record);
}