package kr.co.training;

public class Ex23_1_Farm {
	// sound()  메서드를 가집니다.
	// - 돼지와 소 객체를 매개변수로 받습니다.
	//		> 다형성을 활용하여 하나의 매개변수로 두 객체를 받으세요.
	// - 매개변수로 전달받은 객체의 cry() 메서드를 호출하세요.
	public void sound(Ex23_1_Animal animal, String soundString) { 
		// 매개변수를 2개 받아서 앞에는 class 용, 뒤에는 문자열 용으로 사용
		animal.cry(soundString);
	}
}
