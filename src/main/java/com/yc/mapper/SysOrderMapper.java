package com.yc.mapper;

import com.yc.pojo.SysOrder;
import com.yc.pojo.SysOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrderMapper {
    int countByExample(SysOrderExample example);

    int deleteByExample(SysOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(SysOrder record);

    int insertSelective(SysOrder record);

    List<SysOrder> selectByExample(SysOrderExample example);

    SysOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") SysOrder record, @Param("example") SysOrderExample example);

    int updateByExample(@Param("record") SysOrder record, @Param("example") SysOrderExample example);

    int updateByPrimaryKeySelective(SysOrder record);

    int updateByPrimaryKey(SysOrder record);
}