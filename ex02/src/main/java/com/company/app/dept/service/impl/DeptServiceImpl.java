package com.company.app.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.company.app.dept.mapper.DeptMapper;
import com.company.app.dept.service.DeptService;
import com.company.app.dept.service.DeptVO;

@Component
public class DeptServiceImpl implements DeptService{
	
	@Autowired DeptMapper deptmapper;
	
	@Override
	public List<DeptVO> getDeptAll(DeptVO vo) {

		return deptmapper.getDeptAll(vo);
	}

	@Override
	public int insertDept(DeptVO vo) {

		return deptmapper.insertDept(vo);
	}

}
