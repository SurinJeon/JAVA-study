package java_chobo.ch06;

public class Tv {

	// 속성 정의하기
	// Tv class member variable
	
	String color;
	boolean isPower;
	int channel;
	
	// Tv class member method
	
	void setPower() {
		this.isPower = !isPower;
	}
	
	void channelUp() {
		this.channel++;
	}
	
	void channelDown() {
		this.channel--;
	}

	@Override
	public String toString() {
		return String.format("color : %s   isPower : %s   channel : %d", color, isPower, channel);
	}
	
} // end of Tv
