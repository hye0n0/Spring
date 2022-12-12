package co.yedam.prjt.board.web;


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
import co.yedam.prjt.board.service.BoardService;
import co.yedam.prjt.board.service.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	

	//등록페이지
	@GetMapping("/insert")
	public void insert(Model model) {
//		model.addAttribute("jobs", mapper.getJobs());
	}
	
	//등록
	@PostMapping("/insert")
	public String insertProc(BoardVO vo, RedirectAttributes rttr) {
		boardService.insertBoard(vo);
		rttr.addFlashAttribute("result", "등록처리완료");
		return "redirect:/board/list";
	}
	
	//수정페이지
	@GetMapping("/update")
	public String update(Model model, @RequestParam BoardVO vo) {
		//단건조회
		model.addAttribute("board", boardService.getBoard(vo));
		//model.addAttribute("managers", deptService.getManagers());
		return "board/update";
	}
	
	//수정
	@PostMapping("/update")
	public String updateProc(BoardVO vo, RedirectAttributes rttr) {
		boardService.updateBoard(vo);
		rttr.addFlashAttribute("result", "수정처리완료");
		return "redirect:/board/list";
	}
	
	//삭제
	@PostMapping("/delete")
	public String delete(BoardVO vo, RedirectAttributes rttr) {
		boardService.deleteBoard(vo);
		rttr.addFlashAttribute("result", "삭제처리완료");
		return "redirect:/board/list";
	}
	
	//전체조회 페이지
	@GetMapping("/list")
	public ModelAndView list(BoardVO vo, Paging paging) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/board/list");
		mv.addObject("boards", boardService.getBoardAll(vo, paging));
		return mv;
	}
	//단건조회 페이지
	@GetMapping("/select")
	public String select(Model model,@RequestParam BoardVO vo) {
		model.addAttribute("board", boardService.getBoard(vo));
		return "board/select";
	}
}
