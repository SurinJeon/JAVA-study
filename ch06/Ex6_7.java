package java_chobo.ch06;

import java_chobo.ch06.dto.Data;

// 보통 Class마다 file 분리가 맞지만 일단 학습용으로 ㅎㅎ...
class SubData extends Data {

	public SubData() {
		super(); // Data로 갔다가 또 거기서 Object로 가는 것
		x = 10; // SubData에 x가 없는데 에러가 안 뜬다...? >> 이건 Data의 x를 끌고 오는 것임!
	} // end of constructor

} // end of Data

public class Ex6_7 {

	public static void main(String[] args) {

		System.out.println("=== primitive type parameter ===");
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);

		System.out.println("after change() >> main() : x = " + d.x);

		System.out.println("===referemce type parameter===");
		Data d2 = new Data();
		d2.x = 20;
		
		System.out.println("main() : x = " + d2.x);
		
		change(d2);
		
		System.out.println("after change() >> main() : x = " + d2.x);
		
		// 내용 복사시켜주기
		Data d3 = new Data();
		d3.x = 40;
		
		Data d4 = copy(d3);
		System.out.println("main() : d4.x = " + d4.x);
		
	} // end of main

	private static Data copy(Data d) {
		
		Data temp = new Data();
		
		// 값 복사(정수가 그대로 그 자리를 차지! 주소복사가 아니다)
		temp.x = d.x;
		return temp;
		
	} // end of copy

	// Overloading change method
	private static void change(Data d) {
		
		d.x = 30;
		System.out.println("change() : x = " + d.x);
		
	} // end of change

	// d라는 참조변수가 걸고있는 instance 속의 x 값을 파라미터로 복사해옴
	private static void change(int x) {

		x = 1000;
		System.out.println("change() :  x = " + x);

	} // end of change

} // end of Ex6_7

















