package java_chobo.ch14.ref;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class MyClass {
	int x;
	int y;

	public MyClass() {
	} // default constructor

	public MyClass(int x) {
		this.x = x;
	}

	public MyClass(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyClass) {
			MyClass other = (MyClass) obj;
			if (x == other.x) {
				return true;
			}
		}
		return false;
	} // end of equals()

	@Override
	public String toString() {
		return String.format("MyClass %s, %s", x, y);
	}

} // end of MyClass

public class MethodRefEx {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> Integer.parseInt(s);
		System.out.println(f.apply("16")); // 숫자 16으로 변함

		// 윗 문장을 더 간편하게 쓰기
		Function<String, Integer> f2 = Integer::parseInt; // Integer class안에 정의된 parseInt()를 참조
		System.out.println(f2.apply("16"));

		// 매개변수가 두 개여도 사용 가능!
		BiFunction<String, String, Boolean> g = (s1, s2) -> s1.equals(s2);
		System.out.println(g.apply("cat", "dog"));

		// 더 간결하게
		BiFunction<String, String, Boolean> h = String::equals; // String class안의 equals()를 참조하겠다는 뜻
		System.out.println(h.apply("cat", "cat"));

		// 특정 객체의 인스턴스 메서드 참조

		MyClass m1 = new MyClass(5, 2);
		MyClass m2 = new MyClass(4, 3);
		MyClass m3 = new MyClass(5, 3);

		Function<MyClass, Boolean> j = i -> m1.equals(i);
		System.out.println(j.apply(m2)); // false
		System.out.println(j.apply(m3)); // true << 지금 x값만 비교하도록 equals() overriding함

		// 간결하게!
		Function<MyClass, Boolean> k = m1::equals; // MyClass의 instance인 m1의 method equals()를 참조하겠다
		System.out.println(k.apply(m2)); // false
		System.out.println(k.apply(m3)); // true

		// 생성자/배열을 만드는 new연산자와 method 참조

		// 매개변수가 없는 생성자
		Supplier<MyClass> s = MyClass::new;
		System.out.println(s.get()); // 만들어진 새로운 객체를 get()으로 가져올 수 있음

		// 매개변수가 있는 생성자(1개)
		Function<Integer, MyClass> t = MyClass::new;
		System.out.println(t.apply(5)); // x로만 생성하는 매개변수 하나인 생성자로 객체 생성함

		// 매개변수가 있는 생성자(2개)
		BiFunction<Integer, Integer, MyClass> u = MyClass::new;
		System.out.println(u.apply(5, 6));

		// 배열 만들기
		Function<Integer, int[]> v = int[]::new;
		System.out.println(Arrays.toString(v.apply(5)));

	} // end of main()

} // end of MethodRefEx
