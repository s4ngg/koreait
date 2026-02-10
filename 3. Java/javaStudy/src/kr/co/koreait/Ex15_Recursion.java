package kr.co.koreait;

public class Ex15_Recursion {

	public static void main(String[] args) {
		Ex15_Recursion rs = new Ex15_Recursion();
		int result = rs.sum(5);
		System.out.println(result);
		
		
	}
	
	public int sum(int n) {
		if (n==1) {
			return 1;
		}
		return n + sum(n-1); // 자기 자신을 다시 받아오는 것이 재귀호출
	}
	
	public void test(int n) {
		if (n==0) {
			return;
		}
		System.out.println(n + " ");
		test (n-1); //  이렇게 작성하면 5,4,3,2,1로 출력됨
		// 반대로 test (n-1)을 sysout 위에 작성하면 test(5),test(4),...test(1)이 출력되지 않고 저장되다가 마지막에 출력해서
		// 1,2,3,4,5 이런식으로 역으로 출력됨
		
	}
}
