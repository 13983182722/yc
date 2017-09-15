package com.yc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.query.PageList;
import com.yc.query.RoomQuery;
import com.yc.service.RoomService;

@RequestMapping("/room")
@Controller
public class RoomController {
	@Autowired
	private RoomService roomService;
	
	@RequestMapping("/getRoom")
	@ResponseBody
	public PageList getRoom(RoomQuery baseQuery){
		return roomService.getByQuery(baseQuery);
	}
	
}
