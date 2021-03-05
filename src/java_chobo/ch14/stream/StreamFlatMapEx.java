package java_chobo.ch14.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMapEx {

	public static void main(String[] args) {
		
		 Stream<String[]> strArrStream = Stream.of(
				 new String[]{"abc", "def", "jkl"},
				 new String[]{"ABC", "GHI", "JKL"}
				 );
		 
//		 Stream<Stream<String>> strStrStream= strArrStream.map(Arrays::stream);	// datatype에 보면 Stream안에 또 Stream 생김
		 Stream<String> strStream = strArrStream.flatMap(Arrays::stream); // flatmap쓰면 됨
		 
		strStream.map(String::toLowerCase)
		 	.distinct()
		 	.sorted()
		 	.forEach(System.out::println);
		System.out.println();	 
		
		String[] lineArr = {
				"Believe or not It is true",
				"Do or do not There is no try"
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		
		lineStream.flatMap(line -> Stream.of(line.split(" +"))) // " +"는 하나 이상의 공백을 의미함 << 문자열을 공백을 구분자로 하여 자르라는 의미
			.map(String::toLowerCase)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		
		System.out.println();
		 
	}
}
