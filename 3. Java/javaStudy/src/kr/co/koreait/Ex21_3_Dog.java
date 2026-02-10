package kr.co.koreait;

public class Ex21_3_Dog extends Ex21_3_Animal {
//	- 매개변수 있는 생성자(String name, int age)가 있습니다.
//    > super()를 사용하여 name, age를 받는 부모 생성자를 호출하세요.
	Ex21_3_Dog(String name, int age) {
		super(name, age);
	}
	
//  - wagTail 메서드
//    > "강아지가 꼬리를 흔듭니다."을 출력합니다.
//    > 반환, 매개변수 없음
	public void wagTail() {
		System.out.println("강아지가 꼬리를 흔듭니다.");
	}
	
}
