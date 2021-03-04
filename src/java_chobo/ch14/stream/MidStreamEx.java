package java_chobo.ch14.stream;

import java.util.Comparator;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MidStreamEx {

	public static void main(String[] args) {

		// 중간연산
		extracted01(); // skip(), limit(), filter(), distinct()

		// sorted
		extracted02();

		// Ex14_5
		Stream<Student> stdStream = Stream.of(
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
				);
		
		// 정렬 조건 -> 1. getBan으로 일단 정렬하고 
		// 2. 총점순으로 정렬해라(naturalOrder하면 Student의 기본 compareTo가 호출됨 << 총점 내림차순으로 해뒀었음)
		stdStream.sorted(Comparator.comparing(Student::getBan)
				.thenComparing(Comparator.naturalOrder())) /* comparing getBan하고나서(then) naturalOrder로 비교해라*/
				.forEach(System.out::println);
		
		/*
		stdStream.sorted(Comparator.comparing(Student::getBan)
				.thenComparing(Student::getName)) <<이러면 반 정렬 후 이름순으로 정렬임
				.forEach(System.out::println);
		*/
				
	}

	public static void extracted02() {
		Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
		strStream.sorted().forEach(i -> System.out.print(i + " ")); // 대소문자 구분함 (대문자가 아스키코드로 더 빠름)

		System.out.println();

		Stream.of("dd", "aaa", "CC", "cc", "b").sorted(Comparator.naturalOrder())
				.forEach(i -> System.out.print(i + " "));

		System.out.println();

		// 직접 람다식 써서 비교도 가능
		Stream.of("dd", "aaa", "CC", "cc", "b").sorted((s1, s2) -> s1.compareTo(s2))
				.forEach(i -> System.out.print(i + " "));

		System.out.println();

		// 더 간결하게
		Stream.of("dd", "aaa", "CC", "cc", "b").sorted(String::compareTo).forEach(i -> System.out.print(i + " "));

		System.out.println();

		// 역순정렬
		Stream.of("dd", "aaa", "CC", "cc", "b").sorted(Comparator.reverseOrder())
				.forEach(i -> System.out.print(i + " "));

		System.out.println();

		// 대소문자 구분 X
		Stream.of("dd", "aaa", "CC", "cc", "b").sorted(String.CASE_INSENSITIVE_ORDER)
				.forEach(i -> System.out.print(i + " "));
		System.out.println();
		Stream.of("dd", "aaa", "CC", "cc", "b").sorted(String.CASE_INSENSITIVE_ORDER.reversed())
				.forEach(i -> System.out.print(i + " ")); // 대소문자 구분X의 역순
	}

	public static void extracted01() {
		// 1. skip(), limit()
		System.out.println("1. skip(), limit()");
		IntStream.rangeClosed(1, 10).skip(3).limit(5).forEach(i -> System.out.print(i + " "));
		System.out.println();
		// 12345678910 // 123을 skip // 45678까지만 살려 // 소모(출력)

		// 2. filter(), distinct()
		System.out.println("2. filter(), distinct()");
		IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 5).distinct().forEach(i -> System.out.print(i + " ")); // 중복제거

		System.out.println();

		IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0).filter(i -> i % 3 == 0)
				.forEach(i -> System.out.print(i + " "));
		// 범위 1~20 // 2의 배수 가져와라 // 거기서 3의 배수인걸 가져와라

		// filter() 안에 Predicate 문장 다시 해보기
		IntPredicate p = t -> t % 2 == 0; // Predicate<Integer>나 IntPredicate 나 같음... 근데 filter가 IntPredicate 가져오라해서 이렇게
											// 함
		IntStream.rangeClosed(1, 20).filter(p).forEach(i -> System.out.print(i + " "));
	}

}
