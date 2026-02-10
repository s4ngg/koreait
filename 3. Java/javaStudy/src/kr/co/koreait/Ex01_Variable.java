package kr.co.koreait;

import java.util.Scanner;

public class Ex01_Variable {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		// 변수 선언
		// - 내가 varNum이라는 변수를 사용할거다.
		int varNum;
		
		// 변수 초기화
		// - varNum이라는 변수에 숫자10을 할당
		// - 참고 : 값을 리터럴이라고도 표현한다.
		varNum = 10;
		
		System.out.println(varNum);
		
		// 명시적 초기화
		// - 변수 선언과 초기화를 동시에 하는 것
		int num1 = 100;
		
		// <자료형>
		// 1. 논리형 (true / false)
		boolean isStudent = true; // 1byte
		
		// 2. 문자형 (단일 문자)
		// - 반드시 ' ' 사용
		char grade = 'A'; // 2byte
		
		// 3. 정수형
		byte smallNumber = 127;        // 1byte
		short shortNumber = 32000;     // 2byte
		int age = 19;                  // 4 byte
		long population = 8_000_000_000L; // 8 byte
		
		// 4. 실수형
		float pi = 3.14F; // 4byte
		double gravity = 9.80665; // 8byte
		System.out.println(pi);
		System.out.println(gravity);
		
		// <비트>
		// - 컴퓨터에서 정보를 표현하기 위한 최소 단위
		// - 0 또는 1로 표현된다.
		
		// <바이트>
		// - 8개의 bit로 이루어진 단위
		// - 8bit = 1byte
		
		// 예를 들어
		//  0   1  1  1 0 0 1 0 
		// 128 64 32 16 8 4 2 1
		
		int userAge = 19;
		System.out.println("유저 나이는 : " + userAge);
		userAge = 22;
		System.out.println("변경된 유저 나이는 : "+ userAge);
		
		// 상수
		// - 값을 한번 초기화하면 수정할 수 없는 변수
		// - 관례적으로 대문자로 이루어진 스네이크 표기법을 사용
		final int USER_AGE = 100;
		// USER_AGE = 200;
		System.out.println("USER_AGE : "+USER_AGE);
		
		
		// <형변환>
		// - 변수에 이미 선언된 자료형(데이터 타입)을 변경하는 것
		
		
		// 자동 형변환 (암시적 형변환)
		// - 개발자가 직접 형변환을 해주지 않아도 컴파일 과정에서 자동으로 변환된다.
		// - 범위가 작은 자료형 -> 범위가 큰 자료형
		byte num3 = 10;
		int num4 = num3; // 1byte -> 4byte
		System.out.println(num4);
		
		// 문자를 숫자로 바꾸면 아스키코드표에 있는 10진수가 나온다.
		// - a는 97, A는 65
		char ch = 'a';
		int num5 = ch;
		System.out.println(num5);
		
		// 실수형은 메모리 설계상 양수보다 더 넓은 범위를 사용하기 때문에 가능
		long longNumber = 100000000000L;
		float floatNumber = longNumber; // 8byte -> 4byte
		System.out.println(floatNumber);
		
		// 강제 형변환 (명시적 형변환)
		// - 개발자가 직접 형변환을 작성 해줘야하며 하지 않을 경우 컴파일 에러 발생
		// - 범위가 큰 자료형 -> 범위가 작은 자료형
		// - 주의 : 큰 자료형에서 작은 자료형으로 변환하기 때문에 데이터 손실 발생할 수 있음
			
		long lNumber = 1000000000000L;
		int iNumber = (int)lNumber;
		System.out.println(iNumber);
		
		
		//--------------------------------------------------------------
		System.out.println("줄바꿈을 포함");
		System.out.println("줄바꿈 없음, 줄바꿈 할거면 개행 문자 : \n");
		
		System.out.printf("줄바꿈 없음, 변수를 서식문자 사용");
		// 서식 문자 : 데이터의 출력 형식을 지정하는 특수문자
		
		// 서식 문자의 종류
		// 1. %b : boolean
		// 2. %d : 정수 (byte, short, int, long)
		// 3. %o : 8진수
		// 4. %x : 16진수
		// 5. %f : 실수(float, double)
		// 6. %c : 문자(char)
		// 7. %s : 문잦열(String)
		// 8. %n : 개행 문자 (줄바꿈)
		String name = "김상우";
		int age2 = 19;
		String addr = "인천";
		System.out.printf("안녕하세요. 제 이름은 %s 입니다. 나이는 %d 이고 사는 곳은 %s에 살고 있습니다.", name, age2, addr);
		
		double pi_double = 3.14;
		System.out.printf("pi_double의 값은 %.2f 입니다.", pi_double);
		
		// 이스케이프 문자 : 백슬래시(\)와 문자를 조합한 문자
		
		// 이스케이프 종류
		// 1. \n : 줄바꿈(개행 문자)
		// 2. \t : 탭
		// 3. \b : 백스페이스
		// 4. \문자 : 특수 문자를 일반 문자열로 인식해야할때 사용
		System.out.println("\"Hello, World!\"");
		System.out.printf("개행 문자는 \n 입니다.");
		
		//------------------------------------------------------
		// Scanner Class
		// - 사용자로부터 콘솔에 값을 입력 받는 기능을 제공하는 클래스
		
		// 사용 방법
		// 1.Scanner Class 불러오기
		// 	> 파일 상단에 import.util.Scanner;
		// 2.객체 생성하기
		//	> Scanner sc = new Scanner(System.in);
		// 3.사용자 입력받기 (변수에 저장)
		//	> String choice = sc.nextLine();
		Scanner sc = new Scanner(System.in);
		
		// 스캐너의 메서드들
		// 1. nextInt();
		// 2. nextFloat();
		// 3. nextDouble();
		// 4. next();
		//		-> 단어를 처리할 때 사용되며 공백전까지 입력 받은 데이터를 반환
		// 5. nextLine();
		//		-> 문자열을 처리할 때 사용되며 \n를 기준으로 데이터를 반환
		//		   (엔터를 입력하면 \n가 들어간다.) 
//		System.out.print("이름 : ");
//		String inputName = sc.next();
//		
//		System.out.println(inputName);
//		
//		String inputName2 = sc.next();
//		String inputName3 = sc.next();
//		
		System.out.print("숫자 : ");
		int inputNumber = sc.nextInt();
		System.out.println("입력한 숫자 : " + inputNumber);
		
		sc.nextLine(); // 개행 문자 처리하기 위해서.
		
		System.out.print("주소 : ");
		String inputAddr = sc.nextLine();  
		System.out.println("입력한 주소 : " + inputAddr);
	}
}
