package java_chobo.ch06;

class Cat{
	
	public String name;
	public int age;
	public boolean isMale;
	
	public String address;
	public String personality;
	
	public Cat(String name, int age, boolean isMale) {
		super();
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s]", address, personality);
	}
	
} // end of Cat

public class TestingConstructor {

	public static void main(String[] args) {

		System.out.println("고양이이름  " + "[주소 , 성격]");
		
		System.out.println("============================");
		
		Cat c1 = new Cat("김고영", 3, true);
		
		c1.address = "주비카페";
		c1.personality = "거의 인간";
		
		System.out.println(c1.name + "  " + c1);
		
		System.out.println("============================");
		
		Cat c2 = new Cat("김바둑", 3, false);
		
		c2.address = "만두집 옆";
		c2.personality = "바슬렁바슬렁";
		
		System.out.println(c2.name + "  " + c2);
		
		System.out.println("============================");
		
		Cat c3 = new Cat("공고영", 1, true);
		
		c3.address = "근린공원";
		c3.personality = "새침";
		
		System.out.println(c3.name + "  " + c3);
		
	} // end of main

} // end of TestingConstructor
