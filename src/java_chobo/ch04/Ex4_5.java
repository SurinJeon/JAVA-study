package java_chobo.ch04;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.printf("지금은 몇 월 인가요? > ");
		int month = scan.nextInt();
		
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을입니다.");
				break;
			default:
				System.out.println("겨울입니다.");
		} // end of switch
		
		System.out.printf("점수를 입력하세요.(0-100) > ");
		int score = scan.nextInt();
		String grade = "";
		String opt = "";
		
		switch(score/10) {
			case 10:
			case 9:
			case 8:
				grade = "A";
				if(score>90) {
					opt = "+";
				}else if(score<90) {
					opt = "-";
				}else {
					
				}
				System.out.println("당신의 학점은 " + grade + opt + "입니다.");
				break;
			case 7:
			case 6:
			case 5:
			case 4:
				grade = "B";
				if(score>65) {
					opt = "+";
				}else if(score<56) {
					opt = "-";
				}else {
					
				}
				System.out.println("당신의 학점은 " + grade + opt + "입니다.");
				break;
			default:
				grade = "C";
				System.out.println("당신의 학점은 " + grade + "입니다.");
				break;
		} // end of switch
		
		scan.close();
	} // end of main

} // end of class
