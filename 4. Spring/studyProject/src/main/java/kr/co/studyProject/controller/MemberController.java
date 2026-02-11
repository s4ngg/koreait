package kr.co.studyProject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import kr.co.studyProject.MemberService.MemberService;
import kr.co.studyProject.dto.ReqLoginDTO;
import kr.co.studyProject.dto.ReqRegisterDTO;
import kr.co.studyProject.dto.ResLoginDTO;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor

public class MemberController {
	private final MemberService memberService;
	
	// 회원가입
	@GetMapping("/register/form")
	public String registerForm() {
		return "/signup";
	}
	
	@PostMapping("/register")
	public String register(ReqRegisterDTO request) {
		memberService.register(request);
		System.out.println("postmap");
		return "redirect:/member/login/form";
	}
	
	// 로그인
	@GetMapping("/login/form")
	public String loginForm() {
		return "/login";
	}
	@PostMapping("login")
	public String login(ReqLoginDTO request,
			HttpSession session) {
		ResLoginDTO response = memberService.login(request);		

		if(response == null) {
			return "redirect:/member/login/form";
		}

		session.setAttribute("LOGIN_USER", response);
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/member/login/form";
	}
}
