package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 숫자를 계속 입력받아서 입력받은 숫자들의 총 합을 구하시오
		 * 0을 입력하면 "프로그램 종료"라는 메세지를 띄우고
		 * 프로그램을 종료시키면 됩니다
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		int sum = 0;
		while(true) {
			int num = sc.nextInt();
			sum = sum + num;
			if(num == 0) {
				System.out.println("입력받은 숫자들의 합 : " + sum);
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		//강사님 답
		Scanner sc1 = new Scanner(System.in);
		int sum1 = 0;
		while(true) {
			System.out.println("숫자 입력 >> ");
			int num1 = sc.nextInt();
			sum1 = sum1 + num1;
			if(num1 == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		System.out.println("입력받은 숫자들의 합 : " + sum1);
	}
}
