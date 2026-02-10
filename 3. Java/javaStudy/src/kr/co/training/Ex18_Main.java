package kr.co.training;

public class Ex18_Main {

	public static void main(String[] args) {
		Ex18_1_Buy buy = new Ex18_1_Buy(1000000);
		
		
		System.out.println("초기 소지금은 " + buy.getBalance() + "원 입니다.");
		// 모니터 구매
		buy.buyMonitor();
		
		// 마우스 구매
		buy.buyMouse();
		
		// 데스크탑 구매
		buy.buyDesktop();
		
		// 최종 소지금
		System.out.println("최종 금액은 " + buy.getBalance() + "원 입니다.");
	}

}
