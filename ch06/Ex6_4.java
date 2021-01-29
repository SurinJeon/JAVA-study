package java_chobo.ch06;

import java_chobo.ch06.dto.Student;

public class Ex6_4 {

	public static void main(String[] args) {

		// Student class를 활용하여 학생 정보를 객체배열로 만들 것
		Student[] stdArr = new Student[5];
		
		// 각 배열의 객체를 초기화 및 주소값 넣어주기
		stdArr[0] = new Student(1, "김바둑", 90, 80, 70);
		stdArr[1] = new Student(2, "김고영", 90, 90, 70);
		stdArr[2] = new Student(3, "김까망", 90, 90, 90);
		stdArr[3] = new Student(4, "김노랑", 60, 60, 60);
		stdArr[4] = new Student(5, "공고영", 80, 80, 70);
		
		// 배열 안의 각 객체들 출력해보기
		for(int i = 0; i < stdArr.length; i++) {
			System.out.println(stdArr[i]);
		}
		
		// toString을 설정해줬기 때문에 sout(stdArr[0]) 해줘도 출력됨
		
	} // end of main

} // end of class
