package java_chobo.ch14;

// use for 3, 8
interface LambdaInter {
	int max(int a, int b);
}

// use for 4
interface LambdaInter1 {
	void printVar(String name, int i);
}

// use for 5
interface LambdaInter2 {
	int square(int x);
}

// use for 6
interface LambdaInter3 {
	int roll();
}

// use for 7
interface LambdaInter4 {
	int sumArr(int[] arr);
}

public class LambdaEx01 {

	public static void main(String[] args) {

		// 1. method는 class에 종속적이다 (객체생성을 하지 않으면 쓸 수 없다)
		LambdaEx01 ex = new LambdaEx01();

		int a = ex.max(5, 3);
		System.out.println("max = " + a);

		/*
		 * 2. interface를 사용한다면 class LambdaInterClass implements LambdaInter{ } <<
		 * class를 만들고 overriding 했어야함
		 */

		// 3. 람다식은 class에 독립적이다
		// interface 구현을 람다식으로 해버리면 구현하는 클래스를 만들지 않아도 바로 쓸 수 있음
		LambdaInter lbi = (i, j) -> i > j ? i : j; // << interface 내에 method가 하나 밖에 없으므로 이게 가능함 (method 두 개 있으면 불가능함)
		int b = lbi.max(5, 3);
		System.out.println("max = " + b);

		// 4. String 과 int로 된 식
		LambdaInter1 lbi1 = (String name, int i) -> {
			System.out.println(name + " = " + i);
		};
		lbi1.printVar("김바둑", 5); // 이미 내부에서 println해줘서 sout 안 해도 됨

		// 4-1. 더 생략할 수 있음 (반환타입 생략 가능!)
		LambdaInter1 lbi2 = (name, i) -> {
			System.out.println(name + " = " + i);
		};
		lbi1.printVar("짱바둑", 10); // 이미 내부에서 println해줘서 sout 안 해도 됨

		// 4-2. 더 생략..
		LambdaInter1 lbi3 = (name, i) -> System.out.println(name + " = " + i);
		lbi3.printVar("짱짱바둑", 15); // 이미 내부에서 println해줘서 sout 안 해도 됨

		// 5. 둘 다 가능함
		LambdaInter2 lbi4 = (int x) -> x * x;
		LambdaInter2 lbi5 = x -> x * x;

		System.out.println(lbi4.square(5));
		System.out.println(lbi5.square(10));

		// 6. 매개변수가 없을 때
		LambdaInter3 lbi6 = () -> {
			return (int) (Math.random() * 6);
		};
		LambdaInter3 lbi7 = () -> (int) (Math.random() * 6);

		System.out.println(lbi6.roll());
		System.out.println(lbi7.roll());

		// 7. 여러식이 올 때
		LambdaInter4 lbi8 = (int[] arr) -> {
			int sum = 0;
			for (int i : arr) {
				sum += i;
			}
			return sum;
		};

		System.out.println(lbi8.sumArr(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));

		// 8. 원래 fm은 이렇게 객체 생성하며 overridiing하는 것...
		LambdaInter lbi0 = new LambdaInter() {

			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};

		System.out.println(lbi0.max(1, 3));

	}

	// use for 1
	public int max(int i, int j) {
		return i > j ? i : j;
	}

}
