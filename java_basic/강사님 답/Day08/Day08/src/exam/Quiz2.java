package exam;

public class Quiz2 {
	// 구구단중 짝수만 출력하세요 !! 
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			if(i % 2 != 0) { // 2로 나눴을 때 0으로 나눠 떨어지지 않는다 
				continue; // i쪽 루프로 올라감 !! 
			}
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
	}
}
