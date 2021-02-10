package java_study.sub1;

public class Var01 {

	public static void main(String[] args) {
		int score = 100;
		System.out.println("점수는 " + score + "점 입니다.");
		
		add(5, 3);
		System.out.println(add(5,3));
		
		///////////////////////////////////////////////
//		System.out.println("2단 구구단 입니다.");
//		System.out.printf("%d * %d = %d%n", 2, 1, 2*1);
//		System.out.printf("%d * %d = %d%n", 2, 2, 2*2);
//		System.out.printf("%d * %d = %d%n", 2, 3, 2*3);
//		System.out.printf("%d * %d = %d%n", 2, 4, 2*4);
//		System.out.printf("%d * %d = %d%n", 2, 5, 2*5);
//		System.out.printf("%d * %d = %d%n", 2, 6, 2*6);
//		System.out.printf("%d * %d = %d%n", 2, 7, 2*7);
//		System.out.printf("%d * %d = %d%n", 2, 8, 2*8);
//		System.out.printf("%d * %d = %d%n", 2, 9, 2*9);
//		
		
		/////////////////////////////////////////////// 
		gugudan02(2);

		for(int dan = 2; dan < 10; dan++) {
			System.out.println("구구단 " + dan + "단 입니다.");
			for(int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d%n", dan, i, dan*i);
			}
			System.out.println(); // 공백을 위한 줄
		}
		
		gugudan03(); // 구구단 전체 출력
	} // end of main method

	private static void gugudan03() {
		int dan;
		for(dan = 2; dan < 10; dan++) {
			for(int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d%n", dan, i, dan*i);
			}
		}
	} // end of gugudan03

	private static void gugudan02(int i) {
		System.out.println("구구단 2단 입니다.");
		for(i = 1; i < 10; i++) {
		System.out.printf("%d * %d = %d%n", 2, i, 2*i);
		}
	} // end of gugudan02

	private static int add(int i, int j) {
		return i + j;
	} // end of add

} // end of class
