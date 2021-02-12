package java_chobo.ch06.test;

public class Student {

	// p207 6-1
	// class : member field + member method
	String name; // 학생이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수
	
	// constructor overloading
	public Student() {
		
	} // end of Student constructor 
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} // end of constructor (with parameter)

	// String.format : printf 함수처럼 사용할 수 있는  method
	public String info() {
		return String.format("%s %d %d %d %d %d", name, ban, no, kor, eng,
				math);
	}
	
	// getTotal(), getAverage()는 동사형태 << method임
	public int getTotal() {
		return kor + eng + math;
	} // end of getTotal
	
	public float getAverage() {
		String res = String.format("%.1f", getTotal() / 3.0f);
		return Float.parseFloat(res);
	} // end of getAverage
	
} // end of Student
