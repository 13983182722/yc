package com.yc.service;

import java.io.Serializable;

import org.apache.poi.ss.formula.functions.T;

import com.yc.query.BaseQuery;
import com.yc.query.PageList;

public interface BaseService<T> {
	public boolean insert(T t);
	
	public boolean delete(Serializable id);
	
	public boolean update(T t);
	
	public boolean save(T t);
	
}
