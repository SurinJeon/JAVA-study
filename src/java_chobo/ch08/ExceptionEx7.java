package java_chobo.ch08;

/**
 * @author surin
 * 예외 처리방식 
 * 1. try-catch 
 * 2. throws(전가)
 */
public class ExceptionEx7 {

	public static void main(String[] args) {

		/* 
		 * try문에서 예외발생하면 catch문에서 바로 붙잡힘
		 * 즉, 다른 문장은 실행할 기회조차 없는 것
		 * catch문에서 해당 예외에 대한 에러 내용을 출력하게 만들 수 있음(e.printStackTrace)
		 */
		try {
			System.out.println(2 / 0);
//			throw new RuntimeException("RuntimeException을 던집니다.");
		} catch (RuntimeException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * 사실 RuntimeException은 unchecked error이기 떄문에 반드시 예외처리를 할 필요는 없음...
		 * 그런데 안 하면 비정상적으로 종료될 뿐임
		 * 다른 것들은(checked) 모 두 예 외 처 리 필 요 하 다
		 * 예외처리를 하면 비정상적 종료를 막을 수 있다
		 */
		
		// 아래 RuntimeException은 예외를 던질 수 있다. 왜냐하면 위에서 try-catch로 예외처리 했기 때문
		// 비정상적 종료가 되지 않았기에 아래까지 도달할 수 있다
		throw new RuntimeException("RuntimeException입니다. ArithmeticException이 수행된 후에 발생합니다.");
		// 다만 RuntimeException을 던지기만 했을 뿐, 다른 처리는 하지 않았기에 여기서 비정상적 종료가 된다
		
		// >> 해당 문장은 도달할 수 없어서 에러뜬다
		// System.out.println("Can you reach here?"); 

	}

}
