package co.yedam.prjt.board.service;

import lombok.Data;

@Data
public class ReplyVO {
	int rno;
	int bno;
	String reply;
	String replyer;
	String replyDate;
	String updateDate;
}
