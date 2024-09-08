package exam;

public class Example08 {
	public static void main(String[] args) {
		/*
		 * do ~ while문
		 * - 먼저 루프를 실행하고 조건식을 검사한다
		 *   즉) 조건과 상관없이 무조건 루프 한 번은 실행한다
		 * - 이거 쓰는 경우는 거의 없음, 현 개발자들도 do while문은 안씀
		 * - 앞으로 볼 일은 없을거임. 그래서 이건 여기까지만 배운다
		 */
		int sum = 0;
		int i = 1;
		do {                   // 먼저 실행하고
			sum = sum + i;
			i++;
		} while(i <= 10);      //그 다음 조건 비교
		System.out.println("합계 : " + sum);
	}
}
