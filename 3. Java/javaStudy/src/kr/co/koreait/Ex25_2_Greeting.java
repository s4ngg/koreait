package kr.co.koreait;

public class Ex25_2_Greeting {
//	지역 내부 클래스
	public void sayHello() {
		class LocalInnerClass{
			public void print() {
				System.out.println("메서드 안에서만 사용가능한 클래스!");
			}
		}
		
		LocalInnerClass local = new LocalInnerClass();
		local.print();
	}
}
