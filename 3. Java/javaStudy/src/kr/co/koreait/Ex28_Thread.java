package kr.co.koreait;

public class Ex28_Thread {
	public static void main(String[] args) throws InterruptedException {
//		Ex28_Test t1 = new Ex28_Test("쓰레드1");
//		t1.start(); // 새로운 스레드를 생성하며 실행
//		t1.run(); // 현재 스레드에서 실행
////		t1.join();
////		System.out.println("쓰레드1 종료");
//		
//		Ex28_Test t2 = new Ex28_Test("쓰레드2");
////		t2.start();
//////		t2.join();
//////		System.out.println("쓰레드2 종료");
///// 
//		Ex28_Test t1 = new Ex28_Test("쓰레드1");
//		Ex28_Test t2 = new Ex28_Test("쓰레드2");
//		
//		t1.setOther(t2);
//		t2.setOther(t1);
//		
//		t1.start();
//		t2.start();
		
//	<Runnable 인터페이스 구현해서 사용할 때>
		
//		// 1. Runnable을 물려받은 객체 생성
//		Ex28_Test et1 = new Ex28_Test();
//		Ex28_Test et2 = new Ex28_Test();
//		
//		// 2. Thread 객체 생성
//		Thread t1 = new Thread(et1, "쓰레드1");
//		Thread t2 = new Thread(et2, "쓰레드2");
//		
//		et1.setOther(t2);
//		et2.setOther(t1);
//		t1.start();
//		t2.start();
		
		Ex28_1_Counter counter = new Ex28_1_Counter();
		Ex28_1_NumberPrinter np1 = new Ex28_1_NumberPrinter(counter, 1, 100);
		Ex28_1_NumberPrinter np2 = new Ex28_1_NumberPrinter(counter, 1, 100);
		
		Thread t1 = new Thread(np1, "쓰레드-1");
		Thread t2 = new Thread(np2, "쓰레드-2");
		t1.start();
		t2.start();
	} 
}

// Thread 클래스를 상속받으면 자바에서는 단일 상속만 지원하기 때문에
// 다른 필요한 클래스를 상속받을 수 없는 단점이 있음
// class Ex28_Test extends Thread {
class Ex28_Test implements Runnable {
	private Thread other;
	
//	Ex28_Test(String name) {
//		super(name);
//	}

	@Override
	public void run() {
		System.out.println("쓰레드 시작");
		System.out.println("현재 쓰레드 : " + Thread.currentThread().getName());
		
		if(other != null) {
			System.out.println(other.getName() + " 쓰레드의 종료 기다리는 중");
			try {
				other.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println(other.getName() + " 쓰레드가 종료됨!");
		}
	}
	
	public void setOther(Thread other) {
		this.other = other;
	}
}