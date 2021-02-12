package java_chobo.sub1;

public class Gugudan /*extends Object*/{
	private int dan;
	
	public Gugudan() {
		dan = 3;
	}
	
	public void prnGugudan() {
		System.out.println("������ "+ dan + "�� �Դϴ�.");
		for(int i = 1; i < 10; i++) {
		System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}
	}
	
	public static void main(String[] args) {
		Gugudan gg = new Gugudan();
		gg.prnGugudan();
	}
}