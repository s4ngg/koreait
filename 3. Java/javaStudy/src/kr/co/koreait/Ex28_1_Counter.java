package kr.co.koreait;

public class Ex28_1_Counter {
	private int count = 0;
	
	public synchronized void increment() { // synchronized는 모니터락으로 데이터의 일관성과 정확성을 위해 사용. 다중 쓰레드 사용시
		count ++;
	}
	
	public int getCount() {
		return count;
	}
}
