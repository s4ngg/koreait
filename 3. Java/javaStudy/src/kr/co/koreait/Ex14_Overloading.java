package kr.co.koreait;

public class Ex14_Overloading {

	public static void main(String[] args) {
		// 오버로딩 (Overloading)
		// - 같은 메서드 이름을 사용하지만 매개변수의 타입(자료형)과 위치가 다른 방식
		Ex14_Overloading over = new Ex14_Overloading();
		
		over.introduce("김상우1");
		over.introduce("김상우2+", 19);
		
		//Ex14_1_Calc
		Ex14_1_Calc calc = new Ex14_1_Calc();
		calc.add(1,2);
		calc.add(2,4,5);
	}
	public void introduce(String name) {
		System.out.println("안녕하세요. 제 이름은 " + name + "입니다.");
	}
	
	public void introduce(String name, int age) {
		System.out.println("이름: " + name + ", 나이 : " + age);
	}
}
