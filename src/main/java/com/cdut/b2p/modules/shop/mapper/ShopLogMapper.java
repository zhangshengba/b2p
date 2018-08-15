package com.cdut.b2p.modules.shop.mapper;

import com.cdut.b2p.common.po.annotation.MyBatisMapper;
import com.cdut.b2p.modules.shop.po.ShopLog;
import com.cdut.b2p.modules.shop.po.ShopLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatisMapper
public interface ShopLogMapper {
    long countByExample(ShopLogExample example);

    int deleteByExample(ShopLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopLog record);

    int insertSelective(ShopLog record);

    List<ShopLog> selectByExampleWithBLOBs(ShopLogExample example);

    List<ShopLog> selectByExample(ShopLogExample example);

    ShopLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopLog record, @Param("example") ShopLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopLog record, @Param("example") ShopLogExample example);

    int updateByExample(@Param("record") ShopLog record, @Param("example") ShopLogExample example);

    int updateByPrimaryKeySelective(ShopLog record);

    int updateByPrimaryKeyWithBLOBs(ShopLog record);

    int updateByPrimaryKey(ShopLog record);
}