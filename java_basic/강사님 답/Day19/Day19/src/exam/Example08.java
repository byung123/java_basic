package exam;

public class Example08 {
	public static void main(String[] args) {
		// 익명 객체를 이용해 처리하는 방법 
		// 대부분 스레드를 돌릴때 아래와 같은 방식으로 처리함 
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(3000);
					System.out.println("화면이동");
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
		thread.start();
	}
}
