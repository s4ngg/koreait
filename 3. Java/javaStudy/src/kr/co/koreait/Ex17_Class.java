package kr.co.koreait;

import java.util.Scanner;

// 하나의 소스 파일 (.java)에서 여러개의 클래스를 작성할 때 주의점
// 1. 하나의 소스 파일은 1개의 public class만을 가져야 함
// 2. public class가 없는 경우에는 소스 파일의 이름과 클래스 이름이 아무거나 1개 일치해야 한다.
// 3. public class는 무조건 소스 파일의 이름과 일치해야한다.


public class Ex17_Class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 클래스 (class)
		// - 개발자가 특정 프로그램을 만들기 위한 설계도(틀)
		// - ex) 계산기 클래스, 회원 클래스, ...
		
		// 접근제어자
		// - public : 전체 패키지에서 접근 가능
		// - (default) : 같은 패키지에서만 접근 가능
		
		// 네이밍 규칙
		// - 대소문자를 구분한다.
		// - 파스칼 표기법을 사용한다.
		//	> Board, User, ... (앞글자가 대문자)
		
		
	}
}

class test {
	
}