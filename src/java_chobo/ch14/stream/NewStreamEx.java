package java_chobo.ch14.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class NewStreamEx {

	public static void main(String[] args) {

		// 1. 특정 범위의 정수를 요소로 갖는 스트림
		// IntStream.range(1, 5); // startInclusive, endExclusive
		// 바로 출력하기!
		IntStream.range(1, 5).forEach(System.out::print); // 1234
		System.out.println();
		IntStream.rangeClosed(1, 10).forEach(System.out::print);
		; // 12345678910

		System.out.println();

		// 난수를 요소로 갖는 스트림
		new Random(1234).ints().limit(5).sorted().forEach(i -> System.out.print(i + ", "));
		// 시드값 줌 // 5개만 걸러라 // 정렬해라 // 출력!
		// ints()의 범위는 정수의 최솟값에서 최댓값 사이임
		System.out.println();
		System.out.printf("ints() range >> %d ~ %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);

		// ints와 limit을 한번에!
		new Random(1234).ints(5).sorted().forEach(System.out::println);
		System.out.println();

	}

}
