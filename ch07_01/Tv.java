package java_chobo.ch07_01;

public class Tv {

	boolean isPower;
	int channel;
	
	
	void power(){
		isPower = !isPower;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDonw() {
		--channel;
	}
	
}
