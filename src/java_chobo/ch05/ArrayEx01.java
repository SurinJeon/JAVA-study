package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		// 배열
		array_01();
		
		// 배열 캐비넷 안을 보고싶다면 반복문을 돌리거나 Arrays.toString(배열이름) 쓰거나
		
	} // end of main


	private static void array_01() {
		int[] score = new int[5];
		
		System.out.println("start - main");
		
		prnArr(score);
		
		score[0] = 10; // 0번 캐비넷에 100이라는 내용물 투입
		System.out.println("배열은 " + Arrays.toString(score));
		
		System.out.println("end - main");
	}

	
	private static void prnArr(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("start - prnArr");
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d  ", arr[i]);
		}
		System.out.println();
		arr[4] = 100; // 4번 캐비넷에 100이라는 내용물 투입
		System.out.println("end - prnArr");
		
		
	} // end of prnArr

}
