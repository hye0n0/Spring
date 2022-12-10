package com.micol.web.board.service;

import java.util.List;

import com.micol.web.common.Paging;

public interface BoardService {
	List<BoardVO> getBoardAll(BoardVO vo, Paging paging);
	int countBoard(BoardVO vo);
	BoardVO getBoard(BoardVO vo);
	int insertBoard(BoardVO vo);
	int updateBoard(BoardVO vo);
	int deleteBoard(BoardVO vo);
}
