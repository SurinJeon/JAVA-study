package java_chobo.ch13;

public class Thread01 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + "  ");
			try {
				sleep(1000); // 의도적으로 1초씩 쉬게 만듦
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
