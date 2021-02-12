package java_chobo.ch07;

public class Tv {
	
	boolean isPower;
	int channel;
	int sound;
	
	void power() {
		isPower = !isPower;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
	void soundUp() {
		++sound;
	}
	
	void soundDown() {
		--sound;
	}
	
} // end of Tv
