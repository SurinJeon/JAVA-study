package java_chobo.ch14;

@FunctionalInterface // 추상 method 하나만 있는걸 정의함
interface MyFunction {
	void myMethod();
}

public class LambdaEx03 {

	public static void main(String[] args) {

		// 함수를 매개변수로 전달함
		MyFunction f = () -> System.out.println("myMethod()");

		aMethod(f);

		// 위처럼 굳이 선언하지 않고도 이렇게 사용 가능함
		aMethod(() -> System.out.println("myTwoMethod()"));

	}

	public static void aMethod(MyFunction f) {
		f.myMethod();
	}

}
