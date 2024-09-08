package exam;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 조건문(if)
		 * - 조건식의 결과에 따라 종속 문장(블록 내의 문장)의 실행 여부가 결정
		 * - 조건식의 연산 결과가 true이면 블록 내 문장을 실행하고 false면 실행하지 않는다
		 * - if문의 조건식에는 boolean 변수 또는 true와 false 값을 산출할 수 있는 연산식이 올 수 있다.
		 * - else문은 단독으로 사용불가
		 * - if문의 실행문이 실행될 경우 if ~ else 문을 바로 벗어남
		 */
		
		int score = 70;
		if(score >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		int money = 2000;
		if(money >= 2000) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가!!");
		}
	}
}
