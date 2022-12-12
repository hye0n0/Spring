package co.yedam.prjt.emp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import co.yedam.prjt.emp.service.EmpVO;

public interface EmpMapper {
	List<Map<String, Object>> getJobs();
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
}
