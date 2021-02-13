package java_chobo.ch07;

public class SmartTv extends Tv {

	boolean isCaption;
	
	void isCaption() {
		isCaption = !isCaption;
		
		if(isCaption) {
			System.out.println("자막기능이 켜졌습니다.");
		}
	}
	
	void displayCaption(String text) {
		if(isCaption) {
			System.out.println(text);
		}else {
			System.out.println("자막 기능이 꺼져있습니다.");
		}
	}

	@Override
	public String toString() {
		return String.format("SmartTv [isPower=%b channel=%d sound=%d isCaption=%b]", isPower, channel,
				sound, isCaption);
	}
	
	
}
