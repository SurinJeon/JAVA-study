package java_chobo.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_2 {

	public static void main(String[] args) {

		Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1; // 값 받아오기 get()
		Consumer<Integer> c = i -> System.out.print(i + ", "); // 출력하기 accept()
		Predicate<Integer> p = i -> i % 2 == 0; // 짝수 판별하기 test()
		Function<Integer, Integer> f = i -> i / 10 * 10; // 결국 i의 1의자리 숫자를 없앰 // 기능 적용하기 apply()

		List<Integer> list = new ArrayList<Integer>();
		makeRandomList(s, list);
		System.out.println(list);

		printEvenNum(p, c, list);

		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);

	}

	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());

		for (T t : list) {
			newList.add(f.apply(t));
		}

		return newList;
	}

	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {

		System.out.print("[");
		for (T t : list) {
			if (p.test(t)) {
				c.accept(t);
			}
		}
		System.out.println("]");

	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for (int i = 0; i < 10; i++) {
			list.add(s.get()); // Supplier 함수 인터페이스를 활용해서 random 값을 list에 집어넣기
		}

	}

}
