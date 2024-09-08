package exam;

public class Quiz5 {
	public static void main(String[] args) {
		/*
		 * Math.random() 메소드를 이용해서 두 개의 주사위를
		 * 던졌을 때 나오는 눈을(눈1, 눈2) 형태로 출력하고
		 * 눈의 합이 5가 아니면 계속 주사위를 던지고
		 * 눈의 합이 5이면 실행을 멈추는 코드를 작성하세요
		 * 단) 실행을 멈추면 이때까지 주사위들의 합계를 전부 출력하세요
		 */
		
		int sum1 = 0;
		while(true) {
			int num3 = (int)(Math.random() * 6) + 1;
			int num4 = (int)(Math.random() * 6) + 1;
			int sum2 = num3 + num4;
		System.out.println("(" + num3 + ", " + num4 + ")");
		sum1 = sum1 + sum2; 
		if(sum2 == 5) {
			System.out.println("주사위 수의 합계 : " + sum1);
			break;
		}
		}
	}
}
