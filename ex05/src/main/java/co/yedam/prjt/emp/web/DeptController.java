package co.yedam.prjt.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.yedam.prjt.common.Paging;
import co.yedam.prjt.emp.service.DeptService;
import co.yedam.prjt.emp.service.DeptVO;
import co.yedam.prjt.emp.service.EmpVO;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/dept")
@Log4j
public class DeptController {
	@Autowired DeptService deptService;
	
	//등록페이지
	@GetMapping("/insert")
	public void insert(Model model) {
//		model.addAttribute("jobs", mapper.getJobs());
	}
	
	//등록
	@PostMapping("/insert")
	public String insertProc(DeptVO vo, RedirectAttributes rttr) {
		deptService.insertDept(vo);
		rttr.addFlashAttribute("result", "등록처리완료");
		return "redirect:/dept/list";
	}
	
	//수정페이지
	@GetMapping("/update")
	public String update(Model model, @RequestParam int id) {
		//단건조회
		model.addAttribute("dept", deptService.getDept(id));
		model.addAttribute("managers", deptService.getManagers());
		return "emp/update";
	}
	
	//수정
	@PostMapping("/update")
	public String updateProc(DeptVO vo, RedirectAttributes rttr) {
		deptService.updateDept(vo);
		log.info(vo);
		rttr.addFlashAttribute("result", "수정처리완료");
		return "redirect:/dept/list";
	}
	
	//삭제
	@PostMapping("/delete")
	public String updateProc(int id, RedirectAttributes rttr) {
		deptService.deleteDept(id);
		rttr.addFlashAttribute("result", "삭제처리완료");
		return "redirect:/dept/list";
	}
	
	//전체조회 페이지
	@GetMapping("/list")
	public ModelAndView list(DeptVO vo, Paging paging) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/dept/list");
		mv.addObject("depts", deptService.getDeptAll(vo, paging));
		return mv;
	}
	//단건조회 페이지
	@GetMapping("/select")
	public String select(Model model,@RequestParam int id) {
		model.addAttribute("dept", deptService.getDept(id));
		return "dept/select";
	}
}
