package java_chobo.ch05;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

		// bubbleSort로 정렬해보기
		// [5, 4, 3, 2, 1] -> [1, 2, 3, 4, 5]
		int i;
		int j;
		int temp;
		
		// Loop1에서 조건문에 j를 뺀 이유는 중복 확인을 개선할 수 있기 때문
		
		int[] intArr = {5, 4, 3, 2, 1};
		System.out.println("기본 배열 > " + Arrays.toString(intArr));
		
		for(j = 0; j < intArr.length - 1; j++){
			for(i = 0; i < intArr.length -j - 1; i++) {
				if(intArr[i] > intArr[i + 1]) {
					temp = intArr[i];
					intArr[i] = intArr[i + 1];
					intArr[i + 1] = temp;
				}
			} // end of Loop1
		} // end of Loop2
		
		System.out.println("bubbleSort 이후 > " + Arrays.toString(intArr));
		
	} // end of main

} // end of class 
