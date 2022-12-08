package com.micol.web.board;

import java.util.List;

public interface BoardMapper {
	List<BoardVO> getBoardAll(BoardVO vo);
	int countBoard(BoardVO vo);
	BoardVO getBoard(BoardVO vo);
	int insertBoard(BoardVO vo);
	int updateBoard(BoardVO vo);
	int deleteBoard(BoardVO vo);
}
