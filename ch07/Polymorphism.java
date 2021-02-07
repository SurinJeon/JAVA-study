package java_chobo.ch07.test;

// 원래는 class마다 파일을 다르게 두는게 맞으나,
// 학습 상의 목적으로 같은 파일에 함

abstract class Animal {

	// 미완성의 method
	// Animal을 상속받는 class들이 필수로 작성할 수 있도록!
	abstract void bark();

} // end of Animal

class Cat extends Animal {

	@Override
	void bark() {
		System.out.println("냥냥");
	}

} // end of Cat

class Dog extends Animal {

	@Override
	void bark() {
		System.out.println("애옹");
	}

} // end of Dog

class Bird extends Animal {

	@Override
	void bark() {
		System.out.println("짹짹");
	}

} // end of Bird

class Pig extends Animal {

	@Override
	void bark() {
		System.out.println("꿀꿀");
	}

	void eat() {
		System.out.println("냠냠굳");
	}

} // end of Pig

public class Polymorphism {

	public static void main(String[] args) {

		Animal[] anis = new Animal[] { new Cat(), new Dog(), new Bird(), new Pig() };

		for (Animal ani : anis) {
			ani.bark();
			if (ani instanceof Pig) {
				((Pig) ani).eat();
			} // end of if

		} // end of for

	} // end of main

} // end of Polymorphism
