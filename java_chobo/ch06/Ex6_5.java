package java_chobo.ch06;

// 원래는  class 파일을 분리하는게 맞으나 학습의 이유로 같은 파일에..^^...
class Variable{
	int iv; // instance var
	static int CV; // class var
	
	void method() {
		int lv = 0; // local var, 초기화가 필요
	}
	
} // end of Variable

public class Ex6_5 {

	public static void main(String[] args) {
		
		Variable.CV = 10;
		
		// class의 instance 생성
		Variable v1 = new Variable();
		// instance var 
		v1.iv = 5;
		
		
		Variable v2 = new Variable();
		v2.iv = 15;
		
		
		System.out.println("Variable의 CV : " + Variable.CV);
		System.out.println("v1의 vi : " + v1.iv);
		System.out.println("v2의 vi : " + v2.iv);
		
		System.out.println("==========구분선==========");
	
		// 만약 v2의 iv가 바뀐다면 v1의 iv는 어떻게 될까?
		// v2의 iv만 바뀜...!
		
		v2.iv = 20;
		System.out.println("v1의 vi : " + v1.iv);
		System.out.println("v2의 vi : " + v2.iv);
		
		System.out.println("==========구분선==========");
	
		// instance로 접근해서 CV를 변경하는게 가능하긴 함
		// 다만 일관성있게 Variable.CV를 쓰는것이 ... 낫다...
		v2.CV = 30;
		System.out.println("v2로 접근해 변경한 CV : " + v2.CV);
		System.out.println("Variable의 CV : " + Variable.CV);
		
	} // end of main

} // end of class
