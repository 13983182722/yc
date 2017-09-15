package com.yc.mapper;

import com.yc.pojo.FloorInfo;
import com.yc.pojo.FloorInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FloorInfoMapper {
    int countByExample(FloorInfoExample example);

    int deleteByExample(FloorInfoExample example);

    int deleteByPrimaryKey(Integer floorId);

    int insert(FloorInfo record);

    int insertSelective(FloorInfo record);

    List<FloorInfo> selectByExample(FloorInfoExample example);

    FloorInfo selectByPrimaryKey(Integer floorId);

    int updateByExampleSelective(@Param("record") FloorInfo record, @Param("example") FloorInfoExample example);

    int updateByExample(@Param("record") FloorInfo record, @Param("example") FloorInfoExample example);

    int updateByPrimaryKeySelective(FloorInfo record);

    int updateByPrimaryKey(FloorInfo record);
}