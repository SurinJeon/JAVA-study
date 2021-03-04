package java_chobo.ch14.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author surin Stream은 여러 데이터 소스를 하나로 통일해서 관리해보자!
 */
public class StreamEx {

	public static void main(String[] args) {

		// p568
		String[] strArr = { "aaa", "ddd", "ccc" };
		List<String> strList = Arrays.asList(strArr);

		System.out.println(Arrays.toString(strArr));
		System.out.println(strList);

		// 1. 정렬
		Arrays.sort(strArr); // Arrays의 sort()를 써서 정렬 완료
		System.out.println(Arrays.toString(strArr)); // 원래는 반복문으로 했지만 우리는 method 아니까^^..

		Collections.sort(strList); // Collections의 sort()를 써서 정렬 완료
		System.out.println(strList);

		// 2. 출력
		String[] strArr2 = { "aaa", "ddd", "ccc" };
		List<String> strList2 = Arrays.asList(strArr2);

		// 배열 -> 스트림, 리스트 -> 스트림 해서 형태가 동일해짐!
		Stream<String> strStream1 = Arrays.stream(strArr2);
		Stream<String> strStream2 = strList2.stream();

		// 정렬 + 출력 한번에
		// 이렇게 쓰면 동일한 출력 방식 사용 가능 (위에서는 각자 다른 정렬 및 출력문을 써야 했었음)
		// 이제 이 두 stream은 소모가 되기 때문에 재사용은 불가 (최종연산)
		strStream1.sorted().forEach(System.out::println);
		strStream2.sorted().forEach(System.out::println);

		// Stream의 특징
		// 1. Stream은 데이터 소스로부터 데이터를 읽기만 할 뿐 변경하지 않는다.
		List<String> list = strList2.stream().sorted().collect(Collectors.toList());
		// strKList2를 스트림화 하고, 정렬해서, 각각을 모아서 toList로 다시 List화 시킨 것을 List<String> list에
		// 담았다.
		// 원래 strList2는 여전히 정렬되지 않은 상태!

		// 2. Stream은 Iterator처럼 일회용이다. (한번 쭉 가면 그냥 끝!)
		/*
		 * long cnt = strStream1.count(); System.out.println(cnt);
		 */
		// 이렇게 하면 에러가 뜸... (stream has already been operated upon or closed)
		// 왜냐하면 strStream1.sorted().forEach(System.out::println); 여기서 이미 소모 끝났기 때문

		// 이렇게 stream화로 다시 생성한 다음 출력해야함
		long cnt = Arrays.stream(strArr2).count();
		System.out.println(cnt);

		// 3. 지연된 연산 (최종 연산 전까지 중간연산이 수행되지 않는다)
		// Stream<Integer> 는 이미 기본적으로 제공되어있음
		IntStream intStream = new Random().ints(1, 46); // Random class 의 ints()를 사용해서 랜덤 숫자 가져옴 (근데 이건 무한스트림)
		intStream.distinct().limit(6).sorted().forEach(i -> System.out.print(i + ", "));
		// 중복제거 // 제한걸기 // 정렬하기
		// (forEach()로 출력하면서 최종연산 해줌 >> 이제 무한스트림 아님 + stream 소모 끝남)

		System.out.println();

		// Stream문을 반드시 한 줄에 써야하는건 아님
		intStream = new Random().ints(1, 46);
		// 이렇게 써도 됨!
		intStream.distinct().limit(6).sorted().forEach(i -> System.out.print(i + ", "));

		System.out.println();

		// 병렬스트림
		Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
		// sum()도 최종 연산
		int sum = strStream.parallel().mapToInt(s -> s.length()).sum();
		System.out.println(sum);

	}

}
