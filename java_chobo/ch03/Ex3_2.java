package java_chobo.ch03;

public class Ex3_2 {

	public static void main(String[] args) {

		// 증감 연산자 전위형, 후위형
		int i = 5;
		int j = 0;
		
		j = i++;
		System.out.printf("j = i++; 실행 후, i = %d, j = %d%n", i, j);
		
		i = 5;
		j = 0; // 다시 원점
		
		j = ++i;
		System.out.printf("j = ++i; 실행 후, i = %d, j = %d%n", i, j);
		
		// method 호출에 증감연산자 사용 예시
		i = 5;
		j = 5;
		
		System.out.println(i++); // 출력 이후 증가
		System.out.println(++j); // 증가 이후 출력
		
		System.out.printf("i = %d, j = %d", i, j);
		
	} // end of main

}
