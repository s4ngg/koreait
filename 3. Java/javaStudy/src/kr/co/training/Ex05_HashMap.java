package kr.co.training;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05_HashMap {

	public static void main(String[] args) {
		// "이름" : "전화번호" 형태의 phoneBook이라는 HashMap을 생성
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		HashMap<String, String> phoneBook = new HashMap<>();
		
		while(isTrue) {
			System.out.println("1. 전화번호 추가");
			System.out.println("2. 전화번호 검색");
			System.out.println("3. 전화번호 전체 검색");
			System.out.println("4. 전화번호 삭제");
			System.out.println("0. 프로그램 종료");
			int menu = sc.nextInt();
			sc.nextLine();
			
			// 1번 입력 시 
			// - 사용자로부터 이름과 전호번호를 입력받습니다.
			// - 입력받은 이름을 key로, 전화번호를 값으로 phoneBook에 저장
			// - "OOO의 전화번호를 추가했습니다." 출력
			if (menu == 1) {
			System.out.println("이름을 입력해주세요 :");
			String name = sc.next();
			
			System.out.println("전화번호를 입력해주세요 : (-는 빼고 입력해주세요)");
			String number = sc.next();
			
			phoneBook.put(name, number);
			System.out.println(name + "의 전화번호를 추가했습니다.");
			}
			
			// 2번 입력 시
			// - 사용자로부터 검색할 이름을 입력받습니다.
			// - phoneBook에 일치하는 이름이 있다면
			//		> "OOO의 전화번호는 OOO-OOOO-OOOO 입니다." 출력
			// - phoneBook에 일치하는 이름이 없다면
			//		> "OOO의 전화번호를 찾을 수 없습니다." 출력
			else if (menu == 2) {
				System.out.println("검색할 이름을 입력해주세요 :");
				String search_name = sc.next();
				
				if (phoneBook.containsKey(search_name)) {
					System.out.println(search_name + "의 전화번호는 " + 
				phoneBook.get(search_name).substring(0,3) + "-" +
				phoneBook.get(search_name).substring(3,7) + "-" +
				phoneBook.get(search_name).substring(7) + "입니다.");
				} else {
					System.out.println(search_name + "의 전화번호를 찾을 수 없습니다.");
				}
			}
				
//				if (phoneBook.get(search_name) != null) {
//					System.out.println(search_name + "의 전화번호는 " + 
//					phoneBook.get(search_name).substring(0,3) + "-" +
//					phoneBook.get(search_name).substring(3,7) + "-" +
//					phoneBook.get(search_name).substring(7) + "입니다.");
//				} else {
//					System.out.println(search_name + "의 전화번호를 찾을 수 없습니다.");
//				}
//			}
			
			// 3번 입력 시
			// - phoneBook에 존재한 모든 목록을 출력
			//		> "이름: OOO, 전화번호: OOO-OOOO-OOOO"
			else if (menu == 3) {
				for (String s : phoneBook.keySet()) {
				System.out.println("이름 :" + s + ", 전화번호:" + 
				phoneBook.get(s).substring(0,3) + "-" +
				phoneBook.get(s).substring(3,7) + "-" +
				phoneBook.get(s).substring(7)); 
				}	
			}
			
			// 4번 입력 시
			// - 사용자로부터 삭제할 이름을 입력받습니다.
			// - phoneBook에 일치하는 이름이 있다면
			//		> phoneBook에서 해당 이름을 가진 전화번호 제거 후
			//		  "OOO의 전화번호를 삭제했습니다." 출력
			// - phoneBook에 일차하는 이름이 없다면
			//		> "OOO의 전화번호를 찾을 수 없습니다." 출력
			else if (menu == 4) {
				System.out.println("삭제할 이름을 입력하세요 :");
				String remove_name = sc.next();
				
				if (phoneBook.containsKey(remove_name)) {
					phoneBook.remove(remove_name);
					System.out.println(remove_name + "의 전화번호를 삭제했습니다.");
				} else {
					System.out.println(remove_name + "의 전화번호를 찾을 수 없습니다.");
				}
			}
			// 0번 입력 시
			// - "프로그램을 종료합니다." 출력 후 프로그램 종료
			else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				isTrue = false;
			}
			
			// 그 외
			// - "올바른 메뉴를 입력해주세요." 출력
			else {
				System.out.println("올바른 메뉴를 입력해주세요.");
			}
		}
	}

}
