package java_chobo.ch03;

public class StringCmp {

	public static void main(String[] args) {

		String str01 = new String("abcd");
		String str02 = new String("abcd");
		
		String str03 = "abcd";
		String str04 = "abcd";
		
		// 두 개의 객체 생성, 둘의 주소 값은 다름.
		if(str01 == str02) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		// 두 개의 객체 내용을 비교하고 싶다면? equals method
		if(str01.equals(str02)){
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		// 리터럴로 생성한 두 변수는 같을까? String class 안에서는 같다.
		if(str03 == str04) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		// 리터럴로 생성한 변수는 "abcd"와 비교해도 같다.
		// "abcd"도 이름없는 것이 생성되고, 그것이 참조한 주소가 같기 때문
		if(str03 == "abcd") {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		// 변수의 대소문자 여부 관련 없이 내용을 비교하고싶다면 ignore
		if(str01.equalsIgnoreCase("ABCD")) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
	} // end of main

} // end of class
