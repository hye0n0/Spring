package co.yedam.prjt.board.service;

import java.util.List;

public interface ReplyService {
	List<ReplyVO> getReplyAll(int bno);
	ReplyVO getReply(int rno);
	int insertReply(ReplyVO vo);
	int updateReply(ReplyVO vo);
	int deleteReply(int rno);
}
