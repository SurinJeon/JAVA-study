package java_chobo.ch14.stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFinalEx {

	public static void main(String[] args) {
	
		String[] strArr = {
			"Inheritance", "Java", "Lambda", "stream", "OptionalDouble"	, "IntStream", "count", "sum"
		};
		
		Stream.of(strArr).forEach(System.out::println);
		
		// 소모했으니까 또 만들어서 boolean 타입으로 반환하기
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0); // 모두가 길이가 0이 아니라면 true임
		Optional<String> sWord = Stream.of(strArr).filter(s -> s.charAt(0) == 's').findFirst();
		
		System.out.println("noEmptyStr >> " + noEmptyStr);
		System.out.println("sWord >> " + sWord);
		
		// Stream을 글자길이로 바꿔서 IntStream으로 바꿈
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a, b) -> a + 1);
		int sum = intStream2.reduce(0, (a, b) -> a + b);
		
		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
		
		System.out.println("count >> " + count);
		System.out.println("sum >> " + sum);
		System.out.println("max >> " + max.getAsInt());
		System.out.println("min >> " + max.getAsInt());
		
	}
	
}
