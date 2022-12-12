package co.yedam.prjt.board.mapper;

import java.util.List;

import co.yedam.prjt.board.service.BoardVO;

public interface BoardMapper {
	List<BoardVO> getBoardAll(BoardVO vo);
	int countBoard(BoardVO vo);
	BoardVO getBoard(BoardVO vo);
	int insertBoard(BoardVO vo);
	int updateBoard(BoardVO vo);
	int deleteBoard(BoardVO vo);
}
