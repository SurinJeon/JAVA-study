package java_chobo.ch08;

public class ExceptionEx12 {

	public static void main(String[] args) {

		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

	private static void method1() {
		
		try {
			method2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	/* 예외를 던저서 throws로 전가시킴*/

	private static void method2() throws Exception {
		
		throw new Exception("예외발생");
		
	}

}
