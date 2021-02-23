package java_chobo.ch13;

import javax.swing.JOptionPane;

class Thread04 extends Thread{
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/**
 * @author surin
 * ThreadEx04와 비교하기
 * >> IO작업과 for문 작업을 다른 Thread로 나눠버리기
 */
public class ThreadEx05 {

	public static void main(String[] args) throws InterruptedException {

		Thread04 th4 = new Thread04();
		th4.start();
		
		/*
		 * IO Blocking 일어나지 않음 (Thread는 main()에서 무슨 일이 일어나든말든 혼자 돌아감)
		 */
		String input = JOptionPane.showInputDialog("숫자를 입력하세요. > ");
		System.out.println("입력값 > " + input);

	}

}
