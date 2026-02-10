package kr.co.koreait;

public class Ex23_3_ComputerRoom {
	Ex23_3_Computer computer1;
	Ex23_3_Computer computer2;
	Ex23_3_Computer computer3;
	
	public void allPowerOn() {
		computer1.powerOn();
		computer2.powerOn();
		computer3.powerOn();
	}
	
	public void selectPowerOn(Ex23_3_Computer computer) {
		computer.powerOn();
	}
}