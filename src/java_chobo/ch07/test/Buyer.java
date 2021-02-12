package java_chobo.ch07.test;

public class Buyer {

	int money = 1000;
	Product[] cart = new Product[3];
	int i; 
	
	void buy(Product p) {
		
		if(money < p.price) {
			System.out.printf("금액이 부족하여 %s을/를 살 수 없습니다.%n", p);
			return;
		}else {
			money = money - p.price;
			add(p);
		}
		
	} // end of buy
	
	void add(Product p) {
		
		if(i >= cart.length) {
			Product[] temp = new Product[cart.length * 2];
			
			for(int i = 0; i < cart.length; i++) {
				temp[i] = cart[i];
			}
			
			cart = temp;
			insertCart(p, i);
			
		}else {
			insertCart(p, i);
		}
		
		i++;
		
	} // end of add
	
	Product[] insertCart(Product p, int i) {
		
		cart[i] = p;
		return cart;
		
	}

	void summary() {
			
		System.out.printf("구입한 물건 : ");
		for(int i = 0; i < cart.length; i++) {
			System.out.print(cart[i] + "  ");
		}
		System.out.println();
		
		int sum = 0;
		for(int j = 0; j < cart.length && cart[j] != null; j++) {
			sum = sum + cart[j].price;
		}
		System.out.println("사용한 금액 : " + sum);
		
		System.out.println("남은 금액 : " + money);
		
	} // end of summary
	
} // end of Buyer
