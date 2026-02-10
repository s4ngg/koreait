package kr.co.koreait;

import java.util.Scanner;

public class Ex13_2_Person {
		// 이름, 나이 입력받고 "안녕하세요. 제 이름은 OOO, 나이는 OO살 입니다." 출력
	public String introduce() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("이름을 입력해주세요 :");
		String name = sc.next();
		System.out.println("나이를 입력해주세요 :");
		int age = sc.nextInt();
		
		System.out.println("제 이름은 " + name + ", 나이는 " + age + "살 입니다.");
		return name; 
	}

	// sayAge() 메서드 생성
	// - 매개변수로 나이를 받은 후
	// - 나이를 반환
	//	> "OO살 입니다."
	public int sayAge(int age) {
		System.out.println(age + "살 입니다.");
		return age;
	}
	
	
}
