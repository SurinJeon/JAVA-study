package java_chobo.ch14.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamConditionEx {

	public static void main(String[] args) {

		// totalScore가 100이하인 사람은 낙제자 >> 걸러내보기
		// Match와 Find
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("이자바", 3, 300));
		list.add(new Student("김자바", 1, 200));
		list.add(new Student("안자바", 2, 100));
		list.add(new Student("박자바", 2, 150));
		list.add(new Student("소자바", 1, 95));
		list.add(new Student("나자바", 3, 290));
		list.add(new Student("감자바", 3, 80));
		
		// method로 빼버리기
		// match
		matchEx(list);
		
		// find
		findEx(list);
		
	}

	private static void findEx(List<Student> list) {
		Stream<Student> stdStream = list.stream();
		
//		stdStream.filter(s -> s.getTotalScore() <= 100).findFirst(); << 반환타입이 Optional이라서 그거롤 받아야됨
		Optional<Student> result = stdStream.filter(s -> s.getTotalScore() <= 100).findFirst();
		System.out.println(result); // 100보다 작은 사람 중 첫번째 사람 찾음 (100보다 작은 사람이 없으면 null값을 return)
		
		// parallel
		result = list.parallelStream().filter(s -> s.getTotalScore() <= 100).findAny(); // 병렬이기 때문에 순차적으로 실행 X <<findAny! 
		System.out.println(result);
		
		
	}

	private static void matchEx(List<Student> list) {
		Stream<Student> stdStream = list.stream();
		boolean hasFailedStu = stdStream.anyMatch(new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.getTotalScore() <= 100; // 100보다 작으면 true임
			}
		});
		
		System.out.printf("has Failed Student? : %s%n", hasFailedStu);
		
		// 소비했으므로 다시 생성
		stdStream = list.stream();
		
		boolean isAllPassed = stdStream.allMatch(s -> s.getTotalScore() >= 80); // 모두가 80 이상이냐? << true
		System.out.printf("is All Passed? : %s%n", isAllPassed);
		
		
		
	}

}

















