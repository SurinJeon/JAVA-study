package java_chobo.ch06;

import java.util.Scanner;

public class TestingRecursive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// factorial 생성
		System.out.printf("factorial 정수를 입력하세요. > ");
		int n = sc.nextInt();
		fact(n);

		System.out.println("결과 : " + fact(n));
		sc.close();
		
	} // end of main

	private static int fact(int n) {
		
		int result = 0;
		
		if(n == 1) {
			return 1;
		}else {
			result = n * fact(n - 1);
		}
		return result;
		
	} // end of fact

}
