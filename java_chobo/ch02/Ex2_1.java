package java_chobo.ch02;

import java.lang.*; // 이건 원래 자동으로 따라오는거라 생략 가능한 것

// package import class 순
// package import는 class 외부에 있음

public class Ex2_1 {

	/*
	 * class 앞에 public은 파일명과 같은 이름을 가진 class 앞에서만 사용가능(FM)
	 * 주석을 제외한 모든 문장은 블럭{} 내에 작성해야함
	 */
	public static void main(String[] args) {

		String a = "abcd"; // 리터럴로 생성
		String b = new String("abcd"); // 인스턴스화, 생성자로 생성
		
		System.out.println(a);
		System.out.println(b);
		
		int len = a.length();
		System.out.println("a의 문자열 길이는 > " + len);
		
		System.out.println("a에서 index가 2인 글자는 " + a.charAt(2));
		
		System.out.print("cat");
		System.out.print("dog");
		System.out.println();
		
		System.out.printf("cat");
		System.out.printf("dog%n"); // 커서 다음줄로 내려가기 가능
		
		System.out.println("cat");
		System.out.println("dog"); // 한 줄 씩 가능
		
	} // end of main

} // end of class
