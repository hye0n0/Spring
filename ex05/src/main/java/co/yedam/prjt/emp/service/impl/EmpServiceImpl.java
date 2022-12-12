package co.yedam.prjt.emp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import co.yedam.prjt.common.Paging;
import co.yedam.prjt.emp.mapper.EmpMapper;
import co.yedam.prjt.emp.service.EmpService;
import co.yedam.prjt.emp.service.EmpVO;

@Service // 빈 등록, 트랜잭션 처리
public class EmpServiceImpl implements EmpService{
	
	@Autowired EmpMapper empMapper;
	
	@Override
	public List<EmpVO> getEmpAll(EmpVO vo, Paging paging) {
		paging.setTotalRecord(empMapper.count(vo)); // start, end
		vo.setFirst(paging.getFirst());
		vo.setLast(paging.getLast());
		return empMapper.getEmpAll(vo);
	}

	@Override
	public EmpVO getEmp(String id) {

		return empMapper.getEmp(id);
	}

	@Override
	public int insertEmp(EmpVO vo) {

		return empMapper.insertEmp(vo);
	}

	@Override
	public int updateName(EmpVO vo) {

		return empMapper.updateName(vo);
	}

	@Override
	public int deleteEmp(String id) {
		// 100삭제 -> manager(참조)
		// 매니저인지 확인
		int check = empMapper.getManagerCheck(id);
		if(check == 0) {
			//아니면 삭제
			return empMapper.deleteEmp(id);
		}else {
			return 0;
		}
		
	}

	@Override
	public List<Map<String, Object>> getJobs() {

		return empMapper.getJobs();
	}

}
