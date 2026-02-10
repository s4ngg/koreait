package kr.co.koreait;

public class Ex24_2_PineapplePhone2 implements Ex24_2_Phone2 { // 인터페이스 상속 implements
	@Override
	public void openingLogo() {
		System.out.println("@@@");
	}
	
	@Override
	public void powerOn() {
		System.out.println("파인애플 폰 켜짐");
	}
	
	@Override
	public void powerOff() {
		System.out.println("파인애플 폰 꺼짐");
	}
}
