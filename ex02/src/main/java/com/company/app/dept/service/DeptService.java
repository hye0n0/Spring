package com.company.app.dept.service;

import java.util.List;

public interface DeptService {
	List<DeptVO> getDeptAll(DeptVO vo);
	int insertDept(DeptVO vo);
}
