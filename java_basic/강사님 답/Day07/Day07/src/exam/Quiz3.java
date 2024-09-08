package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 1부터 입력받은 수 까지의 합계를 구하세요 
		 * 
		 * 예를들어 100을 입력받았다면 
		 * 답) 5050
		 * 
		 * 10을 입력받았다면 
		 * 답) 55
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("총 합계 : " + sum);
	}
}
