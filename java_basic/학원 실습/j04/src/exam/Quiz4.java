package exam;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 숫자를 입력받아 백의자리 이하를 버리는 코드를 작성하시오
		 * 예를들어 456을 입력받으면 400이 되고
		 *       111을 입력받으면 100이된다
		 *       222를 입력받으면 200이 된다
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		long num = sc.nextLong();
		
		System.out.println((num / 100) * 100);
		
		//강사님 답
		//나랑 같음
	}
}
