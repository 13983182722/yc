package com.yc.mapper;

import com.yc.pojo.SysCustomer;
import com.yc.pojo.SysCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCustomerMapper {
    int countByExample(SysCustomerExample example);

    int deleteByExample(SysCustomerExample example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(SysCustomer record);

    int insertSelective(SysCustomer record);

    List<SysCustomer> selectByExample(SysCustomerExample example);

    SysCustomer selectByPrimaryKey(Integer customerId);

    int updateByExampleSelective(@Param("record") SysCustomer record, @Param("example") SysCustomerExample example);

    int updateByExample(@Param("record") SysCustomer record, @Param("example") SysCustomerExample example);

    int updateByPrimaryKeySelective(SysCustomer record);

    int updateByPrimaryKey(SysCustomer record);
}