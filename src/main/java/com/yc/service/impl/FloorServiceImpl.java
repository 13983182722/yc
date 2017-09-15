package com.yc.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.mapper.FloorInfoMapper;
import com.yc.pojo.FloorInfo;
import com.yc.pojo.FloorInfoExample;
import com.yc.query.BaseQuery;
import com.yc.query.PageList;
import com.yc.service.FloorService;

@Service
public class FloorServiceImpl implements FloorService{
	
	@Autowired
	private FloorInfoMapper floorInfoMapper;
	
	@Override
	public boolean insert(FloorInfo t) {
		floorInfoMapper.insert(t);
		return true;
	}

	@Override
	public boolean delete(Serializable id) {
		floorInfoMapper.deleteByPrimaryKey((Integer) id);
		return true;
	}

	@Override
	public boolean update(FloorInfo t) {
		floorInfoMapper.updateByPrimaryKeySelective(t);
		return true;
	}

	@Override
	public boolean save(FloorInfo t) {
		if(t.getFloorId()==0){
			if(t.getNotes()==null){
				t.setNotes("无");
			}
			insert(t);
		}else{
			update(t);
		}
		return true;
	}

	@Override
	public PageList getByQuery(BaseQuery baseQuery) {
		FloorInfoExample example=new FloorInfoExample();
		PageHelper.startPage(baseQuery.getPage(), baseQuery.getRows());
		List<FloorInfo> list = floorInfoMapper.selectByExample(example);
		PageInfo<FloorInfo> info = new PageInfo<>(list);
		return new PageList(info.getTotal(), list);
	}

}
