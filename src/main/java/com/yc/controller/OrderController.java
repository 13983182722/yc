package com.yc.controller;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.query.OrderQuery;
import com.yc.query.PageList;
import com.yc.service.OrderService;


@RequestMapping("/order")
@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/getOrder")
	@ResponseBody
	public PageList getOrder(OrderQuery baseQuery){
		return orderService.getByQuery(baseQuery);
	}
}
