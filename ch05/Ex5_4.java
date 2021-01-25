package java_chobo.ch05;

import java.util.Arrays;
import java.util.Random;

public class Ex5_4 {

	public static void main(String[] args) {

		// shuffle
		// 랜덤하게 받아온 수를 index로 가지는 내용물 -> 이것을 index 0에 넣을 것
		// 총 100번 동안
		
		int i;
		int temp;
		int n;
		
		int[] intArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Before Array shuffle " + Arrays.toString(intArr));
		
		for(i = 0; i < 100; i++) {
			n = (int)(Math.random() * 10);
			temp = intArr[0];
			intArr[0] = intArr[n];
			intArr[n] = temp;
		}
		
		System.out.println("After Array shuffle " + Arrays.toString(intArr));
		
	} // end of main

} // end of class
