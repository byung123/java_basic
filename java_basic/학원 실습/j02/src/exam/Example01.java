package exam;

public class Example01 {

	public static void main(String[] args) {
		/*
		 * 서식문자
		 * %d : 정수(10진수)
		 * %o : 정수(8진수)
		 * %x : 정수(16진수)
		 * %f : 실수
		 * %e : 지수(e표기 기반)
		 * %g : 출력 대상에 따라 %e 또는 %f 형태로 출력
		 * %s : 문자열
		 * %c : 문자
		 * 
		 * 제어믄자
		 * \n : 줄바꿈
		 * \t : 수평탭
		 * \' : 작은 따옴표 표시
		 * \" : 큰 따옴표 표시
		 * 
		 */
		//정수 출력
		System.out.printf("%d", 10);
		System.out.printf("저는 대학교 %d 학년에 재학중\n", 3);
		
		System.out.printf("%d\n", 10);
		System.out.printf("저는 대학교 %d 학년에 재학중\n", 3);
		
		int age = 10;
		System.out.printf("저는 %d살 입니다.", age);

		System.out.printf("\n%d %d %d", 10, 20, 30);
		
		
	}

}
