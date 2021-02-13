package java_chobo.ch06.dto;

public class Tv {

	// 속성 정의하기
	// Tv class member variable
	
	public String color;
	public boolean isPower;
	public int channel;
	
	// Tv class member method
	
	public void setPower() {
		this.isPower = !isPower;
	}
	
	public void channelUp() {
		this.channel++;
	}
	
	public void channelDown() {
		this.channel--;
	}

	@Override
	public String toString() {
		return String.format("color : %s   isPower : %s   channel : %d", color, isPower, channel);
	}
	
} // end of Tv
