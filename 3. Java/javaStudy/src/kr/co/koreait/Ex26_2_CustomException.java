package kr.co.koreait;

// Exception 상속받으면 CheckedException (예외 처리 필수)
// RuntimeException 상속 받으면 UnCheckedException (예외 처리 선택)
// - 컴파일 단계에서 검사 안함, 런타임(실행 중)에 예외 발생하면 자동 전파;
public class Ex26_2_CustomException extends Exception {
	Ex26_2_CustomException(String msg){
		super(msg);
	}
}
