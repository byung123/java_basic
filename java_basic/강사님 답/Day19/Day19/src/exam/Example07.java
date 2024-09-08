package exam;

class MyThread extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum = sum + (i + 1);
		}
		System.out.println("sum = " + sum);
		// 스레드에 별도의 이름을 지정하지 않으면 컴퓨터가 알아서 지정
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름 : " + threadName);
	}
}

public class Example07 {
	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
	}
}
