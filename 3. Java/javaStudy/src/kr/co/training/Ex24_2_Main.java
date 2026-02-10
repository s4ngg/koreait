package kr.co.training;

import java.util.Scanner;

public class Ex24_2_Main {

	public static void main(String[] args) {
//		사용자로부터 아이디와 비밀번호를 입력받으세요.
		Scanner sc = new Scanner(System.in);
		Ex24_2_Login login = new Ex24_2_Login();
		
		System.out.println("아이디를 입력하세요 : ");
		String id = sc.next();
		
		System.out.println("비밀번호를 입력하세요 : ");
		String pwd = sc.next();
		
//		아래 클래스들을 모두 구현 후 login 메서드를 호출하세요.
//	    	  > 사용자가 입력한 아이디와 비밀번호를 인자값으로 전달해주어야 합니다.
//	    	  > 반환받은 값을 result 변수에 저장 후 출력합니다.
		String result = login.login(id, pwd);
		System.out.println(result);
	}
}
