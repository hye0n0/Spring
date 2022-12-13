package com.company.app.emp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.company.app.emp.service.EmpVO;

public interface EmpMapper {
	int count(EmpVO vo);
	List<EmpVO> getEmpAll(EmpVO vo);
	EmpVO getEmp(String id);
	int insertEmp(EmpVO vo);
	int updateName(EmpVO vo);
	
	//매니저여부확인
	int getManagerCheck(String id);
	//삭제
	int deleteEmp(String id);
	
	@Select("select * from departments")
	public List<Map<String, Object>> getDept();
	public List<Map<String, Object>> getDeptAll();
	
	@Insert("insert into tbl_sample (col1) values (#{data})")
	public int insertCol1(String data);
	
	@Insert("insert into tbl_sample2 (col1) values (#{data})")
	public int insertCol2(String data);
}
