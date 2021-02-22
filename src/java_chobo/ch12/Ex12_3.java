package java_chobo.ch12;

interface Eatable {

}

class Fruit implements Eatable {

	@Override
	public String toString() {
		return "Fruit";
	}

}

class Apple extends Fruit {

	@Override
	public String toString() {
		return "Apple";
	}

}

class Grape extends Fruit {

	@Override
	public String toString() {
		return "Grape";
	}

}

class Toy {

	@Override
	public String toString() {
		return "Toy";
	}

}

// Box<T>를 상속받는 FruitBox는 그걸 다루는 타입에 있어서 제한을 두고 있음
// Fruit 타입이면서 (자손 포함) Eatable을 구현하는 타입만 올 수 있음!
class FruitBox<T extends Fruit & Eatable> extends Box<T> {

}

public class Ex12_3 {

	public static void main(String[] args) {

		// Fruit Apple Grape는 Fruit 본인이거나 이의 자손이면서, Eatable을 구현함
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();

		// fruitBox는 Fruit를 다루는 class! << Fruit의 자손들은 들어갈 수 있음 (본인 위에 Fruit 있음...)
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());

		appleBox.add(new Apple());
		grapeBox.add(new Grape());

//		appleBox.add(new Grape()); << 불가능함

		System.out.println("fruitBox > " + fruitBox);
		System.out.println("appleBox > " + appleBox);
		System.out.println("grapeBox > " + grapeBox);

	}

}
