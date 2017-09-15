package com.yc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.pojo.FloorInfo;
import com.yc.pojo.RoomType;
import com.yc.query.BaseQuery;
import com.yc.query.PageList;
import com.yc.query.RoomQuery;
import com.yc.service.FloorService;
import com.yc.utils.AjaxResult;

@RequestMapping("/floor")
@Controller
public class FloorController {
	@Autowired
	private FloorService floorService;
	
	@RequestMapping("/getFloor")
	@ResponseBody
	public PageList getFloor(BaseQuery baseQuery){
		return floorService.getByQuery(baseQuery);
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public AjaxResult save(FloorInfo floorInfo) {
		floorService.save(floorInfo);
		return new AjaxResult();
	}
}
