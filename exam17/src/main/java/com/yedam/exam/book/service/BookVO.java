package com.yedam.exam.book.service;



import lombok.Data;

@Data
public class BookVO {
	int bookNo;
	String bookName;
	String bookCoverimg;
	String bookDate;
	int bookPrice;
	String bookPublisher;
	String bookInfo;
	
	int rentSum;
	int bookCount;
}
