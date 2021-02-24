package java_chobo.ch13;

/**
 * @author surin
 * class for Daemon
 */
public class Thread05 implements Runnable {

	static boolean autoSave = false;
	
	@Override
	public void run() {
		// 무한루프문으로 항상 대기 상태를 유지함
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 3초 쉬고
			if (autoSave) {
				autoSave();
			}
			// autoSave가 true가 되면 >> autoSave() 
			
		}
		
	}

	private void autoSave() {
		
		System.out.println("파일이 자동 저장되었습니다.");
		
	}
	
}
