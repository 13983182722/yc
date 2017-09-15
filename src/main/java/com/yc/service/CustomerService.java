package com.yc.service;

import com.yc.pojo.SysCustomer;
import com.yc.query.CustomerQuery;
import com.yc.query.PageList;

public interface CustomerService extends BaseService<SysCustomer>{
	public PageList getByQuery(CustomerQuery query);
	
	public SysCustomer getById(Integer id);
}
