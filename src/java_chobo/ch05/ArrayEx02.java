package java_chobo.ch05;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx02 {

	public static void main(String[] args) {

		int[] intArr = new int[10];
		
		// 반복문 돌려가며 배열에 값 넣어보기
		Random rnd = new Random(123456);
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = rnd.nextInt(45) + 1;
		}
		
		System.out.println(Arrays.toString(intArr));
		
	} // end of main

} // end of class
