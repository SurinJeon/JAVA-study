package java_chobo.ch13;

public class ThreadEx02 {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis(); // << 작업 수행 전 현재 시간을 의미

		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", "-");
		}
		System.out.println();
		System.out.printf("%s %d nanosecond%n", "first", System.currentTimeMillis() - startTime); // 작업에 걸린 시간 출력

		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", "|");
		}
		System.out.println();
		System.out.printf("%s %d nanosecond%n", "second", System.currentTimeMillis() - startTime); // 이후 또 걸린 시간

	}

}
