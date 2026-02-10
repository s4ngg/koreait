package kr.co.koreait;

public class Ex23_2_Calendar {
	 String color;
	 int months;
	 
	 Ex23_2_Calendar(String color, int months){
		 this.color = color;
		 this.months = months;
	 }
	 
	 public void info() {
		 System.out.println(color + "색 달력은 " + months + "월 까지 있습니다.");
	 }
	 
	 public void hanging() {
		 System.out.println(color + "색 달력을 벽에 걸 수 있습니다.");
	 }
}
