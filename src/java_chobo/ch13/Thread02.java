package java_chobo.ch13;

public class Thread02 implements Runnable {

	@Override
	public void run() {

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000); // 이 class는 Runnable 구현이기 때문에 엄밀히 말하면 Thread class가 아님
				// >> 따라서 Thread.sleep(nanomillis)로 써줘야함
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
