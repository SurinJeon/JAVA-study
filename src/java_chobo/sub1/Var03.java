package java_chobo.sub1;

public class Var03 {
	private static final double PI = 3.14;
	public static void main(String[] args) {
		
		System.out.println("PI > " + PI);
				
		long ll = 3L;
		System.out.println(ll);
		
		float ff = 0; // 결과를 돌리면 0.0으로 나옴 (정수형은 실수형으로 typecast 가능)
		System.out.println(ff);
		
		int a = 0; // <변수 선언 및 초기화>
		System.out.println(a);
		
		boolean isMale = false; // boolean형은 is가 들어감, boolean 기본값은 false
		System.out.println(isMale);
		
		int b = (int) 10L; //typecast 하는 방법(도움말로 활용 가능)
		// 10L는 long형으로 8byte라서 자동으로 4byte인 int에 들어갈 수 없는 것
		
		prnTest01(); // by void
		System.out.println("a > " + prnTest02()); // by int
		
	} // end of main
	
	
	private static void prnTest01() {
		int a;
		a = 10;
		System.out.println("a > " + a);
	} // end of prnTest01

	
	private static int prnTest02() {
	
		int a = 10;
		return a;
	} // end of prnTest02

} // end of Class
