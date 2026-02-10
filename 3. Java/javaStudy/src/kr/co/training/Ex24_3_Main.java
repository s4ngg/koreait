package kr.co.training;

import java.util.Scanner;

public class Ex24_3_Main {
    public static void main(String[] args) {																												
        Ex24_3_Car car = new Ex24_3_CarImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 시작");
            System.out.println("2. 자동차 정지");
            System.out.println("3. 자동차 가속");
            System.out.println("4. 자동차 감속");
            System.out.println("5. 자동차 정보 출력");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Enter 키 처리

            switch (choice) {
                case 1:
                    car.start();
                    break;
                case 2:
                    car.stop();
                    break;
                case 3:
                    System.out.print("가속할 속도를 입력하세요: ");
                    int accelerateSpeed = scanner.nextInt();
                    car.accelerate(accelerateSpeed);
                    break;
                case 4:
                    car.brake();
                    break;
                case 5:
                    System.out.println(car.getInfo());
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }
}
