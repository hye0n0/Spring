package co.yedam.prjt.board.service;

import lombok.Data;

@Data
public class BoardVO {
	int bno;
	String title;
	String content;
	String writer;
	String regdate;
	String updatedate;
	
	Integer first = 1;
	Integer last = 10;
}
