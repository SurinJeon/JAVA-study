package java_chobo.ch14.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;
/**
 * @author surin
 * Stream의 분할 >> partitioningBy()
 */
public class StreamFinalEx4 {

	public static void main(String[] args) {
//		new Student2(name, isMale, hak, ban, score)
		
		Student2[] stuArr = {
				new Student2("나자바", true,  1, 1, 300),   
				new Student2("김지미", false, 1, 1, 250),   
				new Student2("김자바", true,  1, 1, 200),   
				new Student2("이지미", false, 1, 2, 150),   
				new Student2("남자바", true,  1, 2, 100),   
				new Student2("안지미", false, 1, 2,  50),   
				new Student2("황지미", false, 1, 3, 100),   
				new Student2("강지미", false, 1, 3, 150),   
				new Student2("이자바", true,  1, 3, 200),   
				new Student2("나자바", true,  2, 1, 300),   
				new Student2("김지미", false, 2, 1, 250),   
				new Student2("김자바", true,  2, 1, 200),   
				new Student2("이지미", false, 2, 2, 150),   
				new Student2("남자바", true,  2, 2, 100),   
				new Student2("안지미", false, 2, 2,  50),   
				new Student2("황지미", false, 2, 3, 100),   
				new Student2("강지미", false, 2, 3, 150),   
				new Student2("이자바", true,  2, 3, 200)   
		};

		System.out.printf("1. 단순분할(성별로 분할)%n");
		
		// map을 만들어서 key값을 참 거짓으로 두고, 거기서 구별 가능함
		Map<Boolean, List<Student2>> stdBySex = Arrays.stream(stuArr).collect(partitioningBy(Student2::isMale));
		
		List<Student2> maleStds = stdBySex.get(true); // key값이 true인 경우만 가져와라
		System.out.println("남학생 : " + maleStds);
		
		List<Student2> femaleStds = stdBySex.get(false);
		System.out.println("여학생 : " + femaleStds);
		
		System.out.printf("%n2. 단순분할 + 통계(성별 학생 수)%n");
		Map<Boolean, Long> stuNumBySex = Stream.of(stuArr).collect(partitioningBy(Student2::isMale, counting()));
		
		System.out.println("남학생 수 : " + stuNumBySex.get(true));
		System.out.println("여학생 수 : " + stuNumBySex.get(false));
		
		System.out.printf("%n3. 단순분할+ 통계(성별 1등)%n");
		Map<Boolean, Optional<Student2>> topScoreBySex1 =
				Arrays.stream(stuArr)
				.collect(
						partitioningBy(Student2::isMale, 
						maxBy(comparingInt(Student2::getScore))));
		

		Map<Boolean, Student2> topScoreBySex2=  Stream.of(stuArr)
		.collect(
				partitioningBy(Student2::isMale,
						collectingAndThen(maxBy(comparingInt(Student2::getScore)), Optional::get)
						)
				);
		
		System.out.println("남학생 1등 : " + topScoreBySex1.get(true).get());
		System.out.println("여학생 1등 : " + topScoreBySex2.get(false));

		System.out.printf("%n4. 다중분할(성별 불합격자, 100점 이하)%n");
		
		// 성별 먼저 구분 후, 150 미만인 사람(탈락자) 찾아내는 방법
		Map<Boolean, Map<Boolean, List<Student2>>> failedStuBySex =
				Arrays.stream(stuArr)
				.collect(
						partitioningBy(Student2::isMale,  // partition 매개변수로 성별 나누고, 또 partition 들어가서 점수로 나누기!
								partitioningBy(s -> s.getScore() < 150)));
		
		List<Student2> failedMaleStu = failedStuBySex.get(true).get(true);
		List<Student2> failedFemaleStu = failedStuBySex.get(false).get(true);
		
		failedMaleStu.stream().forEach(s -> System.out.println(s));
		failedFemaleStu.stream().forEach(s -> System.out.println(s));
		
		
	}

}
