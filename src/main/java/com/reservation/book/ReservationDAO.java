package com.reservation.book;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationDAO {

	@Autowired
	SqlSession sqlSession;
	
	public int insertReservation(ReservationDTO rDTO) {
		return sqlSession.insert("mapper.reservation.insert", rDTO);
	}
	
	public List thisMonthList() {
		return sqlSession.selectList("mapper.reservation.thisMonthList");
	}

}
