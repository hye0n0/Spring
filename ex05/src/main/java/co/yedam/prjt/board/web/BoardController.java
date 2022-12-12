package co.yedam.prjt.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.yedam.prjt.common.Paging;

import co.yedam.prjt.board.service.BoardService;
import co.yedam.prjt.board.service.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	// 글전체목록
	@RequestMapping("/getBoardAll")
	public String getBoardAll(Model model, BoardVO vo, Paging paging) {
		model.addAttribute("boards", boardService.getBoardAll(vo,paging));
		return "board/boardSelect";
	}
}
