package java_chobo.ch02;

public class Ex_5 {

	public static void main(String[] args) {

		// 1. 하드코딩
		System.out.println(5 + 3);
		System.out.println(5 - 3);
		System.out.println(5 * 3);
		System.out.println(5 / 3);
		
		// 2. 변수를 설정
		int x = 5;
		int y = 3;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		// 3. 함수추출
		expression(5, 3);
		
	}

	private static void expression(int i, int j) {
		
		System.out.printf("두 수의 합은 %d%n", i + j);
		System.out.printf("두 수의 차는 %d%n", i - j);
		System.out.printf("두 수의 곱은 %d%n", i * j);
		System.out.printf("두 수의 나눔은 %d%n", i / j);

	}

}
