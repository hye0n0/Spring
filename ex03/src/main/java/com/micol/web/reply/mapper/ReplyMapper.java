package com.micol.web.reply.mapper;

import java.util.List;

import com.micol.web.reply.service.ReplyVO;

public interface ReplyMapper {
	List<ReplyVO> getReplyAll(int bno);
	int insertReply(ReplyVO vo);
	int deleteReply(int rno);
}
