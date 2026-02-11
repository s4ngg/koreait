package kr.co.study.board.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.study.board.dto.ReqBoardDTO;
import kr.co.study.board.dto.ResBoardDTO;
import kr.co.study.board.entity.Board;
import kr.co.study.board.repository.BoardRepository;
import kr.co.study.board.service.BoardService;
import kr.co.study.member.entity.Member;
import kr.co.study.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoticeServiceImpl implements BoardService{
	private final BoardRepository boardRepository;
	private final MemberRepository memberRepository;
	
	@Override
	public void write(ReqBoardDTO request, Long writerId) {
		// 1. 작성자 조회
		Member writer = memberRepository.findById(writerId).orElse(null);
		if(writer == null) {
			System.out.println("유효하지 않은 사용자입니다.");
		}
		
		// 2. Board 엔티티
		Board board = new Board();
		board.setBoardType("NOTICE");
		board.setCategory(request.getCategory());
		board.setTitle(request.getTitle());
		board.setContent(request.getContent());
		board.setWriter(writer);
		board.setViewCount(0);
		
		// 3. DB 저장
		boardRepository.save(board);
	}

	@Override
	public List<ResBoardDTO> getBoardList() {
		// 1. 공지사항 게시글 전체 조회
		List<Board> boardList = boardRepository.findByBoardTypeOrderByIdDesc("NOTICE");
		
		// 2. Entity 타입을 Response DTO 타입으로 변경
		List<ResBoardDTO> list = new ArrayList<>();
		
		for (Board b: boardList) {
			ResBoardDTO response = new ResBoardDTO();
			response.setId(b.getId());
			response.setCategory(b.getCategory());
			response.setTitle(b.getTitle());
			response.setContent(b.getContent());
			response.setWriterName(b.getWriter().getUserName());
			response.setCreatedAt(b.getCreatedAt());
			
			list.add(response);
		}
		
		// 3. 응답 객체(Response DTO) 반환
		return list;
	}
}