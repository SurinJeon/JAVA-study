package java_chobo.ch13;

class Thread03 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", "|");
		}
		System.out.println();
		System.out.printf("%s %d nanosecond%n", "second", System.currentTimeMillis() - ThreadEx03.STARTTIME);
	}
}

/**
 * @author surin
 * ThreadEx02를 의도적으로 Thread 두 개로 나누어 작업해보기
 * >> 오히려 ThreadEx02보다 시간이 더 걸림
 * 이유 : context switching
 */
public class ThreadEx03 {
	static long STARTTIME = System.currentTimeMillis();

	public static void main(String[] args) {

		Thread03 th3 = new Thread03();
		th3.start();

		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", "-");
		}
		System.out.println();
		System.out.printf("%s %d nanosecond%n", "first", System.currentTimeMillis() - ThreadEx03.STARTTIME);

	}

}
