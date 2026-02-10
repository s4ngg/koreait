package kr.co.koreait;

public class Ex24_Abstract {

	public static void main(String[] args) {
		Ex24_1_PineapplePhone p = new Ex24_1_PineapplePhone();
		p.powerOn();
		
		Ex24_2_PineapplePhone2 p2 = new Ex24_2_PineapplePhone2();
		
		p2.powerOn();
		p2.powerOff();
		p2.openingLogo();
		System.out.println(Ex24_2_PineapplePhone2.MAX_BATTERY_CAPACITY);
		
	}
}