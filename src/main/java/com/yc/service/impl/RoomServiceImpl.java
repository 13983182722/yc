package com.yc.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.mapper.RoomMapper;
import com.yc.pojo.Room;
import com.yc.pojo.RoomExample;
import com.yc.pojo.RoomType;
import com.yc.query.PageList;
import com.yc.query.RoomQuery;
import com.yc.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	private RoomMapper roomMapper;

	@Override
	public boolean insert(Room t) {
		roomMapper.insert(t);
		return true;
	}

	@Override
	public boolean delete(Serializable id) {
		roomMapper.deleteByPrimaryKey((Integer) id);
		return true;
	}

	@Override
	public boolean update(Room t) {
		roomMapper.updateByPrimaryKeySelective(t);
		return true;
	}

	@Override
	public boolean save(Room t) {
		if(t.getRoomId()==0){
			insert(t);
		}else{
			update(t);
		}
		return true;
	}

	@Override
	public PageList getByQuery(RoomQuery baseQuery) {
		RoomExample example=new RoomExample();
		PageHelper.startPage(baseQuery.getPage(), baseQuery.getRows());
		List<Room> list = roomMapper.selectByExample(example);
		PageInfo<Room> info = new PageInfo<>(list);
		return new PageList(info.getTotal(), list);
	}
	

}
