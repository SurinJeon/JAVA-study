package java_chobo.ch07.myoop;

public class Circle extends Shape {

	Point center;
	int r;

	// 아무 parameter 없이 만들 경우 기본값은 이렇게 설정하겠다는 의미
	// this()로 자기 자신 생성자 호출하여 사용가능
	public Circle() {
		this(new Point(0, 0), 100);
	}

	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	@Override
	public String toString() {
		return String.format("center : %s, r : %s color : %s", center, r, super.toString());
	}
	
	
	
}
