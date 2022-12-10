package com.micol.web;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.micol.web.reply.mapper.ReplyMapper;
import com.micol.web.reply.service.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyServiceClient {
	@Autowired SqlSession mybatis;
	@Autowired ReplyMapper mapper;
	
	//@Test
	public void getBoardAll() {
		List<ReplyVO> list = mapper.getReplyAll(1);
		if(list != null) {
			list.forEach(reply -> {
				log.info(reply.getReply());
			});
		}
	}
	
	@Test
	public void insertReply() {
		ReplyVO vo = new ReplyVO();
	}
	
	@Test
	public void deleteReply() {
		
	}
	
}
