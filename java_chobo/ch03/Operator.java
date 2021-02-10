package java_chobo.ch03;

public class Operator {

	public static void main(String[] args) {

		// Operator
		
		boolean isMale = false; // 초기화의 형태 false
		System.out.println(isMale);
		
		int sum  = 10 + 4;
		System.out.println(sum);
		
		// 삼항연산자 (상황에 따라서 if나 삼항연산자 사용/가독성 차이!)
		int a = 5;
		int b = 3;
		String c = a > b? "a가 크다." : "b가 크다.";
		System.out.println(c);
		
		boolean isGreat = a > b? true : false;
		int max = a > b? a : b;
		
	}

}
