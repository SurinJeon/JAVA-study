package java_chobo.ch05;

public class Ex5_3 {

	public static void main(String[] args) {

		// p138 최대값과 최소값 구하기
		int max;
		int min;
		int i;
		
		int[] score = {55, 35, 82, 97, 60};
		
		max = score[0];
		min = score[0];
		
		for(i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}else if(score[i] < min) {
				min = score[i];
			}
		} // end of for
		
		System.out.printf("최대값은 %d, 최소값은 %d 입니다.", max, min);
		
	} // end of main

} // end of class
