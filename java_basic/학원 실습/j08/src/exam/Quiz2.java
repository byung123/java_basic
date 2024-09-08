package exam;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 구구단 짝수만 출력하세요
		 */
		
		//내가 쓴 답 
		for(int i = 2; i <= 9; i++) {
			if (i % 2 == 1) {
				continue;
			}
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
		
		//강사님 답
		//나랑 같음
	}
}
