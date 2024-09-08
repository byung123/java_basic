package exam;

public class Example04 {
	public static void main(String[] args) {
		/*
		 * 반복문(for, while, do ~ while)이란?
		 * - 프로그램 내에서 똑같은 명령을 일정 횟수만큼 반복하여 수행하도록 제어하는 제어문
		 * 
		 * 형식)
		 * for(초기식; 조건식; 증감식) {
		 * 		실행문...
		 * }
		 * 1. 초기식 실행
		 * 2. 조건식 실행
		 * 3. 실행문장 실행
		 * 4. 증감식 실행
		 * 5. 증감식 실행 후 조건식에 부합한지 판별
		 * 6. 실행문 수행
		 * 7. 증감식 수행 후 조건식에 부합한지 판별
		 * 8. 조건식에 부합하지 않으면 반복문 종료!!
		 */
		//인텔리제어 디버깅 단축기 구글에 검색해서 툴(이클립스)에 맞게 익히기
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Hello World~~" + i + "번");
		}
		
		System.out.println();
		
		//1 부터 100까지 출력하기
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
}
