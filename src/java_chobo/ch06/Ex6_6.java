package java_chobo.ch06;

import java_chobo.ch06.dto.Card;

public class Ex6_6 {

	public static void main(String[] args) {

		System.out.printf("Card.WIDTH : %d%n", Card.WIDTH);
		System.out.printf("Card.WIDTH : %d%n", Card.HEIGHT);
		
		Card c1 = new Card(); // Card();는 생성자 호출, new는 연산자
		System.out.println(c1); // 참조변수 c1을 출력하면 c1.toString을 찍어냄
		
		c1.setKind("Heart");
		c1.setNumber(7);
		
		// 출력 2가지 방법
		System.out.println(c1);
		System.out.printf("c1.kind = %s, c1.number = %d%n", c1.getKind(), c1.getNumber());
		
		Card c2 = new Card();
		c2.setKind("Spade");
		c2.setNumber(4);
		
		System.out.println(c2);
		System.out.printf("c2.kind = %s, c2.number = %d%n", c2.getKind(), c2.getNumber());
		
		
		// instance로 Class var에 접근은 가능하나, FM방식은 아님
		// Card.WIDTH Card.HEIGHT로 이름 따라주는 것이 좋음
		System.out.printf("c1.WIDTH = %d, c1.HEIGHT = %d%n", c1.WIDTH, c1.HEIGHT);
		System.out.printf("c2.WIDTH = %d, c2.HEIGHT = %d%n", c2.WIDTH, c2.HEIGHT);
		
		
	}

}
