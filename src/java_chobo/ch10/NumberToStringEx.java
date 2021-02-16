package java_chobo.ch10;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author surin
 * 결론
 * 1. 특정 형식에 맞춰서 쓰고싶다면 format (반환 타입은 String)
 * 2. 특정 형식에 맞춰진 문자열을 다른 타입으로 돌리고 싶다면 parse
 */
public class NumberToStringEx {

	public static void main(String[] args) throws ParseException {

		double number = 1234567.89;
		System.out.println(number);
		
		// DecimalFormat으로 세 자리 구분기후 사용해보기
		DecimalFormat df = new DecimalFormat("#,###.#");
		String str = df.format(number); // 소수점 이하는 반올림해서 자리수 맞춰질 것
		System.out.println(str);
		
		df.applyPattern("0000000000.0"); // 빈 자리가 생겨도 0으로 채워넣어라
		System.out.println(df.format(number)); 
		
		df.applyPattern("##########.#");
		System.out.println(df.format(number)); // 빈 자리가 생기면 없애버려라
		
		df.applyPattern("#.#E0"); // 지수승
		System.out.println(df.format(number)); // 1234567.89 >> 1.2 * 10^6 >> 1.2E6
		
		// Parse로 문자열을 다시 실수타입으로 바꿔보기
		Number numberStr = df.parse("1.2E6");
		Double d = numberStr.doubleValue();
		System.out.println(d);
		
		// df 패턴 바꾸기
		df.applyPattern("#,###.0");
		numberStr = df.parse("123,456.55");
		d = numberStr.doubleValue(); // 그대로 꺼내서 Number class 타입을 double로 가져오기
		System.out.println(d);

		// 1. 숫자로 문자 만들기
		int salary = 12345678;
		DecimalFormat df2 = new DecimalFormat("#,###.#");
		
		System.out.println(df.format(salary));
		
		// 혹은 DecimalFormat 쓰지 않고 이런 방법들도 있음
		System.out.printf("%,d %n", salary);
		System.out.println(String.format("%,d", salary));
		
		// >> 실수가 있다면 이렇게 표시
		System.out.println(String.format("%,.2f", 1234.56));
		
		// 2. 문자로 숫자 만들기
		String numberStr2 = "123,456";
		DecimalFormat df3 = new DecimalFormat("#,###");
		System.out.println(df3.parse(numberStr2)); // Number class 타입이 출력됨
		
		// >> 여기서 정수로 바꾸고 싶다면
		int i = df3.parse(numberStr2).intValue();
		System.out.println(i); // 정수형
		
	}
	
}
