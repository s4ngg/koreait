package kr.co.training;

public class Ex20_3_Member {
//	2. Ex20_3_Member
//	  - introduce 메서드
//	    > Ex20_3_MemberInfo를 매개변수로 받습니다.
//	    > "이름 : "
//	    > "나이 : "
//	    > "사는곳 : "
//	    > "학생여부 : "    (true면 학생, false 학생 아님)
//	 - run 메서드
//	    > Ex20_3_MemberInfo를 매개변수로 받습니다.
//	    > "OOO에 사는 OO이 달리고 있습니다." 출력
	public void introduce(Ex20_3_MemberInfo memberInfo) {
		String strStudent;
		
		if(memberInfo.getIsStudent()) { // 가져온 isStudent가 true면
			strStudent = "학생";
		} else { // 가져온 isStudent가 false면
			strStudent = "학생 아님";
		}
		
		System.out.println("이름 : " + memberInfo.getName());
		System.out.println("나이 : " + memberInfo.getAge());
		System.out.println("사는곳 : " + memberInfo.getAddr());
		System.out.println("학생여부 : " + strStudent);
	}
	
	
	
	
}
