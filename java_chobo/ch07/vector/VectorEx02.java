package java_chobo.ch07.vector;

import java.util.Comparator;
import java.util.Vector;

import java_chobo.ch06.dto.Student;

public class VectorEx02 {

	/*
	 * Vector를 사용해 정렬까지 해보기
	 * ch06의 dto Student class 사용
	 */
	public static void main(String[] args) {
		
		Student std1 = new Student(1, "이은혁", 100, 100, 100);
		Student std2 = new Student(2, "차현수", 50, 80, 30);
		Student std3 = new Student(3, "서이경", 95, 70, 75);
		
		Vector<Student> vecStd= new Vector<Student>();
	
		// Student 타입을 받는 Vector인 vecStd에 값을 입력해주는 과정
		vecStd.add(std1);
		vecStd.add(std2);
		vecStd.add(std3);
		
		System.out.println(vecStd);
		
		// 내용 비교를 해보기 >> contains method 써야함(boolean으로 반환)
		System.out.println(vecStd.contains(new Student(2))); // 그런데 false가 뜬다...
		// 학번과 비교할 것임을 명시하지 않았기 때문! Student에 가서 수정해줘야함
		System.out.println(vecStd.contains(new Student(3, "서이경", 95, 70, 75)));
		
		System.out.println(vecStd.indexOf(new Student(3)));
		
		/*
		 *  Vector 정렬하기 (kor 높은 순서대로)
		 *  실행 위한 연산자가 필요함 Comparator
		 */
		
		Comparator<Student> kor = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.kor - o1.kor; // 만약 양수면 o2가 더 높은 점수인 것임
			}
			
		};
		
		vecStd.sort(kor); // Comparator 작업 후 가능해짐
		System.out.println(vecStd);
		
	}
	
}
