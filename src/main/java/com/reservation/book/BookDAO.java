package com.reservation.book;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {

	@Autowired
	SqlSession sqlSession;
	
	public int insertBook(ReservationDTO rDTO) {
		return sqlSession.insert("mapper.book.insert", rDTO);
	}
	
	public int selectBookInfoId() {
		return sqlSession.selectOne("mapper.book.selectBookInfoId");
	}

}
