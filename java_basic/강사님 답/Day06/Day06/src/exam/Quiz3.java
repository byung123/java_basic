package exam;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 1 ~ 100까지 수 중 
		 * 짝수들만 출력하세요 !! 
		 */
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
