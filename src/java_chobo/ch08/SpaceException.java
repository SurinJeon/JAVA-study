package java_chobo.ch08;

@SuppressWarnings("serial")
public class SpaceException extends Exception{

	// e.getMessage 할 수 있게 message를 넣어서 생성할 것임
	// >> 이에 맞는 생성자 설정
	
	public SpaceException(String msg) {
		super(msg);
	}

	
	
}
