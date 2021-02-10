package java_chobo.ch05;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex5_10 {

	public static void main(String[] args) {
		
		String[][] words = {
				{"chair", "의자"},	
				{"computer", "컴퓨터"},	
				{"integer", "정수"}	
		};
		
		Scanner sc = new Scanner(System.in);

		String question;
		String response;
		String msg;
		String message = null;
		
		for(int i = 0; i < words.length; i++) {
			question = String.format("Q%d. %s의 뜻은?", i + 1, words[i][0]);
			response = JOptionPane.showInputDialog(question).trim();
			
			if(response.equals(words[i][1])) {
				msg = "정답입니다!";
			}else {
				msg = String.format("틀렸습니다. 정답은 %s입니다." , words[i][1]);
			}
			
			JOptionPane.showMessageDialog(null, msg);
		} // end of for
		
		message = "프로그램을 종료합니다.";
		JOptionPane.showMessageDialog(null, message);
		
	} // end of main

} // end of clas