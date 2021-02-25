package java_chobo.ch13;

class Account{
	
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	} // end of getBalance()
	
	public void withdraw(int money) {
		
		if (balance >= money) {
			try {
				Thread.sleep(1000); // 의도적 1초 있다가 money만큼 인출
			} catch (InterruptedException e) {}
			balance = balance - money;
		}
		
	} // end of withdraw()
	
} // end of Account

class RunnableWithdraw implements Runnable {

	Account acc = new Account(); // Account class 이용 위해 객체 생성
	@Override
	public void run() {
		while (acc.getBalance() > 0) {
			// balance가 있다면, 100 200 300 중의 한 값을 임의로 선택해서 출금하도록 함 (Math.random() 활용)
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			
			System.out.println("balance > " + acc.getBalance());
			
		}
		
	} // end of run()
	
} // end of RunnableWithdraw

public class Ex13_12 {

	public static void main(String[] args) throws InterruptedException {
	
		RunnableWithdraw r = new RunnableWithdraw();
		new Thread(r).start();
		
		Thread.sleep(500);
		
		new Thread(r).start();
		// 잔액이 남지 않았는데도 동기화 하지 않았기 때문에 두 thread 작업 결과는 마이너스로 금액 찍히게 됨
		
	} // end of main()
	
} // end of Ex13_12
