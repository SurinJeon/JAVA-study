package java_chobo.ch04;

import java.util.Scanner;

public class Ex4_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		// 1. 두 정수를 입력받아 큰 수를 출력하는 프로그램을 만들어라.
		// exam01(sc);
		
		// 2. 점수를 입력받아서 90점 이상 수, 80점 이상 우,
		// 70점 이상 미, 60점 이상 양, 나머지 가가 출력되도록 프로그램을 만들어라.
		// exam02(sc);

		// 3. 학생 수만큼 점수 시스템이 반복하도록 만들어라.
		// exam03(sc);

		sc.close();
	
	} // end of main

	
	private static void exam03(Scanner sc) {
		System.out.printf("학생 수를 입력하세요. > ");
		int student = sc.nextInt();
		for(int i = 0; i < student; i++) {
			exam02(sc);
		}
		System.out.println("점수 프로그램을 종료합니다.");
	} // end of exam03

	
	private static void exam02(Scanner sc) {
		System.out.printf("점수를 입력하세요. > ");
		int score = sc.nextInt();
		String result;
		
		switch(score/10){
			case 10:
			case 9:
				result = "수" ;
				break;
			case 8:
				result = "우" ;
				break;
			case 7:
				result = "미" ;
				break;
			case 6:
				result = "양";
				break;
			default:
				result = "가" ;
		}
		System.out.printf("결과는 %s입니다.%n", result);
	} // end of exam02

	
	private static void exam01(Scanner sc) {
		System.out.printf("두 정수를 입력하세요. > ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max = a > b? a : b;
		
		System.out.printf("두 정수 중 큰 수는 %d입니다.%n", max);
	} // end of exam03
	
} // end of class

