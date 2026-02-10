package kr.co.koreait;

public class Ex23_Poly {

	public static void main(String[] args) {
		// 클래스 타입 변환 (자식 객체를 부모 타입으로)
		// - 부모 클래스에 있는 변수와 메서드만 사용 가능
		
		Ex23_2_DeskCalendar dc = new Ex23_2_DeskCalendar("빨강", 8);
		Ex23_2_Calendar c = dc; // 클래스 타입 변환
				
		Ex23_2_Calendar calendar = new Ex23_2_DeskCalendar("빨강", 8);
		calendar.info();
		calendar.hanging();
		dc.onTheDesk();
		
		System.out.println(c == dc);
		
		Ex23_3_ComputerRoom cr = new Ex23_3_ComputerRoom();
		cr.computer1 = new Ex23_3_Samsong();
		cr.computer2 = new Ex23_3_Samsong();
		cr.computer3 = new Ex23_3_Samsong();

		cr.computer1 = new Ex23_3_LZ();
		cr.computer2 = new Ex23_3_LZ();
		cr.computer3 = new Ex23_3_LZ();
		
		cr.allPowerOn();
	}

}
