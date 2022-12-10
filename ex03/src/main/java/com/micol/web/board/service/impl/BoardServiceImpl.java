package com.micol.web.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micol.web.common.Paging;
import com.micol.web.board.mapper.BoardMapper;
import com.micol.web.board.service.BoardService;
import com.micol.web.board.service.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired BoardMapper mapper;

	@Override
	public List<BoardVO> getBoardAll(BoardVO vo, Paging paging) {
		paging.setTotalRecord(mapper.countBoard(vo)); // start, end
		vo.setFirst(paging.getFirst());
		vo.setLast(paging.getLast());
		return mapper.getBoardAll(vo);
	}

	@Override
	public int countBoard(BoardVO vo) {

		return mapper.countBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {

		return mapper.getBoard(vo);
	}

	@Override
	public int insertBoard(BoardVO vo) {

		return mapper.insertBoard(vo);
	}

	@Override
	public int updateBoard(BoardVO vo) {

		return mapper.updateBoard(vo);
	}

	@Override
	public int deleteBoard(BoardVO vo) {

		return mapper.deleteBoard(vo);
	}

}
