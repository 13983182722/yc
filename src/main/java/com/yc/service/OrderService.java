package com.yc.service;

import com.yc.pojo.SysOrder;
import com.yc.query.OrderQuery;
import com.yc.query.PageList;

public interface OrderService extends BaseService<SysOrder>{
	
	public PageList getByQuery(OrderQuery query);
}
