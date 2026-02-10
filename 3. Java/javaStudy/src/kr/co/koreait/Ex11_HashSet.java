package kr.co.koreait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Ex11_HashSet {

	public static void main(String[] args) {
		// HashSet
		// - 중복 불가
		// - 순서 보장하지 않음
		HashSet<Integer> hash = new HashSet<>();
		hash.add(10);
		hash.add(20);
		hash.add(30);
		hash.add(10);
		System.out.println(hash);
		
		ArrayList<String> a = new ArrayList<>();
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("B");
		a.add("A");
		
		// 중복 제거
		// - AraayList에 있는 데이터를 HashSet으로 변환
		HashSet<String> set = new HashSet<>(a);
		System.out.println(set);
		
		ArrayList<String> result = new ArrayList<>(set);
		System.out.println(result);
		
		// 정렬
		Collections.sort(result);
	}

}
