package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx07 {

	public static void main(String[] args) {

		// Array는 값 접근에 편리함
		// 그러나 값을 수정하는 데에는 불편
		String[] strArr = {"a", "b"};
		String[] str = null;
		
		System.out.println(Arrays.toString(str)); 
		System.out.println(Arrays.toString(strArr));
		
		str = strArr;
		System.out.println(Arrays.toString(str)); // strArr의 주소값을 복사해와서 같은 것을 가리키게 됨
		
		prnArr(strArr);
		
	} // end of main

	
	private static void prnArr(String[] strArr) {
		
		String str = "abcdef"; // 헷갈리지말기 배열아님 그냥 변수임...
		
		String str1 = str.substring(3); // def
		String str2 = str.substring(3, 4); //d
		
		System.out.println(str1);
		System.out.println(str2);

		// 문자열을 문자 배열로 변환해서 출력하기
		char[] chArr = str.toCharArray();
		
		// 확장된 for문으로 내용물 확인하기
		for(char c : chArr) {
			System.out.printf(c + "  ");
		}
		
	} // end of prnArr

} // end of class
