package java_chobo.ch06;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		// 팩토리얼 입력받아 계산하는 프로그램
		// factorial(sc);

		// 10진수->2진수
		decTobin(sc);

		
		sc.close();

	} // end of main


	private static void decTobin(Scanner sc) {

		System.out.printf("십진수를 입력하세요. (0-255) > ");
		int num = sc.nextInt();

		int x;  
		int y;
		int a = num * 2 ;

		x = a / 2;
		y = x % 2;

		int[] binArr = new int[8];
		for(int i = 0; i < binArr.length; i++) {

			if(y == 1) {
				binArr[(binArr.length - 1) - i] = 1;
			}

			x = x / 2;
			y = x % 2;

		} // end of for

		for(int b : binArr) {
			System.out.printf(b + " ");
		}

	} // end of decToBin


	public static void factorial(Scanner sc) {
		System.out.printf("factorial 수를 입력하세요. > ");

		int num = sc.nextInt();
		int factorial = 1; 

		for(int i = 0; i < num; i++) {

			factorial = factorial * (i + 1);

		} // end of for

		System.out.println("팩토리얼 결과값은 " + factorial + "입니다.");
	}

} // end of class