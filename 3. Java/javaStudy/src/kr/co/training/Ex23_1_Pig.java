package kr.co.training;

public class Ex23_1_Pig extends Ex23_1_Animal {
	// Animal 클래스를 상속 받습니다.
	
	// cry 메서드를 오버라이딩 하세요.
	// - 매개변수 동일
	// - "돼지가 OOO하고 소리를 냅니다." 출력
	@Override
	public void cry(String soundString) {
		System.out.println("돼지가 " + soundString + "하고 소리를 냅니다.");
	}
}
