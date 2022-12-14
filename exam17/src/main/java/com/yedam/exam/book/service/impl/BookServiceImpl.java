package com.yedam.exam.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.exam.book.mapper.BookMapper;
import com.yedam.exam.book.service.BookService;
import com.yedam.exam.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService{

	@Autowired BookMapper bookMapper;

	@Override
	public List<BookVO> getBookAll() {

		return bookMapper.getBookAll();
	}

	@Override
	public int insertBook(BookVO vo) {

		return bookMapper.insertBook(vo);
	}

	@Override
	public List<BookVO> getRentAll() {

		return bookMapper.getRentAll();
	}

	@Override
	public int getbookNo() {

		return bookMapper.getbookNo();
	}
	



}
