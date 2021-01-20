package java_chobo.ch02;

import java.util.Scanner;

public class Ex2_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.printf("두 정수를 입력하세요. > ");
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		
//		System.out.printf("두 정수의 합은 %d입니다.%n", x + y);
		
		System.out.printf("문자를 입력하세요. > ");
		String str = sc.nextLine();

		int num = Integer.parseInt(str);
		System.out.println("str은 "+ str);
		System.out.println("str은 "+ num);
		
		sc.close();
		
	} // end of main

} // end of class
