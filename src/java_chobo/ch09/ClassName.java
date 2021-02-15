package java_chobo.ch09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassName {

	public static void main(String[] args) {

		Point p = new Point(4, 5);
//		p.getClass(); >> return타입이 class임 눈으로 확인하려면 어디에 담아서 찍어봐야함 
		
		/*
		 *  ?는 Object라고 보면 됨
		 *  source code를 받아오는 대신 byte로 source code 분석하기
		 *  일종의 Reflection 기법
		 */
		Class<?> obj = p.getClass(); 
		Constructor<?>[] cons = obj.getConstructors(); // 해당 객체 안에 있는 생성자들을 >배열<로 받아오기!
		
		for(Constructor<?> c : cons){
			System.out.println(c);
		}
		
		for(Method m : obj.getMethods()) {
			System.out.println(m); // >> method들의 signiture들이 출력됨
		}
		
	}

}
