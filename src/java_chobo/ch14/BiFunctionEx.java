package java_chobo.ch14;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionEx {

	public static void main(String[] args) {

		// String 길이가 뒷 숫자와 같은지 보기
		System.out.println("=====BiConsumer=====");
		BiConsumer<String, Integer> bic = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String t, Integer u) {
				if (t.length() == u) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}

			}

		};
		bic.accept("cat", 2);
		bic.accept("cat", 3);

		BiConsumer<String, Integer> bic2 = (t, u) -> {
			if (t.length() == u) {
				System.out.println("ture");
			} else {
				System.out.println("false");
			}
		};

		bic2.accept("street", 5);

		System.out.println("=====Predicate=====");
		BiPredicate<String, String> bip = new BiPredicate<String, String>() {

			@Override
			public boolean test(String t, String u) {
				return t.equals(u);
			}
		};

		System.out.println(bip.test("cute", "cate"));
		System.out.println(bip.test("abc", "abc"));

		BiPredicate<String, String> bip2 = (t, u) -> t.equals(u);
		bip2.test("dog", "doggo");

		System.out.println("=====Function=====");
		BiFunction<Integer, Integer, String> bif = new BiFunction<Integer, Integer, String>() {

			@Override
			public String apply(Integer t, Integer u) {
				if (t == u) {
					return "true";
				} else {
					return "false";
				}
			}
		};

		System.out.println(bif.apply(4, 6));

//		BiFunction<Integer, Integer, String> bif2 = (t, u) -> {
//			if(t == u) return "true";
//			else return "false";
//		};
//		
//		System.out.println(bif2.apply(5, 5));

		BiFunction<Integer, Integer, String> bif2 = (t, u) -> t == u ? "true" : "false";
		System.out.println(bif2.apply(5, 5));

	}
	
}
