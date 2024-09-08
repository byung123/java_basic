package exam;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 숫자를 입력받아 백의자리 이하를 버리는 코드를 
		 * 작성하세요 
		 * 예를들어 456을 입력받으면 400이되고 
		 * 111을 입력받으면 100이 된다 
		 * 222를 입력받으면 200이 된다 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();
		int result = (num / 100) * 100;
		System.out.println(result);
	}
}
