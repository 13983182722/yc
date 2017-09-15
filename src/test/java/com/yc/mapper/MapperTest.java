package com.yc.mapper;

import static org.junit.Assert.*;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.pojo.SysCustomer;
import com.yc.pojo.SysCustomerExample;
import com.yc.pojo.SysOrder;
import com.yc.pojo.SysOrderExample;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-*.xml" })
public class MapperTest {
	
	@Autowired
	private SysOrderMapper sysOrderMapper;
	@Autowired
	private SysCustomerMapper customerMapper;
	
	@Test
	public void test() throws Exception {
		SysCustomerExample example=new SysCustomerExample();
		List<SysCustomer> list = customerMapper.selectByExample(example);
		Iterator<SysCustomer> iterator = list.iterator();
		while (iterator.hasNext()) {
			SysCustomer sysCustomer = (SysCustomer) iterator.next();
			System.out.println(sysCustomer);
		}
	}
	
	@Test
	public void del() throws Exception {
		customerMapper.deleteByPrimaryKey(3);
	}
	
	
	@Test
	public void testName() throws Exception {
		SysOrderExample example=new SysOrderExample();
		List<SysOrder> list = sysOrderMapper.selectByExample(example);
		Iterator<SysOrder> iterator = list.iterator();
		while (iterator.hasNext()) {
			SysOrder sysOrder = (SysOrder) iterator.next();
			System.out.println(sysOrder);
		}
//		SysOrder order=new SysOrder();
//		order.setOrderId(1);
//		order.setCustomerName("王麻子");
//		int insert = sysOrderMapper.insert(order);
		Serializable id=123;
		String idd=(String) id;
		//Integer d=(Integer) id;
		System.out.println(idd);
	}
}
	