package kr.co.training;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_ArrayList {

	public static void main(String[] args) {
		// Q1. 6의 배수만 리스트에 추가하세요
		// - 리스트 이름 : q1
		// - 들어가는 값들의 타입은 숫자
		// - 1~200사이의 6의 배수만 리스트 q1에 추가
		ArrayList<Integer> q1 = new ArrayList<>();
		for (int i = 1; i <= 200; i++) {
			if (i % 6 == 0) {
				q1.add(i);
			}
		}
		System.out.println(q1);

		// Q2. 학생 정보를 저장하기 위한 ArrayList를 생성하세요.
		// - 프로그램을 아래와 같은 메뉴를 사용자로부터 입력받습니다.
		// > "1. 학생 추가"
		// > "2. 학생 목록 조회"
		// > "3. 프로그램 종료"
		// > "메뉴 입력 :"
		// - 1번 입력 시 사용자로부터 학생의 이름을 입력 받고 ArrayList에 추가
		// - 2번 입력 시 ArrayList에 저장된 모든 학생의 이름 출력
		// - 3번 입력 시 "프로그램을 종료합니다." 출력 후 종료
		// - 위의 프로그램은 사용자가 종료를 선택할때 까지 반복됩니다.
		// - 리스트 이름 : student

		ArrayList<String> student = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		int idx = 0;

		while (menu != 0) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 특정 학생 제거");
			System.out.println("3. 학생 목록 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println("메뉴 입력 :");
			menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("학생의 이름을 입력하세요. :");
				String name = sc.next();
				student.add(name);

			} else if (menu == 2) {
				// 학생 이름 입력받아서 그 학생 제거
				System.out.println("제거할 학생의 이름을 입력하세요 :");
				String remove_name = sc.next();
				System.out.println(student);
//				for(String s : student) { 
//					if (s.equals(remove_name)) { 
				// for each 문은 값을 꺼내서 사용하는 것이기 때문에 equals에 해당하는 값이 리스트에서 빠져나와 조회가 됨.
				// 그럼으로 변수 idx와 맞지 않는 값이 나와서 오류가 발생.
//						student.remove(idx);
//					} idx ++;
//				}				
				for (int i = 0; i < student.size(); i++) {
					if (student.get(i).equals(remove_name)) {
						student.remove(i);
					}
				}
			} else if (menu == 3) {
				System.out.println("전체 학생의 이름을 조회합니다.");
				System.out.println(student);
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
