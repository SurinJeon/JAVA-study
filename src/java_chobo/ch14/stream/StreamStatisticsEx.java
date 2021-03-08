package java_chobo.ch14.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamStatisticsEx {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student("이자바", 3, 300));
		list.add(new Student("김자바", 1, 200));
		list.add(new Student("안자바", 2, 100));
		list.add(new Student("박자바", 2, 150));
		list.add(new Student("소자바", 1, 95));
		list.add(new Student("나자바", 3, 290));
		list.add(new Student("감자바", 3, 80));

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // Integer형 list로 변환해줌

		// 1. count
		long cnt1 = list.stream().count();
		long cnt2 = intList.stream().count();

		System.out.printf("list cnt = %d, intList cnt = %d%n", cnt1, cnt2);

		// 2. max
		Optional<Student> optStd = list.stream().max(new Comparator<Student>() {

			// 비교를 위한 Comparator
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getTotalScore() - o2.getTotalScore();
			}
		});
		System.out.println("max Total Score Student >> " + optStd);

		// min
		// 람다식으로 하기
		Optional<Student> optStd2 = list.stream().min((o1, o2) -> o1.getTotalScore() - o2.getTotalScore());

		System.out.println("min Total Score Student (by Lambda Expression)>> " + optStd2);

		// IntStream의 sum

		IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		intStream.forEach(System.out::print);

		System.out.println();

		intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = intStream.sum();
//		System.out.println("sum >> " + sum);

		intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		OptionalDouble avg = intStream.average();
//		System.out.println("avg >> " + avg);

		intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		OptionalInt max = intStream.max();
//		System.out.println("max >> " + max);

		intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		OptionalInt min = intStream.min();
//		System.out.println("min >> " + min);

		intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		IntSummaryStatistics summary = intStream.summaryStatistics();
//		System.out.println("summary >> " + summary);

		System.out.printf("sum : %d, avg : %.2f, max = %d, min : %d%n", sum, avg.getAsDouble(), max.getAsInt(),
				min.getAsInt());

		// 혹은 summary로 한번에 출력하기

//		System.out.println(summary);
		System.out.printf("print by summary >> sum : %d, avg : %.2f, max = %d, min : %d%n", summary.getSum(),
				summary.getAverage(), summary.getMax(), summary.getMin());

	}

}
