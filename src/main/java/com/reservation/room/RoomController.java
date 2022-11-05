package com.reservation.room;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoomController {
	
	@Autowired
	RoomDAO roomDAO;

	@RequestMapping(value="/room/add.view", method=RequestMethod.GET)
	public String add() {
		return "/room/add";
	}

	@RequestMapping(value="/room/list.view", method=RequestMethod.GET)
	public String list(Model model) {

		List list = roomDAO.selectRoom();
		System.out.println("list.size : "+ list.size());
		model.addAttribute("list", list);
		
		return "/room/list";
	}
	
	@RequestMapping(value="/api/room/list", method=RequestMethod.GET)
	@ResponseBody
	public List listJson() {
		
		List list = roomDAO.selectRoom();
		System.out.println("list.size : "+ list.size());
		
		return list;
	}
	
	@RequestMapping(value="/api/room", method=RequestMethod.POST)
	public @ResponseBody int addRoom(
			@RequestBody RoomDTO roomDTO
		) {
		return roomDAO.insertRoom(roomDTO);
	}

	@RequestMapping(value="/api/room", method=RequestMethod.GET)
	public @ResponseBody List selectRoom(
			@RequestBody RoomDTO roomDTO
			) {
		return roomDAO.selectRoom();
	}
	
	@RequestMapping(value="/api/room", method=RequestMethod.PUT)
	public @ResponseBody int updateRoom(
			@RequestBody RoomDTO roomDTO
		) {
		return roomDAO.updateRoom(roomDTO);
	}

	@RequestMapping(value="/room/detail.view", method=RequestMethod.GET)
	public String detail(
			Model model,
			@RequestParam("room_id") int room_id
	) {

		RoomDTO roomDTO = roomDAO.selectRoomInfo(room_id);
		model.addAttribute("roomDTO", roomDTO);
		
		return "/room/detail";
	}

}
