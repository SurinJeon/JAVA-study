package java_chobo.ch06.test;

public class MyMath {
	
	// field member
	int a;
	int b;
	
	public MyMath(int a, int b) {
		this.a = a;
		this.b = b;
	} // end of constructor
	
	public int add() {
		return a + b;
	}
	
	public int sub() {
		return a - b;
	}
	
	public int mul() {
		return a * b;
	}
	
	public int div() {
		return a / b;
	}
	
} // end of MyMath
