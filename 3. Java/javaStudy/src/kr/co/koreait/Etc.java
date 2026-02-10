package kr.co.koreait;

import java.util.Arrays;

public class Etc {

	public static void main(String[] args) {
		Etc e = new Etc();
		int num = 10;
		System.out.println("메서드 호출 전 : " + num);
		
		e.changeInt(num);
		
		System.out.println("메서드 호출 후 :" + num);
	// ---------------------
		int[] numArr = {1,2,3};
		System.out.println("메서드 호출 전 : " + Arrays.toString(numArr));
		
		e.changeArr(numArr);
		
		System.out.println("메서드 호출 후 :" + Arrays.toString(numArr));
		
	
	}
	
	public void changeArr(int[] numbers) {
		numbers[0] = 999;
		System.out.println("메서드 호출 : " + Arrays.toString(numbers));
	}
	
	public void changeInt(int num) {
		num = 1000;
		System.out.println("메서드 호출 : " + num);
	}
}
