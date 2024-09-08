package exam;

public class Example07 {
	public static void main(String[] args) {
		// 1 ~ 10까지 모든 수의 합계
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}
}
