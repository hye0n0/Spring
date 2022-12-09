package com.company.app;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.app.dept.service.DeptService;
import com.company.app.dept.service.DeptVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DeptServiceClinet {
	@Autowired
	DeptService service;
	
//	@Test
	public void getDeptAll() {
		DeptVO vo = new DeptVO();
		List<DeptVO> list = service.getDeptAll(vo);
		list.forEach(dept -> {
			log.info(dept.getDepartmentName());
		});
	}
	
	@Test
	public void insertDept() {
		DeptVO vo = new DeptVO();
		vo.setDepartmentName("영업");
		int r = service.insertDept(vo);
		log.info(r + "건 등록됨");
	}
}
