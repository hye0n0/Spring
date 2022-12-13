package co.yedam.prjt.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import co.yedam.prjt.board.mapper.ReplyMapper;
import co.yedam.prjt.board.service.ReplyVO;


@RestController
public class ReplyController {
	
	@Autowired ReplyMapper replyMapper;
	
		//등록
		@PostMapping("/replys")
		public ReplyVO insert(ReplyVO vo) {
			replyMapper.insertReply(vo);
			return vo;
		}
		
		//삭제
		@DeleteMapping("/replys/{rno}")
		public ReplyVO delete(ReplyVO vo, @PathVariable int rno) {
			vo.setRno(rno);
			replyMapper.deleteReply(rno);
			return vo;
		}
		
		//전체조회
		@GetMapping("/replys/{bno}")
		public List<ReplyVO> userslist(@PathVariable int bno) {
			return replyMapper.getReplyAll(bno);
		}
}
