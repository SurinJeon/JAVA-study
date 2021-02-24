package java_chobo.ch13;

class Thread06 extends Thread {

	@Override
	public void run() {
		while (!isInterrupted()) {
			System.out.println("a");
		}
		// isInterrupted가 false일때까지만 반복
		System.out.println("end");

	}

}

public class ThreadEx08 {

	public static void main(String[] args) throws InterruptedException {

		Thread06 th6 = new Thread06();
		th6.start(); // 계속 a 찍음

		Thread.sleep(3000);
		th6.interrupt();
		System.out.println(th6.isInterrupted()); // true여서 반복 멈춤

	}

}
