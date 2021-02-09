package java_chobo.ch07.vector;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {

		/*
		 * 처음 Vector를 호출하면 <> 표시가 나옴
		 * 제네릭, 일종의 팻말 역할을 수행
		 * Vector vec1 = new Vector();
		 * 위처럼 <>를 쓰지 않는다면 Object로 모두 넣을 수 있으나, 빼낼 때 typecast 과정이 복잡해짐
		 */

		// String 타입만 받는 Vector
		Vector<String> vec1 = new Vector<String>();
		
		for(int i = 0; i < 5; i++) {
			vec1.add("Test" + i); // add method
		}
		
		System.out.println(vec1); // sout에 넣어도 바로 출력 가능
		
		vec1.remove(3); // remove method
		System.out.println(vec1); //idx 3자리 사라지고, 뒤의 String 위치가 당겨짐(자동으로)
		
		System.out.println(vec1.size()); // size method
		
		System.out.println(vec1.get(0)); // get method << idx입력
		
		int idx = vec1.indexOf("Test4"); // Test4의 위치를 찾아서 idx로 return
		System.out.println(idx);
		
	} // end of main

} // end of class
