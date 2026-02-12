package kr.co.studyProject.board.service;

import org.springframework.data.domain.Page;

import kr.co.studyProject.board.dto.ReqBoardDTO;
import kr.co.studyProject.board.dto.ResBoardDTO;

public interface BoardService {
	void write(ReqBoardDTO request, Long writerId);
	
	Page<ResBoardDTO> getBoardList(int page, String boardType);
	
	ResBoardDTO getBoardDetail(Long id);
}
