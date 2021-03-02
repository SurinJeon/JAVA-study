package java_chobo.ch14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionEx {

	public static void main(String[] args) {

		// java에서 제공하는 함수형 인터페이스 << 인터페이스에 method가 하나만 있는 것

		// Supplier
		System.out.println("=====Supplier=====");
		Supplier<Integer> f = () -> (int) (Math.random() * 100) + 1;
		System.out.println(f.get()); // 랜덤한 값이 나옴

		// 혹은 이렇게 해도 됨
		Supplier<Integer> f01 = new Supplier<Integer>() {

			@Override
			public Integer get() {
				return (int) (Math.random() * 10) + 1;
			}
		};

		System.out.println(f01.get());

		// 아니면 inner class 써서 해도 가능
		// main()안의 class기 때문에 해당 method가 끝나면 사라짐

		class MySupplier implements Supplier<Integer> {

			@Override
			public Integer get() {
				return (int) (Math.random() * 10) + 1;
			}

		}

		MySupplier ms = new MySupplier();
		System.out.println(ms.get());

		// Consumer
		System.out.println("=====Consumer=====");
		Consumer<Integer> f1 = (i) -> System.out.println(i + ", ");
		f1.accept(10);

		Consumer<Integer> f02 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t + ", ");
			}
		};

		f02.accept(5);

		// Predicate
		System.out.println("=====Predicate=====");
		Predicate<Integer> f2 = (i) -> i % 2 == 0;
		System.out.println(f2.test(5) + ", " + f2.test(4));

		Predicate<Integer> f03 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t % 2 == 0;
			}
		};

		System.out.println(f03.test(7));

		// Function
		System.out.println("=====Function=====");

		Function<Integer, Integer> f3 = (i) -> i / 10 * 10;
		System.out.println(f3.apply(12));

		Function<Integer, Integer> f04 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * t;
			}
		};
		System.out.println(f04.apply(5));

	}

}
