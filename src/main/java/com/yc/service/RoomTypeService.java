package com.yc.service;

import com.yc.pojo.RoomType;
import com.yc.query.BaseQuery;
import com.yc.query.PageList;

public interface RoomTypeService extends BaseService<RoomType>{
	public PageList getByQuery(BaseQuery baseQuery);
}
