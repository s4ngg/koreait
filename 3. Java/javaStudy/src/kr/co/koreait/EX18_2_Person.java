package kr.co.koreait;

public class EX18_2_Person {
	// 필드 선언만
	// 이름(name)
	// 나이(age)
	// 주소(addr)
	// 핸드폰번호(phone)
	String name;
	int age;
	String addr;
	String phone;
	final static String HOBBY = "잠자기"; 
	// static이 변수면 클래스 변수로 바로 사용가능
	// 안붙으면 인스턴스 변수로 stack, heap에 넘어가 주소값으로 사용.
	
	EX18_2_Person(String name, int age, String addr, String phone) { // 생성자
		System.out.println("생성자가 호출되었습니다.");
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.phone = phone;
		// this는 참조변수로 인스턴스 자신을 가르킨다.
	}
	
	// 이름하고 나이만 받는 생성자
	// - 주소랑 핸드폰 번호는 기본값을 지정해서 준다.
	EX18_2_Person(String name, int age){
		this.name = name;
		this.age = age;
		this.addr = "지구";
		this.phone = "아직 없음";
		
	}
	
	
	//introduce 메서드
	// - "이름 : OO"
	// - "나이 : OO"
	// - "주소 : OO"
	// - "핸드폰번호 : OO"
	public void introduce( ) {
		System.out.println("ㅎㅇ");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		System.out.println("핸드폰번호 : " + phone);
	}
}
