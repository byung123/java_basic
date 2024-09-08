package exam;

public class Quiz5 {
	public static void main(String[] args) {
		/*
		 * Math.random() 메소드를 이용해서 두 개의 주사위를
		 * 던졌을 때 나오는 눈을(눈1, 눈2) 형태로 출력하고 
		 * 눈의 합이 5가 아니면 계속 주사위를 던지고 
		 * 눈의 합이 5이면 실행을 멈추는 코드를 작성하세요 
		 * 단) 실행을 멈추면 이때까지 주사위들의 합계를 전부 
		 * 출력하세요 !! 
		 * 
		 * 출력 )
		 * (1,3)
		 * (2,1)
		 * (2,3)
		 * 
		 */
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			if(dice1 + dice2 == 5) {
				break;
			}
		}
	}
}
