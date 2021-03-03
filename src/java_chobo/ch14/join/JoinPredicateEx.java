package java_chobo.ch14.join;

import java.util.function.Predicate;

/**
 * @author surin Predicate의 합성
 */
public class JoinPredicateEx {

	public static void main(String[] args) {

		Predicate<Integer> p1 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t < 100;
			}

		};

		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0;

		// Predicate의 조합
		Predicate<Integer> notP = p.negate();

		System.out.println(p.test(101) + ":" + p.test(99)); // << false : true
		System.out.println(notP.test(101) + ":" + notP.test(99)); // << true : false

		Predicate<Integer> all = notP.and(q).or(r);
		// i >= 100 && i < 200 || i % 2 == 0

		System.out.println(all.test(201) + ":" + all.test(101) + ":" + all.test(98)); // << false : true : true

		Predicate<Integer> all2 = notP.and(q.or(r));
		// i >= 100 && (i < 200 || i % 2 == 0)

		System.out.println(all.test(201) + ":" + all.test(101) + ":" + all.test(98)); // false : true : false

		// isEqual()은 Predicate 인터페이스의 static method
		String str1 = "cat";
		String str2 = "dog";
		Predicate<String> pEq = Predicate.isEqual(str1);
		boolean result = pEq.test(str2);
		System.out.println(result); // << false

		// 위를 한 줄에 끝내버리기
		result = Predicate.isEqual(str1).test(str2);
		System.out.println(result);

	}

}
