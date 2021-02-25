package java_chobo.ch13;

class Account2 {
	private int balance = 1000;

	public int getBalance() {
		return balance;
	} // end of getBalance()

	/* synchronized 키워드를 사용해서 method를 동기화시킴 */
	public synchronized void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			balance = balance - money;

		}
	} // end of withdraw()

} // end of Account2

class RunnableWithdraw2 implements Runnable {

	Account2 acc = new Account2();

	@Override
	public void run() {
		while (acc.getBalance() > 0) {
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance > " + acc.getBalance());
		}
	} // end of run()

} // end of RunnableWithdraw2

/**
 * @author surin Ex13_12에 synchronized 적용하기
 */
public class Ex13_13 {

	public static void main(String[] args) throws InterruptedException {
		
		RunnableWithdraw2 r = new RunnableWithdraw2();
		new Thread(r).start();
		
		Thread.sleep(200);
		
		new Thread(r).start();
		// balacne에 음수가 찍히지 않음 >> synchronized를 했기 때문!
		
	} // end of main()

} // end of Ex13_13
