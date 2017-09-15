package com.yc.service;

import com.yc.pojo.Room;
import com.yc.query.PageList;
import com.yc.query.RoomQuery;

public interface RoomService extends BaseService<Room>{
	public PageList getByQuery(RoomQuery baseQuery);
}
