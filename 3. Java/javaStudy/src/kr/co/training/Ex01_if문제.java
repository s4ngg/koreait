package kr.co.training;

import java.util.Scanner;
public class Ex01_if문제 {

	public static void main(String[] args) {
//		Q1. 점수를 입력받아 60점 이상이면 "합격", 아니면 "불합격" 출력
		Scanner sc = new Scanner(System.in);	
		System.out.printf("점수를 입력하세요 :");
		int score = sc.nextInt();
		System.out.println(score >= 60 ? "합격" : "불합격"); 		
		
		
//		Q2. 정수 하나를 입력받아 짝수인지 홀수인지 출력
		System.out.printf("정수 하나를 입력하세요 :");
		int num = sc.nextInt();
		System.out.println(num%2==0 ? "짝수" : "홀수");
		
//		Q3. 나이를 입력받아 20세 이상이면 "성인", 아니면 "미성년자" 출력
		System.out.printf("나이를 입력하세요:");
		int age = sc.nextInt();
		System.out.println(age>=20 ? "성인" : "미성년자");
		
//		Q4. 비밀번호가 "1234"이면 "로그인 성공", 아니면 "로그인 실패" 출력
		System.out.printf("비밀번호를 입력하세요 :");
		int password = sc.nextInt();
		System.out.println(password==1234 ? "로그인 성공": "로그인 실패");
		
//		Q7. 나이를 입력받아 요금 출력
//		 - 12세 이하 : 3,000원
//		 - 18세 이하 : 5,000원
//		 - 19세 이상 : 10,000원
		System.out.printf("나이를 입력해주세요:");
		int age2 = sc.nextInt();
		if (age2 >= 19) {
			System.out.printf("입력하신 나이는 %d세 임으로 가격은 10,000원 입니다.\n", age2);
		} else if (age2 > 12) {
			System.out.printf("입력하신 나이는 %d세 임으로 가격은 5,000원 입니다.\n", age2);
		} else {
			System.out.printf("입력하신 나이는 %d세 임으로 가격은 3,000원 입니다.\n", age2);
		}

//		Q8. 아이디와 비밀번호를 입력받아 아이디가 "admin"이고 비밀번호가 "1234"면 관리자 로그인 성공
		System.out.printf("아이디를 입력해주세요:");
		String id = sc.next();
		sc.nextLine();
		
		System.out.printf("비밀번호를 입력해주세요:");
		int password2 = sc.nextInt();
		
		System.out.println(id.equals("admin") && password2 == 1234 ? "관리자 로그인 성공" : "관리자 로그인 실패");
		
//		Q9. 점수와 결석 여부를 입력받아 결과 출력
//		 - 결석 여부는 true, false로 받음
//		 - 결석이면 무조건 F
//		 - 90 이상 A
//		 - 80 이상 B
//		 - 70 이상 C
//		 - 그 외 F
		System.out.printf("점수를 입력하세요:");
		int score2 = sc.nextInt();
		
		System.out.printf("결석 여부를 입력하세요: (true or false)");
		boolean gull = sc.nextBoolean();
		
		if (gull == true) {
			if (score2 >= 90) { System.out.println("A"); }
			else if (score2 >= 80) { System.out.println("B"); }
			else if (score2 >= 70) { System.out.println("C"); }
			else { System.out.println("F"); } }
		else { System.out.println("F"); }
			

//		Q10. 스캐너로 사용자로부터 몇 월인지 입력 받으세요.
//		  - 해당하는 계절과 출력 메시지는 아래와 같습니다.
//		  - 3, 4, 5 : 봄
//		  - 6, 7, 8 : 여름
//		  - 9, 10, 11 : 가을
//		  - 12, 1, 2 : 겨울
//		  - 그 외 : 해당하는 계절이 없습니다.
//		        ex) 1을 입력 받을 경우 “겨울” 출력
//		             위의 예시를 활용하여 OR 연산자 또는 AND 연산자를 활용하여 문제를 풀어보세요.

		System.out.printf("몇 월인지 입력하세요:");
		int season = sc.nextInt();
		if (3 <= season && season <= 5) { System.out.println("봄"); }
		else if (6 <= season && season <=8) { System.out.println("여름"); }
		else if (9 <= season && season <=11) { System.out.println("가을"); }
		else {System.out.println("겨울");}

	}

}
