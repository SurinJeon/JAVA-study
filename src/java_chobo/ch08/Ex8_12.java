package java_chobo.ch08;

public class Ex8_12 {

	/* 디버깅하면서 따라가기*/
	public static void main(String[] args) {

		try {
			method1();
		} catch (Exception e) {
			System.out.println("main에서 예외가 처리되었습니다.");
		} // try-catch for method1

		try {
			method2();
		} catch (Exception e) {
			System.out.println("main에서 예외가 또 처리되었습니다");
		} finally {
			System.out.println("method2를 종료합니다.");
		} // try-catch for method2

	} // end of main

	/*
	 * 만약 반환타입이 int인 method에서 try-catch문을 쓴다면?
	 * >> try와 catch 모두 return을 해야함
	 */
	private static int method2() {

		try {
			System.out.println("method2()가 호출되었습니다.");
			method1();
			return 0;
		} catch (Exception e) {
			System.out.println("method2에서 예외가 처리되었습니다.");
			return 1;
		} finally {
			System.out.println("method2()의 finally 블럭이 실행되었습니다.");
		}

	} // end of method2

	private static void method1() throws Exception {

		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1에서 예외가 처리되었습니다.");
			throw e; // 다시 예외 던지기
		}

	} // end of method1

} // end of class
