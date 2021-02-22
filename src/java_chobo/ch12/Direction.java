package java_chobo.ch12;

// enum에는 상수가 들어가기 때문에 그 명은 대문자로 짓는게 맞음
// TestMain3에서 씀
public enum Direction {

//	EAST, WEST, SOUTH, NORTH;
	EAST(1), WEST(5), SOUTH(10), NORTH(15);
	
	private final int value;
	
	private Direction(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	} // getter로 접근해야함
	
}
