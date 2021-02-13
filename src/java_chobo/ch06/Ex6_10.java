package java_chobo.ch06;

import java_chobo.ch06.dto.MyMath3;

public class Ex6_10 {

	public static void main(String[] args) {

		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3)의 결과 : " + mm.add(3, 3));
		System.out.println("mm.add(3, 3L)의 결과 : " + mm.add(3, 3L));
		System.out.println("mm.add(3L, 3)의 결과 : " + mm.add(3L, 3));
		System.out.println("mm.add(3L, 3L)의 결과 : " + mm.add(3L, 3L));
		
		int[] arr = {100, 200, 300};
		System.out.println("mm.add(arr)의 결과 : " + mm.add(arr));
		
	} // end of main

} // end of class
