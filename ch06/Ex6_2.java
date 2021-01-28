package java_chobo.ch06;

public class Ex6_2 {

	public static void main(String[] args) {

		Tv t1 = new Tv(); // 생성 및 초기화
		Tv t2 = new Tv();
		
		// 모두 초기값인 0이 들어가 있음
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
		
		// t1과 t2... 채널 다르게 넣을 수는 없나,,,?
		t1.channel = 7; // t1의 instance variable인 channel에 7 넣음
		
		// 이제 두 값 달라졌는지 확인
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
		
	}

}
