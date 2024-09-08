package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 중첩반복문
		 * - 바깥쪽 반복문
		 * - 안쪽 반복문
		 * 
		 * 바깥쪽 반복문과 안쪽 반복문이 독립적으로 사이클을 수행하는 독립적 중첩반복문
		 * 바깥쪽 반복문과 안쪽 반복문이 서로 영향을 받아 종속적인 형태를 띠는 종속적 중첩반복문
		 * 
		 * 형식)
		 * for(초기식; 조건식; 증감식 {
		 * 		for(초기식; 조건식; 증감식) {
		 * 
		 * 		}
		 * }
		 */
		
		//구구단(2 ~ 9단까지)
		for( int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
	}
}
