package java_chobo.ch06.test;

public class Exercise6_23 {

	public static void main(String[] args) {

		exam01();
	
		exam02();
	}

	private static void exam02() {
		Student s = new Student();
		s.name = "김고영";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}

	private static void exam01() {
		Student s = new Student("김바둑", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
	}

}
