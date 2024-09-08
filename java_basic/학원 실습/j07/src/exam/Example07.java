package exam;

public class Example07 {
	public static void main(String[] args) {
		/*
		 * continue문
		 * - 반복문 안에서 continue를 만나면 이후의 실행코드는 실행되지 않고
		 *   반복문의 처음으로 돌아가 반복문을 실행한다. -> 즉, 밑에 무슨 코드가 있더라도 다시 처음으로 돌아감
		 */
		
		// 1 ~ 100까지 홀수 구하기
		int i = 0;
		while(i < 100) {
			i++;
			if(i % 2 == 0) { // 만약에 짝수면
				continue;    // 다시 루프 위로 가라
			}
			System.out.println(i);
		}
	}
}
