package com.micol.web.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micol.web.board.service.BoardService;
import com.micol.web.board.service.BoardVO;
import com.micol.web.common.Paging;

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
