package java_chobo.ch09;

public class Point implements Cloneable{

	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	} // end of constructor

	@Override
	protected Object clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return obj;
	} // end of clone method

	@Override
	public String toString() {
		return String.format("Point [x=%s, y=%s]", x, y);
	}
	
}
