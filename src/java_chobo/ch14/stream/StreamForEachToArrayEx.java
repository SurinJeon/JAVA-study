package java_chobo.ch14.stream;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class StreamForEachToArrayEx {

	public static void main(String[] args) {

		// 정수형만 담을 수 있는 기본 스트림인 IntStream으로 해보기
		// 1. new IntConsumer
		IntStream.range(1, 10).sequential().forEach(new IntConsumer() {

			@Override
			public void accept(int value) {
				System.out.print(value);
			}
		}); // 123456789
		System.out.println();

		// 2. 람다식으로 더 짧게 변형하기 (sequential() 생략!)
		IntStream.range(1, 10).forEach(System.out::print); // 12345678910
		// 혹은 i -> System.out.print(i)
		System.out.println();

		// 3. parallel 로 해보기
		IntStream.range(1, 10).parallel().forEach(System.out::print); // 순서대로 나오지 않음
		System.out.println();

		IntStream.range(1, 10).parallel().forEachOrdered(System.out::print); // 12345678910 (순서교정)
		System.out.println();

		Student[] stdArr = { new Student("짱수린", 1, 280), new Student("짱수링", 2, 270), new Student("짱짱수린", 3, 260),
				new Student("개짱수린", 4, 150) };
		Stream<Student> studentStream = Arrays.stream(stdArr); // student형태의 배열을 stream으로 바꿈

		// studentStream 을 임시배열인 tempArr에 넣기
		Student[] tempArr = studentStream.toArray(Student[]::new);
		System.out.println(Arrays.toString(tempArr));

		// 소비를 이미 해서 다시 또 만들어주기
		// 이번에 object로 받기
		studentStream = Arrays.stream(stdArr);
		Object[] objArr = studentStream.toArray();
		System.out.println(Arrays.toString(objArr));

	}

}
