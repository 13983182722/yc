package com.yc.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.mapper.SysCustomerMapper;
import com.yc.pojo.SysCustomer;
import com.yc.pojo.SysCustomerExample;
import com.yc.pojo.SysCustomerExample.Criteria;
import com.yc.query.CustomerQuery;
import com.yc.query.OrderQuery;
import com.yc.query.PageList;
import com.yc.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private SysCustomerMapper customerMapper;
	
	@Override
	public boolean insert(SysCustomer t) {
		customerMapper.insert(t);
		return true;
	}

	@Override
	public boolean delete(Serializable id) {
		System.out.println((Integer) id);
		customerMapper.deleteByPrimaryKey((Integer) id);
		return true;
	}

	@Override
	public boolean update(SysCustomer t) {
		customerMapper.updateByPrimaryKeySelective(t);
		return true;
	}

	@Override
	public PageList getByQuery(CustomerQuery query) {
		SysCustomerExample example=new SysCustomerExample();
		PageHelper.startPage(query.getPage(), query.getRows());
		example.setOrderByClause("creat_time desc");
		Criteria criteria = example.createCriteria();
		if(query.getKeyName()!=null){
			criteria.andCustomerNameLike("%"+query.getKeyName()+"%");
		}
		List<SysCustomer> list = customerMapper.selectByExample(example);
		PageInfo<SysCustomer> info = new PageInfo<>(list);
		return new PageList(info.getTotal(), list);
	}

	@Override
	public boolean save(SysCustomer t) {
		if(t.getCustomerId()!=null){
			update(t);
		}else{
			t.setCreatTime(new Date());
			insert(t);
		}
		return true;
	}

	@Override
	public SysCustomer getById(Integer id) {
		return customerMapper.selectByPrimaryKey(id);
	}

}
