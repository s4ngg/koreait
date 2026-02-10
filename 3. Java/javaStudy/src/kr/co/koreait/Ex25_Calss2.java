package kr.co.koreait;

public class Ex25_Calss2 {

	public static void main(String[] args) {
		// <정적 중첩 클래스 생성 방법>
		//		OuterClass.InnerClass inner = new OuterClass.InnerClass();
//		inner.print();
		
		// <비정적 중첩 클래스 생성 방법>
		// 1. 바깥 클래스 객체 생성 먼저
		
		OuterClass outer = new OuterClass();
		
		// 2. 안쪽(inner) 클래스 객체 생성
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.print();
		
		Ex25_1_Calculator outCal = new Ex25_1_Calculator(2,2);
		Ex25_1_Calculator.Calc inCal = outCal.new Calc();
		System.out.println(inCal.add());
		
		// 익명 내부 클래스
		Animal animal = new Animal() {
		
			@Override
			public void sound() {
				System.out.println("소리를 냅니다.");
			}
		}; // 익명 내부 클래스는 객체를 생성하는 표현식으로 ;을 붙혀줘야한다.
		
		// 람다식
		Animal animal2 = () -> System.out.println("멍멍!");
	}

}

interface Animal {
	void sound();
}

class OuterClass {
	private static int staticNum = 10; // 클래스 변수
	private int instanceNum = 20; // 인스턴스 변수

//	static class InnerClass{ 정적 중첩 클래스
	class InnerClass { // 비정적 중첩 클래스
		public void print() {
			OuterClass out = new OuterClass();
			System.out.println(out.instanceNum);
			System.out.println(staticNum);
		}
	}

}