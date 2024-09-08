package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 수를 입력받아 그 수의 절대값을 구하는 코드를 작성해 주세요
		 * 
		 * 입력 : -3
		 * 출력 : 3
		 * 
		 * 입력 : 3
		 * 출력 : 3
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println(num);
		} else {
			System.out.println(-num);
		}
		
		//강사님 답
		//나랑 같음
	}
}
