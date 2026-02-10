package kr.co.koreait;

public class Ex25_1_Calculator {
	private int num1;
	private int num2;
	
	// 매개변수 2개 받아서 필드에 저장하는 생성자
	Ex25_1_Calculator(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	class Calc {
		public int add() {
			return num1 + num2;
		}
	}
}
