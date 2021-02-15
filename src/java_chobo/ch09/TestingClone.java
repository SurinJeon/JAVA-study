package java_chobo.ch09;

public class TestingClone {

	public static void main(String[] args) {

		Point p1 = new Point(3, 4);
		Point copyP1 = (Point)p1.clone(); // return이 Object이기 때문이 typecast
		
		System.out.println(p1);
		System.out.println(copyP1);
		
		Circle c1 = new Circle(p1, 3); // Point형인 참조변수 p1을 참조한 객체 생성
		Circle copyC1 = (Circle)c1.clone();
		
		System.out.println(c1);
		System.out.println(copyC1);
		
		// 아래는 당연히 달라야함 >> Circle 객체 clone 시 Point 객체도 복사되도록 Circle class에 작업해놓음
		System.out.println(c1.p.hashCode());
		System.out.println(copyC1.p.hashCode());
	}

}
