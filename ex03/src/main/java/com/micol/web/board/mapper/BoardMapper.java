package com.micol.web.board.mapper;

import java.util.List;

import com.micol.web.board.service.BoardVO;

public interface BoardMapper {
	List<BoardVO> getBoardAll(BoardVO vo);
	int countBoard(BoardVO vo);
	BoardVO getBoard(BoardVO vo);
	int insertBoard(BoardVO vo);
	int updateBoard(BoardVO vo);
	int deleteBoard(BoardVO vo);
}
