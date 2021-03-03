package java_chobo.ch14.join;

import java.util.function.Function;

/**
 * @author surin
 * Function의 합성
 */
public class JoinFunctionEx {

	public static void main(String[] args) {

		int res = Integer.parseInt("AE", 16); // AE는 16진수로 1010 1110 (10진수로는 174)
		System.out.println(res);
		
		// Function을 썼을때도 똑같이 나와야함
		Function<String, Integer> f1 = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t, 16);
			}

		};
		
		System.out.println(f1.apply("AE")); // 174 똑같이 나옴
		
		// 람다식으로 한 줄에 만들기
		Function<String, Integer> f = s -> Integer.parseInt(s, 16);
		System.out.println(f.apply("AE"));
		
		Function<Integer, String> g = i -> Integer.toBinaryString(i);
		System.out.println(g.apply(174)); // 10101110

		// f와 g의 합성
		Function<String, String> h =  f.andThen(g);
		System.out.println(h.apply("AE"));
		
		// compose()도 사용 가능
		Function<Integer, String> j = i -> Integer.toBinaryString(i); // 2진수 문자 배열로 바꿔줌
		System.out.println(j.apply(10)); // 1010
		Function<String, Integer> k = i -> Integer.parseInt(i, 16);
		System.out.println(k.apply("10")); // 1 * 16^1 + 0 * 16^0
		
		Function<Integer, Integer> l = k.compose(j); // compose()는 andThen()과 적용 순서가 다름! j부터 하고 나서 k를 수행
		System.out.println(l.apply(10)); // 10 -> 1010 -> 1 * 16 ^ 3 + 1 * 16 ^ 1 = 4112
	} 

}

















