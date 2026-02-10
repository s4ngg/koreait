package kr.co.koreait;

import java.util.Arrays;

public class Ex16_Varargs {

	public static void main(String[] args) {
		// 가변길이 매개변수
		// - 매개변수의 개수를 유동적으로 받는 방식
		// - 특징 : 배열로 받음
		// - 사용 방법 : 자료형...
		// - 주의 사항 1 : 가변길이 매개변수는 마지막에 작성되어야 한다.
		// - 주의 사항 2 : 가변길이 매개변수가 작성된 오버로딩은 우선순위가 낮음
		// 	 > 오버로딩은 시그니처(매개 변수 타입)가 가장 정확히 일치하는 메서드를 호출한다.
		
		Ex16_Varargs var = new Ex16_Varargs();
//		var.printNumbers();
		var.printNumbers(1);
		var.printNumbers(1,2,3);
	}
	
	
	public void printNumbers(int num, int... numbers) {
		System.out.println("매개변수 num : " + num);
		System.out.println("가변길이 매개변수 : " + Arrays.toString(numbers)); // toString은 배열을 문자열로 변환
	}
}
