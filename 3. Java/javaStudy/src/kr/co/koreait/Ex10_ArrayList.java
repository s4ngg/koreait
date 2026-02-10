package kr.co.koreait;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex10_ArrayList {

	public static void main(String[] args) {
		// ArrayList
		// - 같은 자료형을 가진 데이터를 묶어서 관리하는 자료구조 (배열)
		// - 크기를 동적으로 조절
		
		// < > 안에는 무조건 참조형 변수를 넣어줘야 함 (기본형 사용 불가)
		//         자료형
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(10);
		
		intList.add(2,999);
		
		System.out.println(intList); 
		System.out.println(intList.get(2)); //2번 인덱스에 있는 값 조회
		
		//ArrayList에 요소가 몇 개 들어가 있는지 반환
		System.out.println("ArrayList의 길이 : " + intList.size());
		// .size() = .length()와 동일하다.
		
		for(Integer n : intList) { 
			// null 체크가 필요할 때 → 반드시 Integer, int 대신 Integer로 선언해야 언박싱이 발생하지 않음
			// 만약 int[] 배열이면 for(int : )로 해야 언박싱이 발생하지 않음.
			System.out.println(n);
		}
		
		intList.remove(2); // 2번 인덱스 요소 삭제
		intList.clear(); // 전체 요소 삭제
		System.out.println("삭제 후 intList : " + intList);
		
		// 비어있는지 확인하는 메서드
		// - 비워져있으면 true, 요소가 1개라도 있으면 false
		System.out.println("isEmpty : " + intList.isEmpty()); 	
		
		// -----------------------------------------------------------------
		// LinkedList
		// - 각각의 노드가 데이터와 포인터를 가지고 있는 자료구조
		// - 포인터 : 다음 노드의 위치
		LinkedList<String> linked = new LinkedList<>();
		linked.add("A");
		linked.add("B");
		linked.add("C");
		
		linked.remove(1);
		System.out.println(linked);
		
		
		
	}
}