package com.cdut.b2p.modules.shop.mapper;

import com.cdut.b2p.common.po.annotation.MyBatisMapper;
import com.cdut.b2p.modules.shop.po.ShopWorkorder;
import com.cdut.b2p.modules.shop.po.ShopWorkorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatisMapper
public interface ShopWorkorderMapper {
    long countByExample(ShopWorkorderExample example);

    int deleteByExample(ShopWorkorderExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopWorkorder record);

    int insertSelective(ShopWorkorder record);

    List<ShopWorkorder> selectByExample(ShopWorkorderExample example);

    ShopWorkorder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopWorkorder record, @Param("example") ShopWorkorderExample example);

    int updateByExample(@Param("record") ShopWorkorder record, @Param("example") ShopWorkorderExample example);

    int updateByPrimaryKeySelective(ShopWorkorder record);

    int updateByPrimaryKey(ShopWorkorder record);
}