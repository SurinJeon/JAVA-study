package java_chobo.ch07;

public class Ex7_1 {

	public static void main(String[] args) {

		SmartTv stv = new SmartTv();
		
		System.out.println(stv);
		
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		
		stv.sound = 20;
		stv.soundUp();
		System.out.println(stv.sound);
		
		stv.displayCaption("Hello, World!");
		stv.isCaption();
		stv.displayCaption("Hello, World!!");
		
	}

}