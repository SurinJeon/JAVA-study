package java_chobo.ch14.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionEx {

	public static void main(String[] args) {

		ArrayList<Integer> arList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arList.add(i);
		}

		for (int i : arList) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 위 출력문을 더 축약해보기

		// Consuer를 사용하면 출력을 할 수 있음
		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");
			}
		};

		// forEach() 안에 Consumer 식이 오면 출력 가능
		arList.forEach(c);
		System.out.println();

		// 더 줄이면
		Consumer<Integer> d = i -> System.out.print(i + " ");
		arList.forEach(d);
		System.out.println();

		// 또 줄이면
		arList.forEach(i -> System.out.print(i + " "));
		System.out.println();

		// 2 또는 3의 배수를 list에서 제거하기
		arList.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		// x가 2의 배수이거나 3의 배수일 때 제거하기
		arList.forEach(i -> System.out.print(i + " ")); // 1 5 7만 남음
		System.out.println();

		// removeIf문 안의 조건을 Predicate로 변경하기
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i % 3 == 0;
		Predicate<Integer> p3 = p1.or(p2);

		ArrayList<Integer> arList2 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arList2.add(i);
		}
		arList2.forEach(i -> System.out.print(i + " "));
		System.out.println();

		arList2.removeIf(p3);
		arList2.forEach(i -> System.out.print(i + " "));
		System.out.println();

		// 각 요소들에 10을 곱하고 싶다면
		// UnaryOperator는 apply()를 쓰는것으로 봐서 Function의 하위 클래스임을 유추할 수 있음
		UnaryOperator<Integer> v = new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * 10;
			}
		};
		arList.replaceAll(v);
		arList.forEach(i -> System.out.print(i + " "));
		System.out.println();

		// 더 간결하게
		UnaryOperator<Integer> u = i -> i * 10;
		arList2.replaceAll(u);
		arList2.forEach(i -> System.out.print(i + " "));
		System.out.println();

		Map<String, String> map = new HashMap<>();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		map.put("4", "d");

		System.out.println("print 1");
		for (Entry<String, String> e : map.entrySet()) {
			System.out.printf("{ %s -> %s }%n", e.getKey(), e.getValue());

		}
		System.out.println();

		System.out.println("print 2");
		for (String key : map.keySet()) {
			System.out.printf("{ %s -> %s }%n", key, map.get(key));
		}
		System.out.println();

		// 혹은 BiConsumer를 써서
		System.out.println("print 3");
		BiConsumer<String, String> w = new BiConsumer<String, String>() {

			@Override
			public void accept(String t, String u) {
				System.out.printf("{ %s -> %s }%n", t, u);

			}
		};

		map.forEach(w);
		System.out.println();

		System.out.println("print 4");
		map.forEach((key, value) -> System.out.printf("{ %s -> %s }%n", key, value));

	}

}
