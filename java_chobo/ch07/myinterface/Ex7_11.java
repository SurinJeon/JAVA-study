package java_chobo.ch07.myinterface;

public class Ex7_11 {

	public static void main(String[] args) {
		
		// Child datatype으로 객체 생성
		Child c = new Child();
		
		// MyInterface datatype으로 객체 생성
		MyInterface my = new Child();
		
		// MyInterface datatype으로 객체 생성
		MyInterface2 my2 = new Child();
		
		// Child에 interface들의 default method를 overriding한게 있기 때문에 그것으로 출력됨
		c.method1();
		
		// Child가 아닌 상속받은 Parent에 있는 method
		c.method2();
		
		/*
		 * 이미 Child에서 overriding을 했기 때문에
		 * interface들의 시점에서는 default method를 출력할 수 없음
		 * (그래서 충돌의 위험이 있으면 overriding 해버리면 되는 것)
		 */
		my.method1();
		my2.method1();
		
		// static은 언제나 접근가능했었음
		// cf) 단, static은 static만을 불러올 수 있음을 명심
		MyInterface.staticMethod();
		MyInterface2.staticMethod();

	}

}
