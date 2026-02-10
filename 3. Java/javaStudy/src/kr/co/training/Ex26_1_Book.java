package kr.co.training;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex26_1_Book {
	Scanner sc = new Scanner(System.in);

	// add 메서드
	// - 추가할 도서 이름을 입력받습니다. (문자열)
	// > 도서 리스트에 이미 존재하는 도서라면 Ex26_1_DulicateBookException 발생
	// - 추가할 도서의 저자를 입력받습니다. (문자열)
	// - 리스트에 Ex26_2_BookInfo 객체를 추가하세요.
	public void add(ArrayList<Ex26_1_BookInfo> list) throws Ex26_1_DulicateBookException {
		System.out.println("도서 이름 : ");
		String title = sc.nextLine();

		for (Ex26_1_BookInfo s : list) {
			if (s.getTitle().equals(title)) {
				throw new Ex26_1_DulicateBookException("이미 존재합니다.");
			} 
		}
		System.out.println("저자 이름 : ");
		String author = sc.nextLine();
		list.add(new Ex26_1_BookInfo(title, author));
		System.out.println("도서 이름 : " + title + " 저자 이름 : " + author + "이 추가돼었습니다.");

	}

	// remove 메서드
	// - 삭제할 도서 이름을 입력 받습니다. (문자열)
	// > 도서 리스트에 존재하지 않는 도서라면 Ex26_1_BookNotFoundException 발생
	// - 리스트에 해당하는 도서 객체를 제거하세요.
	public void remove(ArrayList<Ex26_1_BookInfo> list) throws Ex26_1_BookNotFoundException {
		System.out.println("삭제할 도서 이름 : ");
		String title = sc.nextLine();
		
		for (int i = 0; i< list.size(); i++) {
			for (Ex26_1_BookInfo s : list) {
				if (list.get(i).getTitle().equals(title)) {
					list.remove(i);
					System.out.println("도서가 삭제됐습니다.");
					return ;
				}
			}
		}
			
		throw new Ex26_1_BookNotFoundException("존재하지 않는 도서입니다.");
	}

// show 메서드
// - 전체 도서를 출력합니다. (도서 이름, 저자)
	public void show(ArrayList<Ex26_1_BookInfo> list) {
		System.out.println("전체 도서를 출력합니다.");
		int cnt = 1;
		for (int i=0; i < list.size(); i+=2) {
			for (Ex26_1_BookInfo s : list) {
				System.out.println(cnt + "번째 도서 : " + s.getTitle() + " 저자 : " + s.getAuthor());
				cnt ++;
			}
		}
	}
	
// search 메서드
// - 검색할 도서 이름을 입력 받습니다. (문자열)
// > 도서 리스트에 존재하지 않는 도서라면 Ex26_1_BookNOtFoundException 발생
// - 리스트에 해당하는 도서가 있다면 정보를 출력하세요. (도서 이름, 저자)
	public void search(ArrayList<Ex26_1_BookInfo> list) throws Ex26_1_BookNotFoundException{
		System.out.println("도서 이름 : ");
		String title = sc.nextLine();
		
		for(Ex26_1_BookInfo s : list) {
			if(s.getTitle().equals(title)) {
				System.out.println("입력하신 도서의 이름 : " + s.getTitle());
				System.out.println("도서의 저자는 " + s.getAuthor() + "입니다.");
				return ;
				
			} 
		}
		throw new Ex26_1_BookNotFoundException("존재하지 않는 도서입니다.");
	}

}