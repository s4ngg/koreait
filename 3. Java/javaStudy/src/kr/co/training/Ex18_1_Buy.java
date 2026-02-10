package kr.co.training;

public class Ex18_1_Buy {
	// <필드>
	// 1. 소지금(balance)
	//	  > 정수 타입, 변수 선언만
	int balance;
	
	// 2. 모니터 가격(MONITOR_PRICE)
	//	  > 정수 타입, 상수, 값 20,000
	final int MONITOR_PRICE = 20000;
	
	// 3. 마우스 가격(MOUSE_PRICE)
	//	  > 정수 타입, 상수, 값 18,000
	final int MOUSE_PRICE = 18000;
	
	// 4. 데스크탑 가격(DESKTOP_PRICE)
	//    > 정수 타입, 상수, 값 570,000
	final int DESKTOP_PRICE = 570000;
	
	// <생성자>
	// - 초기 금액을 전달 받는 생성자를 작성하세요.
	//		> 정수 타입의 매개변수 1개를 받습니다.
	//		> 매개변수 이름 : balance
	//		> 소지금 필드에 값을 할당하세요.
	Ex18_1_Buy(int balance){
		this.balance = balance;
	}
	
	
	// <모니터 구매 메서드>
	// - 메서드 이름 : buyMonitor
	// - 반환 타입 : 없음
	// - 매개 변수 : 없음
	// - 아래의 조건을 충족하도록 코드를 작성하세요.
	//		> 소지금 - 모니터 가격을 변수 amount에 할당합니다. (지역 변수)
	//		> amount가 0보다 작을 경우 "소지금이 부족합니다. 출력
	//		> 그 외의 경우 amount를 소지금에 할당 후 
	//		"모니터를 구입하셨습니다."
	//		"남은 금액은 OOOO원 입니다."
	public void buyMonitor() {
		int amount = balance - MONITOR_PRICE;
		if (amount < 0) {
			System.out.println("소지금이 부족합니다.");
		} else {
			balance = amount;  
			System.out.println("모니터를 구입하셨습니다.");
			System.out.println("남은 금액은 " + balance + "원 입니다.");
		}
	}
	
	
	// <마우스 구매 메서드, 데스크탑 구매 메서드>
	// - 메서드 이름 : buyMouse, buyDesktop
	// - 이하 로직은 모니터 구매 메서드와 완전 동일
	public void buyMouse() {
		int amount = balance - MOUSE_PRICE;
		if (amount < 0) {
			System.out.println("소지금이 부족합니다.");
		} else {
			balance = amount;
			System.out.println("마우스를 구입하셨습니다.");
			System.out.println("남은 금액은 " + balance + "원 입니다.");
		}
	}
	
	public void buyDesktop() {
		int amount = balance - DESKTOP_PRICE;
		if (amount < 0) {
			System.out.println("소지금이 부족합니다.");
		} else {
			balance = amount;
			System.out.println("데스크탑을 구입하셨습니다.");
			System.out.println("남은 금액은 " + balance + "원 입니다.");
		}
	}
	
	// <소지금을 확인하는 메서드>
	// - 메서드 이름 : getBalance
	// - 소지금을 반환합니다.
	public int getBalance() {
		return balance;
	}
	
	
	
}
