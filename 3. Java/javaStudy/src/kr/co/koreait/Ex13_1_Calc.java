package kr.co.koreait;

public class Ex13_1_Calc {
	/** JavaDocs로써 메서드의 역할을 설명해주는 것 /**로 작성
	 * 숫자 두개를 더하는 메서드입니다.
	 * @param num1
	 * @param num2
	 * @return num1 + num2의 값
	 */
	public int add(int num1, int num2) {
//		System.out.println(num1 + num2);
		return num1 + num2;
	}
	
	// 빼기 메서드 (sub)
	// - 매개변수 3개를 받습니다.
	// - 3개를 뺀 값을 반환합니다.
	public int sub(int numbers[]) {
		int resultSum = 0;
		
		for (int i=0; i<numbers.length; i++) {
			resultSum += numbers[i];
		}
		
		return resultSum;
	}
	
	// 곱셈 메서드 (mul)
	// - 매개변수 4개를 받습니다.
	// - 4개를 곱한 값을 반환합니다.
	public int mul(int num1, int num2, int num3, int num4) {
		return num1*num2*num3*num4;
	}
	
	// 나눗셈 메서드(div)
	// - 매개변수 2개를 받습니다.
	// - 2개를 나눈 몫을 출력하세요.
	// - 2개를 나눈 나머지를 반환하세요.
	
	public int div(int num1, int num2) {
		System.out.println(num1 / num2);
		return num1 % num2;
	}
}
