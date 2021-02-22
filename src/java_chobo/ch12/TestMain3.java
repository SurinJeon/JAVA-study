package java_chobo.ch12;

public class TestMain3 {

	public static void main(String[] args) {

		// Enum을 활용한 생성 방법 세 가지
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");

		System.out.println("d1 > " + d1);
		System.out.println("d2 > " + d2);
		System.out.println("d3 > " + d3);

		// Enum으로 == , equals 사용 가능
		System.out.println("d1 == d2 > " + (d1 == d2));
		System.out.println("d1.equals(d3) > " + d1.equals(d3));

		// compareTo() 사용가능
		// 사전순 배열을 기준으로 하기 때문에 음수라면 기준 변수가 앞에, 양수라면 뒤에 위치한다는 뜻
		System.out.println("d1.compareTo(d2) > " + d1.compareTo(d2)); // EAST WEST는 한 칸 차이
		System.out.println("d1.compareTo(d3) > " + d1.compareTo(d3)); // 같은 것이기 때문에 0

		// switch 사용 가능
		switch (d1) {
		case EAST:
			System.out.println("동쪽");
			break;
		case WEST:
			System.out.println("서쪽");
			break;
		case SOUTH:
			System.out.println("남쪽");
			break;
		case NORTH:
			System.out.println("북쪽");
			break;
		default:
			System.out.println("Invalid Direction");
			break;
		}

		// 배열 사용 가능
		Direction[] dArr = Direction.values(); // << 해당 method는 값들을 배열로 받아오는 역할
		for (Direction d : dArr) {
			System.out.printf("%s = %d%n", d.name(), d.getValue());
		}

	}

}
