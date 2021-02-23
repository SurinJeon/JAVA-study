package java_chobo.ch13;


/**
 * @author surin
 * Thread01과 Thread02를 사용
 *
 */
public class ThreadEx01 {

	public static void main(String[] args) throws InterruptedException {
		
		// Thread 객체 생성 방법 1
		Thread01 th1 = new Thread01();
		
		// Thread 객체 생성 방법 2
		Runnable r = new Thread02();
		Thread th2 = new Thread(r);
		
		// main()에서도 작업을 시켜서 총 3개의 일이 작동될 것
		
		th1.start(); // << th1.run()이 아님! (이러면 그냥 method 호출로 이어짐)
		th2.start();
		
		// Main에서 실행하는 작업
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "  ");
			Thread.sleep(1000); // declaration으로 처리
		}
		
		System.out.println("Done."); // << main()이 완료됨을 의미
		// Thread들의 작업이 남든말든 main()의 일이 끝나면 Done. 찍고 끝냄
		
	}
	
}
