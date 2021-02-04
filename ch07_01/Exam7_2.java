package java_chobo.ch07_01;

public class Exam7_2 {

	public static void main(String[] args) {
		
		drawCircle();
		
		drawTriangle();
		
	}

	private static void drawTriangle() {
		// 기본 삼각형 그리기
		Point p1 = new Point(100, 100);
		Point p2 = new Point(140, 50);
		Point p3 = new Point(200, 100);
		
		Point[] p = new Point[] {p1, p2, p3};
		Triangle tri1 = new Triangle(p);
		
		System.out.println("Triangle tri1");
		System.out.printf("1 : %d, %d%n", tri1.p[0].x, tri1.p[0].y);
		System.out.printf("2 : %d, %d%n", tri1.p[1].x, tri1.p[1].y);
		System.out.printf("3 : %d, %d%n", tri1.p[2].x, tri1.p[2].y);
		System.out.println(tri1.color);
	}

	private static void drawCircle() {
		// 기본원형 그리기
		Circle c1 = new Circle();
		// Composition
		
		System.out.println("Circle c1");
		System.out.println(c1.center.x);
		System.out.println(c1.center.y);
		System.out.println(c1.r);
		System.out.println(c1.color);

		// 크기 다른 원형 그리기
		Point center = new Point(100, 100);
		Circle c2 = new Circle(center, 150);
		// Aggregation
		
		System.out.println("Circle c2");
		System.out.println(c2.center.x);
		System.out.println(c2.center.y);
		System.out.println(c2.r);
		System.out.println(c2.color);
		
		// toString overriding
		System.out.println(c1);
		System.out.println(c2);
	}

}
