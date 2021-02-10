package java_chobo.ch06.dto;

public class Card {

	
	// instance var는 소문자
	// 두 단어일 경우에는 카멜 표기식 사용
	// 보통 instance var는 public으로 공개하지 않음
	// 그래서 지금처럼 private일 경우에는 getter setter로 접근
	private String kind;
	private int number;
	
	// Class var는 대문자
	// 두 단어일 경우에는  under bar로 구별
	public static int WIDTH = 100;
	public static int HEIGHT = 250;
	
	/*
	 * default constructor 구현해보기
	 * 원래는 java complier가 constructor 없으면 알아서 이걸 생성해줌...!
	 */
	
	public Card() {	
		super(); // 부모 class의 생성자 >> Object를 끌고오기 위해 사용하는  constructor
	}

	
	// getter setter method로 private인 instance var에 접근할 수 있게 만듦
	// getter 와 setter는 일종의 대행자 
	// 이것을 통하지 않는다면, instance var가 뭐가 어떻게 변경됐는지 바로 파악하기 어렵 (결합도와 정보은닉과 관련)
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	// toString은 보통 instance var의 내용을 출력함
	// 왜냐하면 Class var는 사실 접근 가능하기 때문...(public)
	// Override할 때는 부모 class의 접근 지정자보다 범위가 더 넓어야 하며, toString은 Object에서 public이라 여기서 public 가능
	// 만약  toString이 주석처리 되어있다면 Object의 toString 값을 끌고 옴
	@Override
	public String toString() {
		return String.format("Card [%s %d]", kind, number);
	}
	
} // end of Card
