package java_chobo.ch08;

public class ExceptionEx12 {

	public static void main(String[] args) {

		/*try { */
			method1();
		/*} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}*/
		
	}

	/*
	 * method1 안에서 try-catch해줬으면 main에서는 별 문제 없음 (try-catch 없어도 작동됨)
	 * 만약 throws로 넘겼다면 최후의 main에서는 해줘야함
	 */
	
	private static void method1() /*throws Exception*/ {
		
		try { 
			method2();
		} catch (Exception e) {
			System.err.println("예외가 발생했습니다");
			System.err.println(e.getMessage());
		}
		
	}

	/* 예외를 던저서 throws로 전가시킴*/

	private static void method2() throws Exception {
		
		throw new Exception("예외발생");
		
	}

}
