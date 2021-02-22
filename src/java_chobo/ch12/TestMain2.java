package java_chobo.ch12;

import java.util.ArrayList;
import java.util.Iterator;

// Product class와 이를 상속받는 Tv, Radip
class Product{
	
}

class Tv extends Product{
	
}

class Radio extends Product{
	
}

public class TestMain2 {

	public static void main(String[] args) {
		
		ArrayList<Tv> tvList = new ArrayList<Tv>(); // 가능 
		ArrayList<Product> productList = new ArrayList<Product>(); // 가능
		
//		ArrayList<Product> productList2 = new ArrayList<Tv>();
		// 에러뜸... 데이터들은 상속일지 몰라도 ArrayList에서는 l-value와 r-value 타입 다르면 아예 다른거임..! 별개로 생각하기
		
		tvList.add(new Tv()); // Tv 객체 생성 후 Tv타입의 리스트를 처리하는 ArrayList에 넣음
		
		// 아래는 모두 가능함! 새로운 객체를 생성해서 넣는데, 데이터를 넣는 자리이기 때문에 상속관계들을 모두 넣을 수 있음
		productList.add(new Product());
		productList.add(new Tv());
		productList.add(new Radio());
		
		// Iterator도 <>를 쓸 수 있음!
		Iterator<Product> it = productList.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*
		 * java_chobo.ch12.Product@15db9742
		 * java_chobo.ch12.Tv@6d06d69c
		 * java_chobo.ch12.Radio@7852e922
		 * 
		 * 이렇게 나오는 이유는 각각을 toString을 하지 않았기 때문임
		 * Object의 toString!
		 */
	}
	
}
