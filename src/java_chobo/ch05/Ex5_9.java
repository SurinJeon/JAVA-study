package java_chobo.ch05;

public class Ex5_9 {

	public static void main(String[] args) {
		
		int[][] score = {
	    		{100, 100, 100}, 
		        {20, 20, 20}, 
		        {30, 30, 30}, 
		        {40, 40, 40}, 
		        {50, 50, 50}, 
		} ;
		
		// 배열 정렬하기
		for(int[] intArr : score) {
			for(int a : intArr) {
				System.out.printf("%3d  ", a);
			} // end of for
			System.out.println();
		} // end of for
		
		int sum = 0;
		double avg = 0;
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		float korAvg = 0;
		float engAvg = 0;
		float mathAvg = 0;
		
		// 학생 개인의 총점 및 평균
		// 과목별 총 점수 및 평균
		for(int i = 0; i < score.length; i++) {
			sum = 0;
			
			for(int j = 0; j < score[i].length; j++) {
				sum = sum + score[i][j];
				avg = sum / score[i].length;
			} // end of for
			
			korTotal = korTotal + score[i][0];
			engTotal = engTotal + score[i][1];
			mathTotal = mathTotal + score[i][2];
			
			korAvg = korTotal / score.length;
			engAvg = engTotal / score.length;
			mathAvg = mathTotal / score.length;
			
			System.out.printf("학생%d의 총점은 %d입니다.%n", i + 1, sum);
			System.out.printf("학생%d의 평균은 %.1f입니다.%n", i + 1, avg);
			System.out.println("=======================================");
		} // end of for
		
		System.out.printf("과목별 총 점수 합은 국어 %d, 영어 %d, 수학 %d입니다.%n", korTotal, engTotal, mathTotal);
		System.out.printf("과목별 평균은 국어 %.1f, 영어 %.1f, 수학 %.1f입니다.%n", korAvg, engAvg, mathAvg);
		
	} // end of main 

} // end of class
