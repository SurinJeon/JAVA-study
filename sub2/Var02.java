package java_study.sub2;

public class Var02 {

	public static void main(String[] args) {
		
		// 1. 1부터 10까지 누적 합
		int sum = 0;
		for(int i = 0; i < 11; i++) {
			sum = sum + i; 
		}
		System.out.println(sum);
		
		
		// 2. 함수추출 a부터 b까지 누적합
		sum = 0;
		sum(1, 100);
		
		
		// 3. 1부터 100까지 홀수 합
		int oddSum = 0;
		for(int i = 1; i < 101; i+=2) {
			oddSum = oddSum + i;
		}
		System.out.println(oddSum);
		
		
		// 4. 1부터 100까지 짝수 합
		int evenSum = 0;
		for(int i = 0; i < 101; i+=2) {
			evenSum = evenSum + i;
		}
		System.out.println(evenSum);
		
		System.out.printf("홀수 합과 짝수 합의 총합은 %d입니다.%n", oddSum + evenSum);
		
		
		// 5. for if 중첩문
		oddSum = 0;
		evenSum = 0;
		for(int i = 0; i < 101; i++) {
			if(i % 2 == 0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("1부터 100까지 홀수 합 = " + oddSum);
		System.out.println("1부터 100까지 짝수 합 = " + evenSum);
		System.out.printf("홀수합 %d, 짝수합 %d, 총합%d%n", 
				oddSum, 
				evenSum, 
				oddSum + evenSum);

		
		// 6. if와 for를 써서 1부터 100까지 짝/홀 합 구하기 by함수추출
		seperatesum(1, 5);
		
	} // end of main

	
	private static void seperatesum(int i, int j) {
		int oddSum = 0;
		int evenSum = 0;
		for(int k = i; k < j + 1; k++) {
			if(k % 2 == 0) {
				evenSum = evenSum + k;
			} else {
				oddSum = oddSum + k;
			}
		}
		System.out.println("홀수 합 = " + oddSum);
		System.out.println("짝수 합 = " + evenSum);
	}

	
	private static void sum(int a, int b) {
		int sum = 0;
		for(int i = a; i < b + 1; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	} // end of sum

} // end of Class
