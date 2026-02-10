package kr.co.training;

public class Ex24_3_CarImpl implements Ex24_3_Car {

//	- Car 인터페이스를 상속 받습니다.
//	- boolean isRunning = false; // 운행 상태 여부
//	- int speed = 0;   // 자동차 속도
	boolean isRunning = false;
	int speed = 0;

//	- start 메소드 구현
//	   - isRunning 변수가 false일 때
//	      --> isRunning 변수를 true로 변경
//	      --> "자동차가 시작되었습니다." 출력
//	   - isRunning 변수가 true일 때
//	      --> "자동차가 이미 시작되어 있습니다." 출력
	
	public void start() {
		if (isRunning == false) {
			isRunning = true;
			System.out.println("자동차가 시작되었습니다.");
		} else {
			System.out.println("자동차가 이미 시작되어 있습니다.");
		}
	}
	
//	- stop 메소드 구현
//	   - isRunning 변수가 true일 때
//	      --> isRunning 변수를 false로 변경
//	      --> spped 변수의 값을 0으로 변경
//	      --> "자동차가 정지되었습니다." 출력
//	   - isRunning 변수가 false일 때
//	      --> "자동차가 이미 정지되어 있습니다." 출력
	public void stop() {
		if (isRunning == true) {
			isRunning = false;
			speed = 0;
			System.out.println("자동차가 정지되었습니다.");
		} else {
			System.out.println("자동차가 이미 정지되어 있습니다.");
		}
	}
	
	
//	- accelerate(int speed) 메소드 구현
//	   - isRunning 변수가 true일 때
//	      --> 인스턴스변수 speed의 현재값에 매개변수 speed 더함
//	      --> "자동차가 " + speed + "km/h로 가속 중입니다."  출력
//	   - isRunning 변수가 false 일 때
//	      --> "자동차가 정지 상태 입니다. 먼저 시작하세요." 출력
	public void accelerate(int speed) {
		if (isRunning == false) {
			System.out.println("자동차가 정지 상태 입니다. 먼저 시작하세요.");
		} else {
			this.speed = this.speed + speed;
			System.out.println("자동차가 " + speed + "km/h로 가속 중 입니다.");
		}
	}
	
//	- brake() 메소드 구현
//	   - (if) isRunning 변수가 true, 그리고 spped가 0보다 클 때
//	       --> 인스턴스 변수 spped의 현재값에 10을 줄임
//	       --> "자동차가 감속 중입니다." 출력
//	   - (else if) speed가 0보다 작거나 같을 때
//	       --> "자동차가 이미 정지상태 입니다." 출력
//	   - (else)
//	       --> "자동차가 정지 상태입니다. 먼저 시작하세요." 출력
	public void brake() {
		if (isRunning == true && speed > 0) {
			System.out.println("자동차가 감속 중 입니다.");
			this.speed = this.speed - 10;
		} else if (isRunning == true && speed <= 0) {
			System.out.println("자동차가 이미 정지상태 입니다.");
		} else {
			System.out.println("자동차가 정지 상태 입니다. 먼저 시작하세요.");
		}
	}
	
//	- getInfo() 메소드 구현
//	   - String status 변수 선언
//	   - isRunning 변수가 true일 때
//	      --> status 변수의 값을 "운행 중" 으로 변경
//	   - isRunning 변수가 false일 때
//	      --> status 변수의 값을 "정지" 으로 변경
//	   - "상태: " + status + ", 현재 속도: " + speed + "km/h" 문자열 반환
	public String getInfo() {
		String status;
		if (isRunning == true) {
			status = "운행 중";
		} else {
			status = "정지";
		}
		return "상태: " + status +", 현재 속도: " + speed + "km/h";
	}


}
