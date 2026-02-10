package kr.co.koreait;

public class Ex13_3_BankAccount {
	// 입금 메서드
	// - 메서드명 : deposit
	// - 매개변수 : 입금할 금액 (amount)
	// - 출력 형식 : "OOO원을 입금했습니다."
	public void deposit(int amount) {
		System.out.println(amount + "원을 입금했습니다.");
		
	}
	
	// 출금 메서드
	// - 메서드명 : withdraw
	// - 매개변수 : 출금할 금액 (amount)
	// - 출력 형식 : "OOO원을 출금했습니다."
	public void withdraw(int amount) {
		System.out.println(amount + "원을 출금했습니다.");
		
	}
	
	// 계좌 잔액 확인 메서드
	// - 메서드명 : checkBalance
	// - 매개변수 : 없음
	// - 반환 : "현재 잔액을 확인합니다."
	public String checkBalance() {
		return "현재 잔액을 확인합니다.";
	}
}
