package java_chobo.ch13;

import javax.swing.JOptionPane;

public class ThreadEx04 {

	public static void main(String[] args) throws InterruptedException {
		
		String input = JOptionPane.showInputDialog("숫자를 입력하세요. > ");
		System.out.println("입력값 > " + input);
		
		/*
		 * 위에서 값을 입력하지 않으면 아래 반복문은 실행될 수 없음
		 * (값 입력 후부터 다시 수행을 이어나감)
		 * >> I/O Blocking
		 */
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
	}

}
