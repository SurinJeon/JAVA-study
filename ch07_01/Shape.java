package java_chobo.ch07_01;

public class Shape {

	// 명시적 초기화 방법
	// String color = "blue";
	
	// 생성자 통한 초기화하기
	String color;

	public Shape() {
		color = "blue";
	}
	
	// method
	void draw() {
		System.out.println("도형을 그립니다.");
	}

	@Override
	public String toString() {
		return String.format("color : %s", color);
	}
	
	
}
