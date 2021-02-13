package java_chobo.ch07.myoop;

public class Vcr {

	boolean isPower;
	int counter = 0;
	
	void isPower() {
		isPower = !isPower;
	}
	
	void play() {
		System.out.println("Play vcr");
	}
	
	void stop() {
		System.out.println("Stop vcr");
	}
	
	void rewind() {
		System.out.println("Rewind vcr");
	}
	
	void ff() {
		System.out.println("Fast Forward vcr");
	}
	
}

