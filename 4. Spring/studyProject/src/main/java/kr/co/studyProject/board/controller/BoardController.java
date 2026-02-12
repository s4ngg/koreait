package kr.co.studyProject.board.controller;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import kr.co.studyProject.board.dto.ReqBoardDTO;
import kr.co.studyProject.board.dto.ResBoardDTO;
import kr.co.studyProject.board.service.BoardService;
import kr.co.studyProject.dto.ResLoginDTO;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
	private final BoardService boardService;
	
	// 게시판 이동
	@GetMapping
	public String boardList(@RequestParam(name="page", defaultValue = "1") int page,
							 Model model) {
		// 목록 조회
		Page<ResBoardDTO> list = boardService.getBoardList(page - 1,"FREE");
		
		int currentPage = list.getNumber() + 1; // 현재 페이지 (JPA는 0부터 시작함으로 + 1)
		int totalPages = list.getTotalPages();
		
		int blockSize = 5; // 5개의 버튼씩 보이게
		
		int startPage = ((currentPage - 1) / blockSize) * blockSize + 1;
		
		int endPage = startPage + blockSize - 1;
		
		if(endPage > totalPages) {
			endPage = totalPages;
		}
		
		model.addAttribute("list",list);
		model.addAttribute("currentPage",currentPage);
		model.addAttribute("totalPages",totalPages);
		model.addAttribute("startPage",startPage);
		model.addAttribute("endPage",endPage);
		
		return "board";
	}
	
	// 게시판 상세보기
	@GetMapping("/detail")
	public String detail(@RequestParam(name="id") Long id,Model model) {
		ResBoardDTO response = boardService.getBoardDetail(id);
		model.addAttribute("board", response);
		return "board-view";
	}
	
	@GetMapping("/create/form")
	public String createForm() {
		return "board-write";
	}
	
	@PostMapping("/create")
	public String create(ReqBoardDTO request, HttpSession session) {
		ResLoginDTO loginUser = (ResLoginDTO) session.getAttribute("LOGIN_USER");
		
		if (loginUser == null) {
			return "redirect:/login/form";
		}
		request.setBoardType("FREE");
		boardService.write(request, loginUser.getId());
		
		return "redirect:/board";
	}
	
}


