package kr.co.koreait;

import java.util.Scanner;

public class Ex04_switch {

	public static void main(String[] args) {
		// switch문
		// - 특정 변수의 값이 일치하면 (==) 코드를 실행하는 조건문
		
		int num = 2;
		
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 2:
			System.out.println("num은 2입니다.");
			break;
		default:
			System.out.println("num은 1도 2도 아닙니다.");
		}
		
		String name = "김상우";
		
		switch(name) {
		case "짱구":
			System.out.println("짱구님 어서오세요.");
			break;
		case "김상우":
			System.out.println("김상우님 어서오세요.");
			break;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요");
		System.out.println("1.아이스 아메리카노");
		System.out.println("2.카페라떼");
		System.out.println("3.스무디");
		int choice = sc.nextInt();
		
		// 1번이면 "아이스 아메리카노를 선택하셨습니다." 출력
		// 2~3번도 동일
		// 그 외의 숫자를 누르면 "해당하는 메뉴가 없습니다" 출력
		
		switch(choice) {
		case 1:
			System.out.println("아이스 아메리카노를 선택하셨습니다.");
			break;
		case 2:
			System.out.println("카페라떼를 선택하셨습니다.");
			break;
		case 3:
			System.out.println("스무디를 선택하셨습니다.");
			break;
		default:
			System.out.println("해당하는 메뉴가 없습니다.");
		}
		
		System.out.print("요일 입력 :");
		int day = sc.nextInt();
		
		switch(day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("평일입니다.");
			break;
		case 6:
		case 7:
			System.out.println("주말입니다.");
			break;
		}
	}
}
