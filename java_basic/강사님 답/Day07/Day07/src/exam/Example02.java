package exam;

public class Example02 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 10) {
			System.out.println("나무를 " + i + "번 찍었다.");
			if(i == 10) {
				System.out.println("나무넘어갑니다.");
			}
			i++;
		}
	}
}
