package java_chobo.ch06;

class InitTest{
	
	// 초기화 방법 일아보기
	
	// 명시적 초기화
	static int CV = 1;
	int iv = 1;
	
	
	// 순서 바꿔도 static block이 instance block보다 먼저 실행됨!
	/*
	{
		System.out.println("iv : " + iv);
		iv = 3;
		System.out.println("iv : " + iv);
	}
	*/
	
	// static 변수 초기화 이후 field가 초기화 됨
	// initiate by class block
	static {
		System.out.println("CV : " + CV);
		CV = 2;
		System.out.println("CV : " + CV);
	} 
	
	
	// initiate by instance block
	{
		System.out.println("iv : " + iv);
		iv = 3;
		System.out.println("iv : " + iv);
	}
	
	// initiate by constructor
	public InitTest() {
		CV = 5;
		iv = 4;
		System.out.println("iv : " + iv + ", CV : " + CV);
	}
	
} // end of InitTest

public class Ex6_8 {

	public static void main(String[] args) {

		new InitTest(); // instance var 실험 위해 객체 만들어줘야함!
		
	} // end of main

} // end of Ex6_8
