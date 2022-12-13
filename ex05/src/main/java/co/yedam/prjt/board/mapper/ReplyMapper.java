package co.yedam.prjt.board.mapper;

import java.util.List;

import co.yedam.prjt.board.service.ReplyVO;


public interface ReplyMapper {
	List<ReplyVO> getReplyAll(int bno);
	int insertReply(ReplyVO vo);
	int deleteReply(int rno);
}
