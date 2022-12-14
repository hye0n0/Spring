package co.yedam.prjt.board.mapper;

import java.util.List;

import co.yedam.prjt.board.service.ReplyVO;


public interface ReplyMapper {
	List<ReplyVO> getReplyAll(int bno);
	ReplyVO getReply(int rno);
	int insertReply(ReplyVO vo);
	int updateReply(ReplyVO vo);
	int deleteReply(int rno);
}
