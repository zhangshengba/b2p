package com.cdut.b2p.modules.shop.mapper;

import com.cdut.b2p.common.po.annotation.MyBatisMapper;
import com.cdut.b2p.modules.shop.po.ShopLog;
import com.cdut.b2p.modules.shop.po.ShopLogExample;
import com.cdut.b2p.modules.shop.po.ShopLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatisMapper
public interface ShopLogMapper {
    long countByExample(ShopLogExample example);

    int deleteByExample(ShopLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopLogWithBLOBs record);

    int insertSelective(ShopLogWithBLOBs record);

    List<ShopLogWithBLOBs> selectByExampleWithBLOBs(ShopLogExample example);

    List<ShopLog> selectByExample(ShopLogExample example);

    ShopLogWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopLogWithBLOBs record, @Param("example") ShopLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopLogWithBLOBs record, @Param("example") ShopLogExample example);

    int updateByExample(@Param("record") ShopLog record, @Param("example") ShopLogExample example);

    int updateByPrimaryKeySelective(ShopLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ShopLogWithBLOBs record);

    int updateByPrimaryKey(ShopLog record);
}