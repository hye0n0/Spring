package co.yedam.prjt.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.yedam.prjt.emp.service.EmpService;
import co.yedam.prjt.emp.service.EmpVO;
import co.yedam.prjt.emp.service.UserListVO;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/test")
@Log4j
public class TestController {

	@Autowired
	EmpService empService;

	@RequestMapping("/insertListPage")
	public String insertListPage() {
		return "empInsertList";
	}
	
	// 등록
//	@RequestMapping(path="/insertList", method= {RequestMethod.GET, RequestMethod.POST}) // /emp/insert
	@PostMapping
	public String insert(UserListVO vo) { // 커맨드 객체
		log.info(vo);
		return "home";
	}

	// 등록
	@RequestMapping("/insert") // /emp/insert
	public String insert(EmpVO vo) { // 커맨드 객체
		log.info(vo);
		return "home";
	}

	@RequestMapping("/params")
	public String params (@RequestParam List<String> emloyeeIds) {
		log.info(emloyeeIds);
		return "main";
	}
	
	// 등록
	@RequestMapping("/insertparam") // /emp/insert
	public String insertparam(Integer age, @RequestParam(name = "name") String firstName,
			@RequestParam(required = false, defaultValue = "kim") String lastName) { // @RequestParam
		log.info(age);
		log.info(firstName);
		log.info(lastName);
		return "home";
	}

	// 수정

	// 삭제
	@RequestMapping("delete")
	public String delete(@RequestParam String id) { // 파라미터 필수
		empService.deleteEmp(id);
		return "home";
	}

	// 삭제
	@RequestMapping("delete/{empId}/{deptId}")
	public String deletePath(@PathVariable String empId,
						@PathVariable String deptId) { // 
		log.info(empId);
		log.info(deptId);
//		empService.deleteEmp(empId);
		return "home";
	}

	// 조회
}
