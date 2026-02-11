package kr.co.studyProject.member.service.impl;

import org.springframework.stereotype.Service;
import kr.co.studyProject.MemberService.MemberService;
import kr.co.studyProject.dto.ReqLoginDTO;
import kr.co.studyProject.dto.ReqRegisterDTO;
import kr.co.studyProject.dto.ResLoginDTO;
import kr.co.studyProject.entity.Member;
import kr.co.studyProject.repository.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
@RequiredArgsConstructor

public class MemberServiceImpl implements MemberService {
	private final Repository memberRepository;
	private final BCryptPasswordEncoder passwordEncoder;
	
	@Override 
	public void register(ReqRegisterDTO request) {
		// 비밀번호 확인,검증
		if(!request.getPassword().equals(request.getPassword())) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return ;
		}
		// 이메일 중복 체크
		if(memberRepository.existsByEmail(request.getEmail())) {
			System.out.println("이미 사용중인 이메일 입니다.");
			return ;
		}
		// 비밀번호 암호화
		String encodedPassword = passwordEncoder.encode(request.getPassword());
		
		// 빌더
		Member member = Member.builder()
						.userId(request.getUserId())
						.userName(request.getUserName())
						.email(request.getEmail())
						.password(encodedPassword)
						.build();
//		Member member = new Member();
//		member.setUserId(request.getUserId());
//		member.setUserName(request.getUserName());
//		member.setEmail(request.getEmail());
//		member.setPassword(encodedPassword);
		
		memberRepository.save(member);
	}
	@Override
	public ResLoginDTO login(ReqLoginDTO request) {
		Member member = memberRepository.findByEmail(request.getEmail());
		
		if(member == null) {
			return null;
		}
		if(!passwordEncoder.matches(request.getPassword(), member.getPassword())) {
			return null;
		}
		
		ResLoginDTO response = new ResLoginDTO();
		response.setId(member.getId());
		response.setUserId(member.getUserId());
		response.setUserId(member.getUserName());
		response.setCreatedAt(member.getCreatedAt());
		response.setUpdatedAt(member.getUpdatedAt());
		
		return response;
	}
}
