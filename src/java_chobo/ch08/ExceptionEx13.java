package java_chobo.ch08;

public class ExceptionEx13 {

	public static void main(String[] args) {

		/* RuntimeException을 main에서 try-catch로 잡아내기 */

		try {
			method01();
		} catch (RuntimeException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

	}

	private static void method01() {

		method2();

	}

	private static void method2() {

		throw new RuntimeException("RuntimeException 발생");
		// RuntimeException을 던짐 그런데 어떠한 예외처리 하지 않음에도 아무런 에러가 뜨지 않음
		// >> RuntimeExcption은 unchecked이기 때문
	}

}
