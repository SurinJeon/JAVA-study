package java_chobo.ch04;

import java.util.Random;
import java.util.Scanner;

public class Looptest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 1-A
		// test1a();
	
		// 1-B
		// test1b(scan);
		
		// 1-C
		// test1c(scan);
		
		// 2
		// test02(scan);
		
		// 3
		// test03(scan);

		// 4-A
		//test4a();
		
		// 4-B
		// test4b();
		
		// 4-C
		// test4c();
		
		scan.close();
	
	} // end of main


	private static void test4c() {
		int i;
		int j;
		 
		for(j = 1; j < 8; j++) {
			for(i = 1; i < 8; i++) {
				if(i >= j) {
					System.out.printf("*");
				}
			}
			System.out.println();
		}
	} // end of test4c


	private static void test4b() {
		int i;
		 int j;
		 
		 for(j = 1; j < 8; j++) {
			 for(i = 1; i < 8; i++) {
				 if(i <= j) {
					 System.out.printf("*");
				 }
			 }
			 System.out.println();
		 }
	} // end of test4b


	private static void test4a() {
		int i;
		int j;
		
		for(j = 0; j < 7; j++) {
			for(i = 0; i < 7; i++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	} // end of test4a


	private static void test03(Scanner scan) {
		Random rnd = new Random(100);
		int answer = rnd.nextInt(100) + 1;
		System.out.printf("정답은 %d입니다.%n", answer);
		int input = 0 ;
		
		while(input != answer) {
			System.out.printf("정수를 입력하세요. (1-100) > ");
			input = scan.nextInt();
			
			if(answer > input && input >= 0) {
				System.out.println("정답은 이것보다 이상입니다.");
			}else if(input > answer && input >= 0) {
				System.out.println("정답은 이것보다 이하입니다.");
			}else if(input < 0) {
				System.out.println("음수입니다. 양수를 입력해주세요!");
			}
		} // end of while
		System.out.println("정답입니다!");
	} // end of test03


	private static void test02(Scanner scan) {
		int num;
		int a; // 천의 자리
		int b; // 백의 자리
		int c; // 십의 자리
 		int d; // 일의 자리
 		
 		// abcd -> dcba
		
		do {
			System.out.printf("네 자리 정수를 입력하세요! > ");
			num = scan.nextInt();
			if(num >= 0) {
				a = (num / 1000) % 10;
				b = (num / 100) % 10;
				c = (num / 10) % 10;
				d = num % 10;
				System.out.printf("보정된 숫자는 %d%d%d%d입니다.%n", d, c, b, a);
			}else {
				System.out.println("음수입니다.");
			}
			
		}while(num >= 0);
		System.out.println("시스템을 종료합니다.");
	} // end of test02
	

	private static void test1c(Scanner scan) {
		int input = 0;
		int output = 0;
		
		System.out.printf("정수를 입력하세요. > ");
		do {
			input = scan.nextInt();
		
			if(input != 0) {
				output = output + input;
			}
			
		}while(input != 0);
		
		System.out.printf("총 합계는 %d입니다. ", output);
		System.out.println("시스템을 종료합니다.");
	} // end of test1c

	
	private static void test1b(Scanner scan) {
		int output = 0;
		int input = 0;
		int i = 0;
		
		System.out.printf("누적 덧셈 정수 갯수와 각 정수를 입력하세요. > ");
		int first = scan.nextInt();
		
		while(i < first) {
			input = scan.nextInt();
			output = output + input;
			i++;
		}
		System.out.printf("현재 누적 합계는 %d입니다.", output);
	} // end of test1b

	
	private static void test1a() {
		int sum = 0;
		
		for(int i = 0; i < 101; i++) {
			sum = sum + i;
		}
		System.out.printf("1부터 100까지 합은 %d입니다.", sum);
	} //end of test1a

} // end of class