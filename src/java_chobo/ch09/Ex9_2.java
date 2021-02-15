package java_chobo.ch09;

class Person {
	long id;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			return id == ((Person) obj).id; // id 안에 저장된 값들을 비교! (기본타입은 그 안에 바로 저장됨)
		} else {
			return false;
		}

	}

	public Person(long id) {
		super();
		this.id = id;
	}

}

public class Ex9_2 {

	public static void main(String[] args) {

		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

		if (p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		} // 같은 사람이 나옴 >> 객체 주소값 비교가 아니라 안에 저장된 값 id값 비교기 때문

	}

}
