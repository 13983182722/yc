package com.yc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.pojo.SysCustomer;
import com.yc.query.CustomerQuery;
import com.yc.query.PageList;
import com.yc.service.CustomerService;
import com.yc.utils.AjaxResult;

@RequestMapping("/customer")
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/getCustomer")
	@ResponseBody
	public PageList getCustomer(CustomerQuery baseQuery){
		return customerService.getByQuery(baseQuery);
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public AjaxResult save(SysCustomer customer){
		customerService.save(customer);
		return new AjaxResult();
	}
	
	@RequestMapping("/del")
	@ResponseBody
	public AjaxResult del(Integer id){
		customerService.delete(id);
		return new AjaxResult();
	}
}
