package com.yc.service;

import com.yc.pojo.FloorInfo;
import com.yc.query.BaseQuery;
import com.yc.query.PageList;

public interface FloorService extends BaseService<FloorInfo>{
	public PageList getByQuery(BaseQuery baseQuery);
}
