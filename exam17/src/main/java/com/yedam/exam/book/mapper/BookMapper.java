package com.yedam.exam.book.mapper;

import java.util.List;

import com.yedam.exam.book.service.BookVO;

public interface BookMapper {
	int getbookNo();
	List<BookVO> getBookAll();
	int insertBook(BookVO vo);
	
	List<BookVO> getRentAll();
}
