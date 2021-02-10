package java_chobo.ch05;

import java.util.Arrays;

/**
 * @author tnghd
 * String 배열
 */

public class ArrayEx06 {
	
	public static void main(String[] args) {

		// String 베열 만들기
		// exam01();
		
		// String 배열 안 내용물 생성하기 (두 가지 방법)
		// exam02();
		
		String[] strangerArr = {"황시목", "한여진", "서동재", "영은수"};
		String[] strangerArr2 = {"노섬엽", "오타쿠", "영업왕", "미국여행"};
		
		System.out.println(Arrays.toString(strangerArr));
		System.out.println(Arrays.toString(strangerArr2));
		
		strangerArr = strangerArr2; // strangerArr2가 참조하는 배열의 주소값을 strangerArr에 복사해주는 것
		// 변해야 할 것은 strangerArr임 그래서 l-value로 와야함 (r-value의 값을 넘겨받아서 바뀌는 것이므로)
		
		System.out.println(Arrays.toString(strangerArr));
 		
		prnString(strangerArr);
		
	} // end of main

	
	private static void prnString(String[] strangerArr) {

		for(String str : strangerArr) {
			System.out.printf(str + "  ");
		}
		
	} // end of prnString


	private static void exam02() {
		String[] catName = {"김고영", "김바둑", "김까망"};
		String[] catName2 = new String[] {"김고영", "김바둑", "김까망"};
		
		System.out.println(Arrays.toString(catName));
		System.out.println(Arrays.toString(catName2));
	} // end of exam02
	

	private static void exam01() {
		String[] catName = new String[3];
		
		catName[0] = new String("김바둑");
		catName[1] = "김고영";
		catName[2] = "김까망";
		
		System.out.println(Arrays.toString(catName));
	} // end of exam01

} // end of class
