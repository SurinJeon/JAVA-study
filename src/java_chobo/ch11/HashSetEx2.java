package java_chobo.ch11;

import java.util.HashSet;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Person [%s, %d]", name, age);
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;

		// 템플릿은 길지만 사실 이렇게 쉽게 부여해도 되긴 함
		return (name + age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;

		// 내가 보기 쉽게 만든 equals
		if (obj instanceof Person) {
			Person object = (Person) obj;
			if (this.name == object.name && this.age == object.age) {
				return true;
			}
		}

		return false;

	}

}

public class HashSetEx2 {

	public static void main(String[] args) {

		hashCodeAndEquals1();

		hashCodeAndEquals2();

	}

	private static void hashCodeAndEquals1() {
		Person p1 = new Person("최빛", 48);

		int hashCode1 = p1.hashCode();
		int hashCode2 = p1.hashCode();

		System.out.println(hashCode1 + " == " + hashCode2); // 당연히 같음

		Person p2 = new Person("최빛", 48);
		int hashCode3 = p2.hashCode();
		System.out.println(hashCode3); // equals를 생성해놓았기 때문에 다른 객체여도 내용 비교 후 같은 hashCode를 던져줌

		boolean isEquals = p1.equals(p2);
		System.out.println(isEquals); // equals를 통해 내용비교!
	}

	private static void hashCodeAndEquals2() {
		Person p1 = new Person("한여진", 34);
		Person p2 = new Person("한여진", 34);
		Person p3 = new Person("황시목", 39);
		Person p4 = new Person("영은수", 27);

		HashSet<Person> stranger = new HashSet<Person>();

		stranger.add(p1);
		System.out.println(stranger.size());

		stranger.add(p2);
		System.out.println(stranger.size()); // equals를 설정했기 때문에 중복된 객체는 들어갈 수 없음(set의 특성)

		stranger.add(p3);
		System.out.println(stranger.size());

		stranger.add(p4);
		System.out.println(stranger.size());
	}

}
