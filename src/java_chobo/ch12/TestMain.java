package java_chobo.ch12;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {

		// String을 사용
		Box<String> box = new Box<>(); // Box 객체는 여기서 String을 다룰 것임

		box.add("abc"); // String으로 지정하면 들어와야할 값들도 다 String이 되어야함
		box.add("def");

		box.get(0); // box.get(0)은 box 안의 list에 담긴 0번째 요소! >> String일 것임
		String item = box.get(0);
		System.out.println("item > " + item);

		box.getList(); // << 반환타입이 ArrayList<String>이기 때문에 해당 타입의 참조변수로 받아야함
		ArrayList<String> boxList = box.getList();

		boxList.stream().forEach(System.out::println); // 출력문 한 줄로 쓰기

		System.out.println(box); // toString을 한 것이 나옴

	}

}
