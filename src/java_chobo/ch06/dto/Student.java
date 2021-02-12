package java_chobo.ch06.dto;

// Ex5_9 다차원 Array로 학생 성적 구하기 예제를 class로 분리해보기
// Ex6_4에서 지금 class를 사용할 것

public class Student {
	// Student class는 학생에 관련한 내용이 들어가야함
	int stdNo;
	String name;
	public int kor;
	int eng;
	int math;
	
	// alt shift s로 constructor 만들기
	// 지금까지는 생성자가 따로 존재하지 않아서 알아서 디폴트 생성자가 사용되었던 것
	public Student(int stdNo, String name, int kor, int eng, int math) {
		super(); // 생략 가능함 // extends 부모클래스와 관련있음
		this.stdNo = stdNo; // this는 이 class 내의 stdNo를 말함
		// this.stdNo와 parameter stdNo는 같아야함...
		// 이름 중복이니까 해결 위해 this를 붙여주는 것
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} // end of constructor
	
	public Student(int stdNo) {
		this.stdNo = stdNo;
	}

	// Student class의 member method
	public int total() {
		return kor + eng + math;
	}
	
	public double avg() {
		return total() / 3d;
	}

	// class 내부 정보를 쉽게 알 수 있도록 toString을 override 할 것임
	@Override
	public String toString() {
		return String.format("%3s %5s %3d %3d %3d %3d %.1f", stdNo, name,
				kor, eng, math, total(), avg());
	} // end of toString
	
} // end of Student
