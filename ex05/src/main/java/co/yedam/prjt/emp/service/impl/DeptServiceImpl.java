package co.yedam.prjt.emp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.yedam.prjt.common.Paging;
import co.yedam.prjt.emp.mapper.DeptMapper;
import co.yedam.prjt.emp.service.DeptService;
import co.yedam.prjt.emp.service.DeptVO;

@Component
public class DeptServiceImpl implements DeptService {

	@Autowired
	DeptMapper deptmapper;

	@Override
	public List<DeptVO> getDeptAll(DeptVO vo, Paging paging) {
		paging.setTotalRecord(deptmapper.count(vo)); // start, end
		vo.setFirst(paging.getFirst());
		vo.setLast(paging.getLast());
		return deptmapper.getDeptAll(vo);
	}

	@Override
	public int insertDept(DeptVO vo) {

		return deptmapper.insertDept(vo);
	}

	@Override
	public DeptVO getDept(int departmentId) {

		return deptmapper.getDept(departmentId);
	}

	@Override
	public int updateDept(DeptVO vo) {

		return deptmapper.updateDept(vo);
	}

	@Override
	public int deleteDept(int departmentId) {

		return deptmapper.deleteDept(departmentId);
	}

	@Override
	public List<Map<String, Object>> getManagers() {

		return deptmapper.getManagers();
	}

}
