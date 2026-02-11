package kr.co.study.board.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import kr.co.study.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Board {
	@Id // PK 지정
	@GeneratedValue(strategy=GenerationType.IDENTITY) // auto_increment와 동일한 기능
	private Long id;
	
	// 게시판 종류 구분
	// - NOTICE : 공지사항
	// - FREE : 자유게시판
	private String boardType;
	
	private String category;
	private Integer viewCount;
	private String title;
	@Lob // 대용량 데이터를 의미한다.
	private String content;
	
	@ManyToOne // (Board 엔티티) N : 1 관계. 1개의 아이디로 여러개 작성 가능하기 위한 기능
	@JoinColumn(name="writer_id") // DB에 만든 Table Column의 이름 (FK 컬럼명)
	private Member writer;
	
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	// 저장되기 전 자동 호출
	@PrePersist
	public void perPersist() {
		this.createdAt = LocalDateTime.now();
		this.updatedAt = LocalDateTime.now();
	}
	
	// 수정되기 전 자동 호출
	@PreUpdate
	public void preUpdate() {
		this.updatedAt = LocalDateTime.now();
	}
}
