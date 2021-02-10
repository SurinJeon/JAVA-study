package java_chobo.ch02;

public class Ex2_12 {

	public static void main(String[] args) {
	
		// typecast
		
		// 1. int to double
		System.out.println(3d);
		
		// 2. int to char (use ASCII code)
		System.out.println((char)65);
		
		// 2-2. int to char (숫자 그대로 문자로)
		System.out.println((char)(9 + '0'));
		
		// 3. int to String
		System.out.println(Integer.toString(3));
		System.out.println(3 + "");
		
		// 4. double to int
		System.out.println((double)3);
		
		// 5. double to String
		System.out.println(3.0 + "");
		
		// 6. 문자열에서 문자 추출하기
		String str = "abcd";
		System.out.println(str.charAt(2)); // c
		
		// 7. char to String
		System.out.println('a' + "");
		
		// 8. String to int
		System.out.println(Integer.parseInt("9"));
		
		// 9. String to double
		System.out.println(Double.parseDouble("3.14"));
		
		// 10. String to char
		System.out.println("9".charAt(0));
		
		// 번외) char + char의 연산은 int로 바뀌어서 계산된다!
		System.out.println('1' + '2'); // 99 (1의 문자코드는 49, 2의 문자코드는 50)
		
		
		
	}
}
