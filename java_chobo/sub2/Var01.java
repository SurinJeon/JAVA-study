package java_study.sub2;

public class Var01 {

	public static void main(String[] args) {

		System.out.println("start - main");
		
		add01(3, 4); // method by void 
		int result = add02(3, 4);
		System.out.printf("add02의 결과 값은 %d입니다.%n", result); // method by int
		
		System.out.println("end - main");
	}

	private static void add01(int i, int j) {
		System.out.println("start - add01");
		int temp = i + j;
		System.out.printf("add01의 결과 값은 %d입니다.%n", temp);
		System.out.println("end - add01");
	}

	private static int add02(int i, int j) {
		return i + j;
	}

}
