package java_study.sub1;

public class Gugudan /*extends Object*/{
	private int dan;
	
	public Gugudan() {
		dan = 3;
	}
	
	public void prnGugudan() {
		System.out.println("구구단 "+ dan + "단 입니다.");
		for(int i = 1; i < 10; i++) {
		System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}
	}
	
	public static void main(String[] args) {
		Gugudan gg = new Gugudan();
		gg.prnGugudan();
	}
}