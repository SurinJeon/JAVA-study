package java_chobo.ch06;

import java_chobo.ch06.dto.Car;

public class Exam6_4 {

	public static void main(String[] args) {

		Car car1 = new Car(); 
		System.out.println(car1);
		
		// parameter 있는 constructor 사용
		Car car2 = new Car("dust grey", "auto", 4);
		System.out.println(car2);
		
		// construtor 사용한 복사
		Car car3 = new Car(car2);
		System.out.println(car3);
	}

}
