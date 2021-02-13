package java_chobo.ch06.dto;

public class MyMath3 {

	public int add(int a, int b) {
		System.out.printf("int add(int a, int b) - ");
		return a + b;
	}
	
	public long add(int a, long b) {
		System.out.printf("long add(int a, long b) - ");
		return a + b;
	}
	
	public long add(long a, int b) {
		System.out.printf("long add(long a, int b) - ");
		return a + b;
	}
	
	public long add(long a, long b) {
		System.out.printf("long add(long a, long b) - ");
		return a + b;
	}
	
	// 베열 안의 총합을 구현할 것
	public int add(int[] a) {
		System.out.printf("int add(int[] a) - ");
		int result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
	
} // end of MyMath
