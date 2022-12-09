package com.company.app;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.app.emp.mapper.EmpMapper;
import com.company.app.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SqlSessionClient {

	@Autowired SqlSession mybatis;
	@Autowired EmpMapper mapper;
	
//	@Test
	public void getEmpAll() {
		EmpVO vo = new EmpVO();
//		vo.setDepartmentId("20");
//		vo.setFirstName("at");
		vo.setEmployeeIds(Arrays.asList("100","101","102"));
		List<EmpVO> list = mapper.getEmpAll(vo);
		if(list != null) {
			list.forEach(emp -> {
				System.out.println(emp.getFirstName());
			});
		}
	}
	
//	@Test
	public void insertEmp() {
		EmpVO vo = new EmpVO();
		//vo.setFirstName("홍길동");
		vo.setEmail("a@aaa");
		vo.setLastName("홍");
		vo.setHireDate("2022/10/10");
		vo.setJobId("IT_PROG");
		int result = mapper.insertEmp(vo);
		System.out.println(result + "건이 등록됨");
	}
	
//	@Test
	public void getDeptAll() {
		List<Map<String, Object>> list = mapper.getDeptAll();
		System.out.println(list.get(0));
	}
	
//	@Test
	public void getDept() {
		//System.out.println(mapper.getDept().get(0).get("DEPARTMENT_NAME"));
		List<Map<String, Object>> list = mapper.getDept();
		//부서명만 모두 출력
		list.forEach(dept -> {
			System.out.println(dept.get("DEPARTMENT_NAME"));
		});
	}
	
//	@Test
	public void update() {
		EmpVO vo = new EmpVO();
		vo.setEmployeeId("100");
		vo.setFirstName("홍길동");
		int result = mapper.updateName(vo);
		System.out.println(result + "건이 수정됨");
	}
	
//	@Test
	public void mapperSelect() {
		EmpVO vo = mapper.getEmp("100");
		System.out.println(vo.getFirstName());
	}
	
//	@Test
	public void select() {
		EmpVO vo = (EmpVO)mybatis.selectOne("com.company.app.emp.EmpMapper.getEmp", "100");
		System.out.println(vo);
	}
}
