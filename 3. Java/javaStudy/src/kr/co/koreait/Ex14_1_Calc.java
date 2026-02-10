package kr.co.koreait;

public class Ex14_1_Calc {
	// add() 메서드 생성
	// - 매개변수가 2개일수도 있고 3개일수도 있음
	// - 매개변수 2개를 받으면 "2개를 더한 값 : OO"
	// - 매개변수 3개를 받으면 "3개를 더한 값 : OO"
	
	public void add(int a, int b) {
		System.out.println("2개를 더한 값 : " + (a + b));
	}
	public void add(int a, int b, int c) {
		System.out.println("3개를 더한 값 : " + (a+b+c));
	}
}
