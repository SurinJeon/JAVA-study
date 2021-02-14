package java_chobo.ch08;

/**
 * @author surin
 * Exception의 종류에 대하여
 */
public class ExceptionEx11 {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3};
		int[] arr2 = null;
		System.out.println(1);
		System.out.println(2);
		
		/* 
		 * try-catch-finally문 사용하기
		 * 우리의 목표는 예외처리를 통해
		 * 제일 마지막 문장엔 5까지 출력되도록 정상실행상태 유지하는 것
		 */
		
		try {
			System.out.println(3);
			
			/*
			 * System.out.println(arr2[0]);
			 * >> NullPointerException
			 */
			
			/*
			 * System.out.println(arr[arr.length]);
			 * >> ArrayIndexOutOfBoundsException
			 */
			
			/*
			 * System.out.println(0/0);
			 * >> ArithmeticException
			 */
			System.out.println(4);
		} catch (NullPointerException e) {
			System.err.println("NullPointerException이 발생했습니다.");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException이 발생했습니다.");
		} catch (ArithmeticException e) {
			System.err.println("ArithmeticException이 발생했습니다.");
		} catch (Exception e) { // 가장 큰 범위의 class (가장 부모임 그래서 가장 나중에 와야함)
			System.err.println("Exception이 발생했습니다.");
			e.printStackTrace();
			// 비정상 종료와 같은 문장이 콘솔창에 뜨지만 비정상 종료가 아님
			// >> 왜냐하면 catch문 안에 있기 때문에 정상종료가 됨 (예외처리를 통해 그 다음 것을 계속 수행할 수 있음)
		} finally { // finally는 반드시 수행됨(catch에 걸리든 안 걸리든)
			System.out.println("finally");
		}
		
		System.out.println(5); // 5까지 찍히면 정상종료 성공한 것
		
		/*
		 * 물컵에 물을 떠야하는데 누군가 불러서 행동을 멈췄다.
		 * 1. 물컵에 물을 넣는 중에 (try)
		 * 2. 누군가 불러서 행동을 멈추게 되었다.(catch)
		 * 3. 행동은 멈췄지만 수도꼭지는 잠궈야한다.(finally)
		 */
		
	} // end of main

} // end of class
