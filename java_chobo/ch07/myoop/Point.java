package java_chobo.ch07.myoop;

public class Point {

	// 좌표상의 (x, y) 틀을 제공
	int x;
	int y;
	
	// 명시적 초기화 대신 기본 생성자 내에서 또다른 생성자를 호출해서 선언 가능
	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this.x = x; // this를 붙여서 parameter 값을 field로 전달
		this.y = y;
		// 만약 parameter가 다른 알파벳이었다면 this로 구분할 필요 없음!
	}

	@Override
	public String toString() {
		return String.format("(%s, %s)", x, y);
	}
	
	
	
}
