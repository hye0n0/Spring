package com.micol.web.reply.service;

import java.util.List;

public interface ReplyService {
	List<ReplyVO> getReplyAll(int bno);
	int insertReply(ReplyVO vo);
	int deleteReply(int rno);
}
