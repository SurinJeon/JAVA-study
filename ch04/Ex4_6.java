package java_chobo.ch04;


public class Ex4_6 {

	public static void main(String[] args) {
		
		// enum을 사용해서 switch문 작성
		Title t = Title.INTERN;
		System.out.println(t.ordinal());
		
		switch(t) {
			case BOSS:
				System.out.println("사장입니다.");
				break;
			case MANAGER:
				System.out.println("부장입니다.");
				break;
			case STAFF:
				System.out.println("사원입니다.");
				break;
			case INTERN:
				System.out.println("인턴입니다.");
				break;
		} // end of switch
		
	} // end of main

} // end of class
