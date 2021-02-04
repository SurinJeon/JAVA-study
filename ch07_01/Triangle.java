package java_chobo.ch07_01;

import java.util.Arrays;

public class Triangle extends Shape {

	// Triangle << 세 개의 점 필요
	// Point 객체 3개 생성 필요
	// 배열로 받아오기
	
	Point[] p;

	public Triangle(Point[] p) {
		this.p = p;
	}
	
	public Triangle(Point p1, Point p2, Point p3) {
		p = new Point[] {p1, p2, p3}; // this 안 붙여도 가능(이름 다름)
	}

	@Override
	public String toString() {
		return String.format("p : %s,  color : %s", Arrays.toString(p), super.toString());
	}
	
	
	
}
