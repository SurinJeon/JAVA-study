package java_chobo.ch06;

import java_chobo.ch06.dto.Tv;

public class Ex6_1 {

	public static void main(String[] args) {

		// instance 생성하기
		Tv t1; // type이 Tv인 참조변수 t1
		t1 = new Tv(); // Tv 인스턴스화 및 초기화
		
		System.out.println(t1);
		
		// 값을 넣어줌
		t1.color = "red";
		t1.isPower = true;
		t1.channel = 11;
		
		// 넣어준 값으로 바뀌었는지 확인
		System.out.println(t1);
		
		t1.setPower(); // false로 바뀔 것
		t1.channelUp(); // 12가 될 것
		t1.channelUp(); // 13이 될 것
		t1.channelDown(); // 12가 될 것
		
		System.out.println(t1);
		
		
		
		
	}

}
