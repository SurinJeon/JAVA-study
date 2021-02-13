package java_chobo.ch05;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx10 {

	public static void main(String[] args) {

		int[] score = new int[100];
		
		Random rnd = new Random(1234567);
		
		// 배열에 값 집어넣기
		
		for(int i = 0; i < score.length; i++) {
			score[i] = rnd.nextInt(100) + 1;
		}
		
		System.out.println(Arrays.toString(score));
		
		// 별 찍기
		statScore(score);
		
	} // end of main

	
	private static void statScore(int[] score) {

		int[] stat = new int[11];
		
		// 점수별 분류 및  stat array 채우기
		for(int i = 0; i < score.length; i++) {
			stat[score[i]/10]++;
		} // end of for
		
		System.out.println(stat[10]);
		
		// 별 출력하기
		for(int i = 0 ; i < stat.length; i++) {
			
			System.out.printf("%3d점 : ", i * 10);
			
			for(int j = 0; j < stat[i]; j++) {
				System.out.printf("*");	
			} // end of for
			
			System.out.println();
			
		} // end of for
		
	} // end of statScore

} // end of class