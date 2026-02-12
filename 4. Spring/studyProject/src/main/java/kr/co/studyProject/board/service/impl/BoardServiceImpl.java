package kr.co.studyProject.board.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import kr.co.studyProject.board.dto.ReqBoardDTO;
import kr.co.studyProject.board.dto.ResBoardDTO;
import kr.co.studyProject.board.entity.Board;
import kr.co.studyProject.board.repository.BoardRepository;
import kr.co.studyProject.board.service.BoardService;
import kr.co.studyProject.entity.Member;
import kr.co.studyProject.repository.Repository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	private final BoardRepository boardRepository;
	private final Repository memberRepository;
	
	@Override
	public void write(ReqBoardDTO request, Long writerId) {
		Member writer = memberRepository.findById(writerId).orElse(null);
		
		// Board 엔티티
		Board board = Board.builder()
					  .boardType(request.getBoardType())
					  .category(request.getCategory())
					  .title(request.getTitle())
					  .content(request.getContent())
					  .writer(writer)
					  .viewCount(0)
					  .build();
		// DB 저장
		boardRepository.save(board);	
	}
	
	@Override
	public Page<ResBoardDTO> getBoardList(int page, String boardType){
		Pageable pageable = PageRequest.of(page, 3, Sort.by("id").descending());
		
		Page<Board> boardList = boardRepository.findByBoardTypeOrderByIdDesc(boardType, pageable);
				
		List<ResBoardDTO> list = new ArrayList<>();
		
		for (Board b:boardList) {
			ResBoardDTO response = ResBoardDTO.builder()
					   .id(b.getId()) 
					   .category(b.getCategory())
					   .title(b.getTitle())
					   .content(b.getContent())
					   .writerName(b.getWriter().getUserName())
					   .createdAt(b.getCreatedAt())
					   .viewCount(b.getViewCount())
					   .build();
			list.add(response);
		}
		return new PageImpl<>(list,pageable,boardList.getTotalElements());
	}
	
	@Override
	@Transactional
	public ResBoardDTO getBoardDetail(Long id) {
		Board board = boardRepository.findById(id).orElse(null);
		
		board.setViewCount(board.getViewCount()+1);
		
		ResBoardDTO response = ResBoardDTO.builder()
						       .id(board.getId())
						       .title(board.getTitle())
						       .content(board.getContent())
						       .writerName(board.getWriter().getUserName())
						       .createdAt(board.getCreatedAt())
						       .viewCount(board.getViewCount())
						       .build();	
		return response;
	}
}
