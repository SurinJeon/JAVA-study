package java_chobo.ch14.stream;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMapEx {

	public static void main(String[] args) {

		// map()으로 Stream<File>을 Stream<String>으로 변환 << stream의 요소 변환하기
//		extracted01();
		
		
		// Stream을 기본Stream으로 변환하기
//		extracted02();
		
		// 기본Stream 을 Stream으로 변환
		IntStream intStream = new Random().ints(1, 46); // 이 자체로는 무한 스트림(소모되지 않았기 때문...)
		Stream<Integer> integerStream = intStream.boxed(); // 기본stream을 Stream<> 형태로 변환
		integerStream.limit(6).forEach(System.out::println); // << 6개 나옴
		
		Stream<String> lottoStream = new Random().ints(1, 46).distinct().limit(6).sorted().mapToObj(i -> i + ", "); // intStream >> Stream<Integer> >> Stream<String>
		lottoStream.forEach(System.out::print); // 2, 3, 4, 7, 10, 40, << 이런 식으로 나옴
		
		
		
		
 	} // end of main()

	public static void extracted02() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("이자바", 3, 300));
		list.add(new Student("김자바", 1, 200));
		list.add(new Student("안자바", 2, 100));
		list.add(new Student("박자바", 2, 150));
		list.add(new Student("소자바", 1, 200));
		list.add(new Student("나자바", 3, 290));
		list.add(new Student("감자바", 3, 180));

		Stream<Student> stdStream = list.stream();

		// 기본스트림 안 쓰고 해보기
		// 점수만 뽑아내기
		Stream<Integer> stdScoreStream = stdStream.map(Student::getTotalScore);
//		stdScoreStream.forEach(System.out::println); // 총점만 쭉 나옴 (디버깅용 출력문) << 이거 주석처리!(소모 안 되도록...)
		
		// 점수의 합계 구하기
		int total = stdScoreStream.reduce(0, (a, b) -> a + b); // 아직 reduce() 안 배움,,
		System.out.println("total by reduce() >> " + total);
		
		// 근데 기본스트림을 쓴다면 reduce() 안 써도 됨!
		stdStream = list.stream(); // 이미 소모됐으므로 다시 stream 만들어야됨
		IntStream stdScoreIntStream = stdStream.mapToInt(Student::getTotalScore);
		total = stdScoreIntStream.sum(); // << 기본 함수가 여기에는 있음!
		System.out.println("total by IntStream >> " + total);
		
		// 최댓값도 구할 수 있음!
		stdStream = list.stream();
		stdScoreIntStream = stdStream.mapToInt(Student::getTotalScore);
		int max = stdScoreIntStream.max().getAsInt();
		System.out.println("max by IntStream >> " + max);
	}

	public static void extracted01() {
		List<File> list = new ArrayList<File>();
		list.add(new File("Ex1.java"));
		list.add(new File("Ex1.bak"));
		list.add(new File("Ex2.java"));
		list.add(new File("Ex1"));
		list.add(new File("Ex1.txt"));

		Stream<File> fileStream = list.stream();

		// map()으로 Stream<File>을 Stream<String>으로 변환 << stream의 요소 변환하기
		Stream<String> fileNameStream = fileStream.map(File::getName);
		fileNameStream.forEach(System.out::println); // 출력하고 나서 소모됨

		// 확장자만 출력하기
		list.stream().map(File::getName)
				.filter(s -> s.indexOf('.') != -1) // indexOf()에는 char가 들어가야함 << '.' 있는 위치를 찾아라	// (-1이 나오면 없다는 뜻)
				.map(s -> s.substring(s.indexOf('.') + 1)) // '.' 위치 +1 부터 끝까지 글자 뽑아내기
				.peek(s -> System.out.printf("extends %s%n", s))
				.map(String::toUpperCase) // 대문자로 바꾸기
				.peek(s -> System.out.printf("upper %s%n", s))
				.distinct() // 중복 허용 X
				.forEach(System.out::print);

		System.out.println();

		
		// HashSet으로 해보기 (반복문 써서..) << HashSet은 중복된 값을 허용하지 않기 때문에 distinct() 쓰지 않아도 됨!
		Set<String> s = new HashSet<String>();
		for (File f : list) {
			String ext = f.getName();
			if (ext.indexOf('.') != -1) {
				s.add(ext.substring(ext.indexOf('.') + 1).toUpperCase());
			}
		}
		System.out.println(s); // 확장자 이름 다 들어감

		// 자세히 설명
		File file = new File("test.java");
		String fileName = file.getName(); // << "test.java" 추출
		// 그런데 확장자명 뽑으려면 .java를 찾아야하는데, 그러면 .의 위치를 먼저 알아야함
		int idx = fileName.indexOf('.');
		System.out.println(fileName + ":" + idx); // << '.'은 4의 위치임
		System.out.println(fileName.substring(idx + 1)); // substring은 추출 시작할 위치를 parameter로 넣으면 됨('.'이후부터 끝까지 출력할거임)
		
		
	}

}






















