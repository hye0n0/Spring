package co.yedam.prjt.emp.mapper;

import java.util.List;
import java.util.Map;

import co.yedam.prjt.emp.service.DeptVO;

public interface DeptMapper {
	List<DeptVO> getDeptAll(DeptVO vo);
	DeptVO getDept(int departmentId);
	int insertDept(DeptVO vo);
	int updateDept(DeptVO vo);
	int deleteDept(int departmentId);
	
	int count(DeptVO vo);
	List<Map<String, Object>> getManagers();
}
