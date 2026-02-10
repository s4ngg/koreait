package kr.co.koreait;

public class Ex26_1_Unchecked {
	public static void main(String[] args) {
		try {
			ExceptionTest.uncheckedMethod();
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("예외 발생!");
		}
		
	}
}
class ExceptionTest{
	public static void uncheckedMethod() {
		// UncheckedException (선택 예외)
		// - throws를 작성하지 않아도 UncheckedExeption은 예외가 자동 전파됨
		throw new ArrayIndexOutOfBoundsException();
	}
}
