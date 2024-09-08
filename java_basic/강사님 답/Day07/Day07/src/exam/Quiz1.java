package exam;

public class Quiz1 {
	public static void main(String[] args) {
		// 1 ~ 100까지 수중 
		// 3의 배수만 출력하세요 !! 
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}
