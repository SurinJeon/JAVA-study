package java_chobo.ch07.test;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {

		// 아무것도 설정하지 않고 객체 생성한다면 초기값 -1
		// 아직 설정하지 않았다는 뜻으로 내포하는 의도
		this.hour = -1;
		this.minute = -1;
		this.second = -1;

	}

	public Time(int hour, int minute, int second) {
		this();
		setHour(hour);
		setMinute(minute);
		setSecond(second);

	}

	// getter method
	public void getHour() {
		System.out.println(this.hour);
	}

	// setter method
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			return;
		}
		this.hour = hour;
	}

	public void getMinute() {
		System.out.println(this.minute);
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			return;
		}
		this.minute = minute;
	}

	public void getSecond() {
		System.out.println(this.second);
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			return;
		}
		this.second = second;
	}

	@Override
	public String toString() {
		return String.format("%d : %d : %d", hour, minute, second);
	}

	public static void main(String[] args) {

//		Time t = new Time();
//		System.out.println(t);

		Time t2 = new Time(25, 77, 60); // 조건 벗어나므로 this() 실행 >> -1이 뜬다
		System.out.println(t2);

		t2.setHour(5);
		System.out.println(t2);

		t2.getHour();

	}

} // end of Time
