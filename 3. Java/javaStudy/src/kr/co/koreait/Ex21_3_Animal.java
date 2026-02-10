package kr.co.koreait;

public class Ex21_3_Animal {
//	  - Animal 클래스에는 인스턴스 변수 name과 age가 있습니다. (private 아님)
	String name;
	int age;
	
//	  - 매개변수 있는 생성자(String name, int age)가 있습니다.
	Ex21_3_Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	  - eat 메서드
//	    > System.out.printf("%s(%d) 이(가) 먹는중입니다.") 
//	    > 반환, 매개변수 없음
	public void eat() {
		System.out.printf("%s(%d) 이(가) 먹는중입니다.", name, age);
	}
	
//	  - sleep 메서드
//	    > System.out.printf("%s(%d) 이(가) 자는중입니다.") 
//	    > 반환, 매개변수 없음
	public void sleep() {
		System.out.printf("%s(%d) 이(가) 자는중입니다.", name, age);
	}
	
}









