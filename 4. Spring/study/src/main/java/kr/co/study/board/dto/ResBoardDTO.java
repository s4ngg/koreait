package kr.co.study.board.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResBoardDTO {
	private Long id;
	private String category;
	private String title;
	private String content;
	private String writerName;
	private LocalDateTime createdAt;
	
	
}
