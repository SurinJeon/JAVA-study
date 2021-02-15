package java_chobo.ch09;

/**
 * @author surin
 * Circle이 Point를 참조하고 있다면
 * Point도 그대로 복제되게 만들어야 한다!
 * 그렇지 않으면 같은 Point 객체를 두 개의 Circle 객체가 참조하는게 됨
 */
public class Circle implements Cloneable{
	
	Point p; // << Circle이 Point를 참조함 다만 상속관계 이런건 아님
	double r;
	
	public Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	} // end of constructor

	@Override
	protected Object clone() {
		Object obj = null; // obj 선언하기 >> 여기에 clone 해줄거임
		try {
			obj = super.clone();
			Circle c = (Circle)obj;
//			c.p = new Point(this.p.x, this.p.y);
//			혹은 더 쉽게!
			c.p = (Point)(this.p).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return obj;
	}

	@Override
	public String toString() {
		return String.format("Circle [p=%s, r=%s]", p, r);
	}
	
}
