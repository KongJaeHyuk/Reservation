package com.reservation.book;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reservation.room.RoomDAO;
import com.reservation.room.RoomDTO;

@Controller
public class BookController {
	
	@Autowired
	RoomDAO roomDAO;
	
	@Autowired
	ReservationDAO reservationDAO;

	@Autowired
	BookDAO bookDAO;

	// 달력
	@RequestMapping(value="/book/cal.view")
	public String viewCal() {
		return "/booking/reservation";
	}
	
	// 상세
	@RequestMapping(value="/book/book.view")
	public String book(
			Model model,
			@RequestParam Map map
			) {
		int room_id = Integer.parseInt((String)map.get("room_id"));
		RoomDTO roomDTO = roomDAO.selectRoomInfo(room_id);
		System.out.println(roomDTO);
		map.put("roomDTO", roomDTO);
		
		model.addAttribute("map", map);
		
		return "/booking/book";
	}
	
	// 예약 정보 insert
	@RequestMapping(value="/book/booking", method=RequestMethod.POST)
	public String booking(
			@ModelAttribute ReservationDTO rDTO
			) {
		// TODO: 예약가능한지 check
		
		
		System.out.println(rDTO);
		rDTO.setDate_in( java.sql.Date.valueOf(rDTO.getStr_date_in()) );
		rDTO.setDate_out( java.sql.Date.valueOf(rDTO.getStr_date_out()) );
		
		// seq_book_info_id를 변수에 저장
		int seq_book_info_id = bookDAO.selectBookInfoId();
		rDTO.setUser_id(seq_book_info_id);
		
		// insert
		bookDAO.insertBook(rDTO);
		reservationDAO.insertReservation(rDTO);
		
		return "redirect:/book/cal.view";
	}
	
	@RequestMapping(value="/api/book", method=RequestMethod.GET)
	@ResponseBody
	public List thisMonthList() {
		return reservationDAO.thisMonthList();
	}
	
}
