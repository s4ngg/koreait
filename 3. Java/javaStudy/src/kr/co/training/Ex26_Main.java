package kr.co.training;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex26_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex26_1_Book book = new Ex26_1_Book(); // 도서 관련 기능이 있는 객체;
		ArrayList<Ex26_1_BookInfo> list = new ArrayList<>();
		
		while(true) { // print 여러 줄 사용하면 """으로 가능 java 8 이상만 가능
			System.out.println("""       
					1. 도서 추가
					2. 도서 삭제
					3. 도서 전체 조회
					4. 도서 검색
					0. 종료
					메뉴 : 
					""");
			int menu = sc.nextInt();
			try {
				switch(menu) {
				case 1 -> book.add(list);
				case 2 -> book.remove(list);
				case 3 -> book.show(list);
				case 4 -> book.search(list);
				case 0 -> {
					System.out.println("종료");
					return; 
				}
			}
			}catch (Ex26_1_DulicateBookException | Ex26_1_BookNotFoundException e) {
				System.out.println("오류 : " + e);
			}
		}
	}
}


