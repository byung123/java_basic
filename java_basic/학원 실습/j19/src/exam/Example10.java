package exam;

import java.awt.Toolkit;

class BeepoTask implements Runnable {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Example10 {    //띵 출력과 동시에 소리 들림
	public static void main(String[] args) {
		Runnable beepTask = new BeepoTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);	
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
