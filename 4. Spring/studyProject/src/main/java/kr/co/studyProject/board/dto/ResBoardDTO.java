package kr.co.studyProject.board.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResBoardDTO {
	private Long id;
	private String category;
	private String title;
	private String content;
	private String writerName;
	private LocalDateTime createdAt;
	private int viewCount;
}
