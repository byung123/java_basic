package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * while문
		 * 
		 * 형식)
		 * while(조건식) {
		 * 		실행문... -> 조건식이 true일 때 반복실행
		 * }
		 */
		
		int i = 1; //초기식
		while(i <= 10) { //조건식
			System.out.println(i); //실행문
			i++; //증감식
		}
	}
}
