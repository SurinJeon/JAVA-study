package java_chobo.ch14.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamFinalEx3 {

	public static void main(String[] args) {

		// Stream reducing
		OptionalInt maxValue = new Random(1234).ints(1, 46).distinct().limit(6).peek(s -> System.out.printf("%d, ", s))
				.reduce(Integer::max);
		System.out.println();
		System.out.println("maxValue >> " + maxValue.getAsInt());

		// 혹은 boxed도 가능
		// boxed를 통해서 IntStream에서 Stream<Integer>로 바뀜!
		Optional<Integer> maxValue2 = new Random(1234).ints(1, 46).distinct().limit(6).boxed()
				.peek(s -> System.out.printf("%d, ", s)).collect(Collectors.reducing(Integer::max));

		System.out.println();
		System.out.println(maxValue2.get());

		// 누적합하기
		int sum1 = new Random(1234).ints(1, 46).distinct().limit(6).reduce(0, (a, b) -> a + b);
		System.out.println("sum1 >> " + sum1);

		int sum2 = new Random(1234).ints(1, 46).distinct().limit(6).boxed()
				.collect(Collectors.reducing(0, (a, b) -> a + b));
		System.out.println("sum2 >> " + sum2);

		// grand total

		List<Student> list = new ArrayList<Student>();
		list.add(new Student("이자바", 3, 300));
		list.add(new Student("김자바", 1, 200));
		list.add(new Student("안자바", 2, 100));
		list.add(new Student("박자바", 2, 150));
		list.add(new Student("소자바", 1, 200));
		list.add(new Student("나자바", 3, 290));
		list.add(new Student("감자바", 3, 180));

		int grandTotal1 = list.parallelStream().map(Student::getTotalScore).reduce(0, Integer::sum);
		System.out.println("grandTotal (by map()) >> " + grandTotal1);

		int grandTotal2 = list.parallelStream().collect(Collectors.reducing(0, Student::getTotalScore, Integer::sum));
		System.out.println("grandTotal2 (by collect()) >> " + grandTotal2);

		// Stream joinning (문자열스트림 모두 연결)

		String stdNames1 = list.stream().map(Student::getName).collect(Collectors.joining());
		System.out.println(stdNames1);
		String stdNames2 = list.stream().map(Student::getName).collect(Collectors.joining(","));
		System.out.println(stdNames2);
		String stdNames3 = list.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]")); // [ ] 이거는
																											// 접두사 접미사를
																											// 의미
		System.out.println(stdNames3);

	}

}
