package com.yc.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.mapper.RoomTypeMapper;
import com.yc.pojo.RoomType;
import com.yc.pojo.RoomTypeExample;
import com.yc.query.BaseQuery;
import com.yc.query.PageList;
import com.yc.service.RoomTypeService;

@Service
public class RoomTypeServiceImpl implements RoomTypeService{
	
	@Autowired
	private RoomTypeMapper roomTypeMapper;
	
	@Override
	public boolean insert(RoomType t) {
		roomTypeMapper.insert(t);
		return true;
	}

	@Override
	public boolean delete(Serializable id) {
		roomTypeMapper.deleteByPrimaryKey((Integer) id);
		return true;
	}

	@Override
	public boolean update(RoomType t) {
		roomTypeMapper.updateByPrimaryKeySelective(t);
		return true;
	}

	@Override
	public boolean save(RoomType t) {
		if(t.getRoomTypeId()==null){
			insert(t);
		}else{
			update(t);
		}
		return true;
	}

	@Override
	public PageList getByQuery(BaseQuery baseQuery) {
		RoomTypeExample example=new RoomTypeExample();
		PageHelper.startPage(baseQuery.getPage(), baseQuery.getRows());
		List<RoomType> list = roomTypeMapper.selectByExample(example);
		PageInfo<RoomType> info = new PageInfo<>(list);
		return new PageList(info.getTotal(), list);
	}

}
