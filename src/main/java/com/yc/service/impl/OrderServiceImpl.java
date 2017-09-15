package com.yc.service.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.mapper.SysOrderMapper;
import com.yc.pojo.SysOrder;
import com.yc.pojo.SysOrderExample;
import com.yc.pojo.SysOrderExample.Criteria;
import com.yc.query.BaseQuery;
import com.yc.query.OrderQuery;
import com.yc.query.PageList;
import com.yc.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private SysOrderMapper orderMapper;

	@Override
	public boolean insert(SysOrder t) {
		orderMapper.insert(t);
		return true;
	}

	@Override
	public boolean delete(Serializable id) {
		orderMapper.deleteByPrimaryKey((Integer) id);
		return true;
	}

	@Override
	public boolean update(SysOrder t) {
		orderMapper.updateByPrimaryKeySelective(t);
		return true;
	}
	
	public PageList getByQuery(OrderQuery query){
		SysOrderExample example=new SysOrderExample();
		PageHelper.startPage(query.getPage(), query.getRows());
		example.setOrderByClause("priority desc,order_time desc");
		Criteria criteria = example.createCriteria();
		List<SysOrder> list = orderMapper.selectByExample(example);
		PageInfo<SysOrder> pageInfo=new PageInfo<>(list);
		return new PageList(pageInfo.getTotal(), list);
	}

	@Override
	public boolean save(SysOrder t) {
		return false;
	}
	
}
