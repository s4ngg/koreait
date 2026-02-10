package kr.co.koreait;

public class Ex18_Filed {
	//필드
	int num = 10; // 인스턴스 변수

	public static void main(String[] args) {
		// 필드 (=멤버 변수)
		// - 클래스 레벨의 변수를 의미 
		
//		int num2 = 20;
//		
//		Ex18_Car car = new Ex18_Car();
//		car.wheel = 5;
//		
//		System.out.println(car.speed);
//		System.out.println(car.wheel);
//		
//		
//		Ex18_Car sonata = new Ex18_Car();
//		sonata.wheel = 7;
//		sonata.speed = 140;
//		
//		System.out.println(sonata.speed);
//		System.out.println(sonata.wheel);
//		// -------------------------------
//		
		EX18_2_Person jjanggu = new EX18_2_Person("신짱구",5,"떡잎마을","010-1234-5678");
//		jjanggu.name = "jjangu";
//		jjanggu.age = 5;
//		jjanggu.addr = "떡잎마을";
//		jjanggu.phone = "010-1234-5678";
		jjanggu.introduce();

		EX18_2_Person test = new EX18_2_Person("철수",5);
		test.introduce();
//		
//		EX18_2_Person minsu = new EX18_2_Person();
//		minsu.name = "minsu";
//		minsu.age = 19;
//		minsu.addr = "대한민국";
//		minsu.phone = "010-8765-4321";
//		minsu.introduce();
		
//		EX18_2_Person.introduce(); 
		System.out.println(EX18_2_Person.HOBBY); 
		
	}

}
