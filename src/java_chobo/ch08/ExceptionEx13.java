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
		
		// 아래 문장 뜨면 정상종료된 것 (마지막문장까지 도달했으므로)
		System.out.println("정상종료 되었습니다.");

	}

	private static void method01() {

		method2();
		method2(); 
		/*
		 * 두 개가 있어도 한 번 예외 잡히면 바로 올라감
		 * method를 타고 여러개 있어도 일단 감지하기만하면
		 * catch가 바로 잡아서 들어올림
		 * >> 그래서 두번째 method2는 시행되기도 전에 잡힘
		 */

	}

	private static void method2() {

		throw new RuntimeException("RuntimeException 발생");
		// RuntimeException을 던짐 그런데 어떠한 예외처리 하지 않음에도 아무런 에러가 뜨지 않음
		// >> RuntimeExcption은 unchecked이기 때문
	}

}
