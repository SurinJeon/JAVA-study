package java_chobo.ch09;

public class Ex9_3 {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// String class는 같은 문자열이라면 같은 hashCode값을 반환하도록 해놓은 것임
		// >> 그래서 hashCode 값이 같음 (String에서 override 해놓은 것임)
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		// 사실 override하지 않은 진짜 hashCode의 의미는 System.identityHashCode와 같음
		// System.identityHashCode는 객체의 주소값을 반환하기에 항상 다른 해시코드값을 반환할 것이 보장됨 
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	
		String str3 = "abc";
		String str4 = "abc";
		
		/* 
		 * 하지만 아래 둘의 System.identityHashCode는 같다...?
		 * >> 왜냐하면 리터럴로 생성하게 된다면 String안에서는 같은 곳을 가리키도록 해놓음
		 * 얘네는 값비교인 == 을 해도 같다고 뜸
		 */
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
	}
	
}
