package java_chobo.ch14.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamFinalEx2 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student("이자바", 3, 300));
		list.add(new Student("김자바", 1, 200));
		list.add(new Student("안자바", 2, 100));
		list.add(new Student("박자바", 2, 150));
		list.add(new Student("소자바", 1, 200));
		list.add(new Student("나자바", 3, 290));
		list.add(new Student("감자바", 3, 180));

		
		// Stream -> Collection
		extracted01(list);

		// Stream 통계정보 (method쓰거나 Collectors의 static method 쓰거나!)
		extracted02(list);
		
	}

	public static void extracted02(List<Student> list) {
		// count
		long cnt1 = list.stream().count();
		long cnt2 = list.stream().collect(Collectors.counting());
		
		System.out.printf("count() : %d, Collectors.counting : %d%n", cnt1, cnt2);
		
		// sum
		int sum1 = list
				.parallelStream()
				.mapToInt(Student::getTotalScore)
				.peek(System.out::println)
				.sum();
		
		int sum2 = list.parallelStream().collect(Collectors.summingInt(Student::getTotalScore));
		
		System.out.printf("sum() : %d, Collectors.summingInt : %d%n", sum1, sum2);
		
		// max
		// 점수 제일 높은걸 가져오기
		OptionalInt max1 = list
		.parallelStream()
		.mapToInt(Student::getTotalScore)
		.peek(System.out::println)
		.max();
		
		System.out.printf("maxScore : %d%n", max1.getAsInt()); // OptionalInt면 getAsInt로 int형식으로 출력하기 

		// 혹은 학생 전체 가져오기
		// 1. by max()
		Optional<Student> maxStd1 = list
				.parallelStream()
				.max(Comparator.comparing(Student::getTotalScore));
		
		System.out.println(maxStd1); // Optional 형태로 출력
		System.out.println(maxStd1.get()); // get() 붙이면 그 안의 객체 형태로 출력됨
		
		// by collect()
		Optional<Student> maxStd2 = list.parallelStream().collect(Collectors.maxBy(Comparator.comparingInt(Student::getTotalScore)));
		System.out.println(maxStd2);
		Student maxStd = maxStd2.get();
		System.out.println(maxStd);
		
		// summary
		// by summaryStatistics()
		IntSummaryStatistics iss1 = list.parallelStream().mapToInt(Student::getTotalScore).summaryStatistics();
		System.out.println(iss1);

		// by collect()
		IntSummaryStatistics iss2 = list.parallelStream().collect(Collectors.summarizingInt(Student::getTotalScore));
		System.out.println(iss2);
	}

	public static void extracted01(List<Student> list) {
		// list중에 String만 뽑아서 List<String>으로 바꾸기
		List<String> stdList = list
				.stream()
				.map(Student::getName)
				.peek(System.out::println) // (소모되지 않고 찍어낼 수 있음)
				.collect(Collectors.toList());

		System.out.println(stdList);

		// List<Student>를 ArrayList로 받아오기
		ArrayList<Student> arList = list
				.stream()
				.collect(Collectors.toCollection(ArrayList::new));

		System.out.println(arList);

		// List<Student>를 Map<이름, 학생>으로 받아오기
		Map<String, Student> map = list
				.stream()
				.collect(Collectors.toMap(s -> s.getName(), s -> s));

		for (Entry<String, Student> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}

}
