package java_chobo.ch05;

import java.util.Scanner;

public class Exercise5_6 {

	public static void main(String[] args) {

		String[] words = { "television", "computer", "mouse", "phone" };

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {

			// 단어 shuffle 위해서 String Array를 문자로 조각내는 method toCharArray()
			char[] question = words[i].toCharArray();
			
			/*
			 * Math.random을 문자길이까지 범위 지정한 다음 int로 typecast 필요
			 * 해당 shuffle을 보기로 주고 answer과 맞는지 비교해야함
			 * question >> shuffle, answer >> Scanner 사용
			 */

			for (int j = 0; j < question.length; j++) {
				question[i] = question[(int) (Math.random() * question.length)];
			}

			// 작성부분 끝

			System.out.printf("Q%d. %s의 정답을 입력하세요. > ", i + 1, new String(question));

			String answer = sc.nextLine();

			if (words[i].equals(answer.trim())) {
				System.out.printf("맞았습니다!%n%n");
			} else {
				System.out.printf("틀렸습니다.%n%n");
			} // end of if

		} // end of for
		
		sc.close();

	} // end of main

} // end of class
