package kr.co.koreait;

public class Ex13_Method {

	public static void main(String[] args) {
		// 메서드
		//	- 정의된 동작이나 기능을 수행
		
		// 객체 생성 (= 인스턴스 화)
		//	- 코드를 메모리에 올리는 과정
		// 	- 클래스명 변수명 = new 클래스명();
		Ex13_Method m = new Ex13_Method(); // 해당 1줄로 Ex13_Method 클래스 안에 있는 모든 메소드들 사용 가능.
		String result = m.printHello("안녕하세요");
		System.out.println(result);
		
		Ex13_1_Calc calc = new Ex13_1_Calc();
		int result1 = calc.add(5, 3);
		System.out.println(result1);
		// --------------------------------
	
		int mul = calc.mul(2, 3, 5, 6);
		System.out.println(mul);
		
		int div = calc.div(6, 5);
		System.out.println(div);
		// ---------------------------------------- 01.30
		int[] numbers = {100,200,300,400};
		
		int add = calc.add(1, 2);
		int sum = calc.sub(numbers);
		System.out.println(sum);
		
		System.out.println(add);
		// -----------------------------------------------------
		// -----------------------------------------------------
		
//		Ex13_2_Person p = new Ex13_2_Person();
//		
//		String name = p.introduce();
//		int age = p.sayAge(10);
		
		
		// ---------------- BankAccount;
		Ex13_3_BankAccount ba = new Ex13_3_BankAccount();
		ba.deposit(5000); 
		ba.withdraw(3000);
	    String cb = ba.checkBalance();	
	    System.out.println(cb);
		
		
		
	}

	// 안녕하세요를 출력하는 메서드
	// public 반환타입 메서드명 (자료형 매개변수명) { }
	// - 반환 타입의 종류 : void, int, String, int[], ArrayList<>, ...
	// - void : 반환 타입 없음(return 없음)
	public String printHello(String str) {
		System.out.println(str);
		return "잘 출력돼었습니다.";
	}
}

