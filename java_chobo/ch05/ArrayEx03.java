package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		// 배열 안의 값들을 교환해보기
		int[] intArr = {5, 4};
		
		int temp;
		
		temp= intArr[0];
		intArr[0] = intArr[1];
		intArr[1] = temp;
		
		System.out.println(Arrays.toString(intArr));
		
		
	} // end of main

} // end of class
