package java_chobo.sub2;

public class Var03 {

	public static void main(String[] args) {
		// 1. 1부터 100까지 5의 배수 합
		int fiveSum = 0;
		for(int i = 0; i < 101; i++) {
			if(i % 5 == 0) {
				fiveSum= fiveSum + i;
			}
		}
		System.out.printf("1부터 100까지 5의 배수의 합은 %d입니다.%n", fiveSum);

		
		// 2-1. 누적값 함수 추출 by int
		System.out.printf("1부터 100까지 함수로 추출한 결과값은 %d입니다.%n", add1To100(1, 100));
		
		
		// 2-2. 누적값 함수 추출 by void
		add01To100(5, 90);
		
	} // end of main

	private static int add1To100(int i, int j) {
		int sum = 0;
		for(int a = i; a < j + 1; a++) {
			sum = sum + a;
		}
		return sum;
	} // end of add1To100
	
	private static void add01To100(int i, int j) {
		int sum = 0;
		for(int a = i; a < j + 1; a++) {
			sum = sum + a;
		}
		System.out.printf("%d부터 %d까지의 값은 %d입니다.%n", i, j, sum);
	} // end of add1To100

} // end of Class
