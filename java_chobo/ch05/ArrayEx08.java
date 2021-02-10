package java_chobo.ch05;

public class ArrayEx08 {

	public static void main(String[] args) {

		// 매개변수의 길이를 출력하기
		// run configurations 들어가서 인자 설정 필요
		System.out.println("매개변수의 길이는 " + args.length + "입니다.");
		
		for(String str : args) {
			System.out.print(str + "  ");
		}
		
	} // end of main

} // end of class
