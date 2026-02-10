package kr.co.koreait;

public class Ex21_1_Parent {
	String name;
	
	Ex21_1_Parent() {
		super();
		System.out.println("부모 생성자입니다.");
	}
	
	
	
	public void info() {
		System.out.println("부모 클래스의 " + name + "입니다.");
	}
}
