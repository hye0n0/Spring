package co.yedam.prjt.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.yedam.prjt.board.mapper.ReplyMapper;
import co.yedam.prjt.board.service.ReplyService;
import co.yedam.prjt.board.service.ReplyVO;


@Component
public class ReplyServiceImpl implements ReplyService{
	
	@Autowired
	ReplyMapper mapper;
	
	@Override
	public List<ReplyVO> getReplyAll(int bno) {
		
		return mapper.getReplyAll(bno);
	}

	@Override
	public int insertReply(ReplyVO vo) {

		return mapper.insertReply(vo);
	}

	@Override
	public int deleteReply(int rno) {

		return mapper.deleteReply(rno);
	}


}
