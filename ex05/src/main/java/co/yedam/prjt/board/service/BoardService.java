package co.yedam.prjt.board.service;

import java.util.List;

import co.yedam.prjt.common.Paging;

public interface BoardService {
	List<BoardVO> getBoardAll(BoardVO vo, Paging paging);
	int countBoard(BoardVO vo);
	BoardVO getBoard(BoardVO vo);
	int insertBoard(BoardVO vo);
	int updateBoard(BoardVO vo);
	int deleteBoard(BoardVO vo);
}
