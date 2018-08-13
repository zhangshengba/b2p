package com.cdut.b2p.modules.shop.mapper;

import com.cdut.b2p.common.po.annotation.MyBatisMapper;
import com.cdut.b2p.modules.shop.po.ShopCollection;
import com.cdut.b2p.modules.shop.po.ShopCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatisMapper
public interface ShopCollectionMapper {
    long countByExample(ShopCollectionExample example);

    int deleteByExample(ShopCollectionExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopCollection record);

    int insertSelective(ShopCollection record);

    List<ShopCollection> selectByExample(ShopCollectionExample example);

    ShopCollection selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopCollection record, @Param("example") ShopCollectionExample example);

    int updateByExample(@Param("record") ShopCollection record, @Param("example") ShopCollectionExample example);

    int updateByPrimaryKeySelective(ShopCollection record);

    int updateByPrimaryKey(ShopCollection record);
}