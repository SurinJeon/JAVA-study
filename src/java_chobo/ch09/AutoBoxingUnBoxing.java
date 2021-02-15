package java_chobo.ch09;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(50); 
		int a = i1; // unboxing >> wrapper 안에 있는 정수를 꺼내서(언박싱) 기본타입에 넣음
		
		Integer i2 = 100; // autoboxing 알아서(오토) wrapper class에 들어감
		System.out.println(i2); 

	}

}
