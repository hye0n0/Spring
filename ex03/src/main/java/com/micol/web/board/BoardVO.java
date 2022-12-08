package com.micol.web.board;

import lombok.Data;

@Data
public class BoardVO {
	int bno;
	String title;
	String content;
	String writer;
	String regdate;
	String updatedate;
}
