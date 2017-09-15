package com.yc.service;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.pojo.SysOrder;
import com.yc.query.OrderQuery;
import com.yc.query.PageList;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-*.xml" })
public class OrderServiceTest {
	@Autowired
	private OrderService orderService;
	
	@Test
	public void testGetQuery() throws Exception {
		OrderQuery query=new OrderQuery();
		PageList list = orderService.getByQuery(query);
		List<SysOrder> rows = (List<SysOrder>) list.getRows();
		Iterator<SysOrder> iterator = rows.iterator();
		while (iterator.hasNext()) {
			SysOrder sysOrder = (SysOrder) iterator.next();
			System.out.println(sysOrder);
		}
	}
}
