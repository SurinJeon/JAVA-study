package java_chobo.ch13;


/**
 * @author surin
 * ThreadEx01에 우선순위 부여하기
 *
 */
public class ThreadEx06 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread01 th1 = new Thread01();
		System.out.println("priority of th1 > " + th1.getPriority());
		
		Runnable r = new Thread02();
		Thread th2 = new Thread(r);
		
		th2.setPriority(9);
		System.out.println("priority of th2 > " + th2.getPriority());


		/* 우선순위가 더 높은 값은 더 많은 할당을 받는다.*/
		th1.start(); 
		th2.start();
		
	}
	
}
