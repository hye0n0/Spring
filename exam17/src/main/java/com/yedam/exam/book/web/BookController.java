package com.yedam.exam.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.exam.book.service.BookService;
import com.yedam.exam.book.service.BookVO;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired BookService bookService;
	
	//책목록
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("book/list");
		mv.addObject("books", bookService.getBookAll());
		return mv;
	}

	//책등록페이지
	@GetMapping("/insert")
	public String insert(Model model) {
		model.addAttribute("bookNo", bookService.getbookNo());
		return "/book/insert";
	}
	
	//책등록
	@PostMapping("/insert")
	public String insertProc(BookVO vo, RedirectAttributes rttr) {
		bookService.insertBook(vo);
		rttr.addFlashAttribute("result", "등록이 완료되었습니다");
		return "redirect:/book/insert";
	}
	
	//대여목록
		@GetMapping("/rent")
		public ModelAndView Rent() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("book/rent");
			mv.addObject("rents", bookService.getRentAll());
			return mv;
		}
}
