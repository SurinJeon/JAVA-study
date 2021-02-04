package java_chobo.ch07_01;

public class Tvcr extends Tv{

	Vcr vcr;
	int counter;
	
	// 위에서 new Vcr(); 하는 것이나 블럭 내에서 선언하는 것이나 똑같음
	public Tvcr() {
		vcr = new Vcr(); // Vcr Composition
		counter = vcr.counter;
	}

	/*
	 * adaptor pattern
	 * 대행자(proxy)
	 * 
	 */
	
	void play() {
		vcr.play();
	}
	
}
