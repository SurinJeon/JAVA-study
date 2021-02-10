package java_chobo.ch06.dto;

public class Car {

	String color;
	String gearType;
	int door;
	
	public Car() {
		/*
		 * color = "white";
		 * gearType = "auto";
		 * door = 4;
		 */
	} // default constructor 구현한 것
	
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	} // parameter가 있는 constructor
	
	public Car(Car car) {
		/*
		 *this.color = car.color;
		 *this.gearType = car.gearType;
		 *this.door = car.door;
		 */
		this(car.color, car.gearType, car.door);
	} // Exam6_4에서 확인할 constructor

	@Override
	public String toString() {
		return String.format("Car [%s, %s, %d]", color, gearType, door);
	}
	
} // end of Car 

