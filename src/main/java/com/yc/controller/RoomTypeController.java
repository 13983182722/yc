package com.yc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.pojo.RoomType;
import com.yc.query.PageList;
import com.yc.query.RoomQuery;
import com.yc.service.RoomService;
import com.yc.service.RoomTypeService;
import com.yc.utils.AjaxResult;

@RequestMapping("/roomType")
@Controller
public class RoomTypeController {
	@Autowired
	private RoomTypeService roomTypeService;

	@RequestMapping("/getRoomType")
	@ResponseBody
	public PageList getRoom(RoomQuery baseQuery) {
		return roomTypeService.getByQuery(baseQuery);
	}

	@RequestMapping("/save")
	@ResponseBody
	public AjaxResult save(RoomType roomType) {
		roomTypeService.save(roomType);
		return new AjaxResult();
	}

}
