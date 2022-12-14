package com.yedam.exam.book.service;

import java.util.List;

public interface BookService {
	int getbookNo();
	List<BookVO> getBookAll();
	int insertBook(BookVO vo);
	
	List<BookVO> getRentAll();
	
}
