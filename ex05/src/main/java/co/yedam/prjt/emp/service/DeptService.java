package co.yedam.prjt.emp.service;

import java.util.List;
import java.util.Map;

import co.yedam.prjt.common.Paging;

public interface DeptService {
	List<DeptVO> getDeptAll(DeptVO vo, Paging paging);
	DeptVO getDept(int departmentId);
	int insertDept(DeptVO vo);
	int updateDept(DeptVO vo);
	int deleteDept(int departmentId);
	
	List<Map<String, Object>> getManagers();
}
