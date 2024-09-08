package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 두 정수를 입력받아 순서를 바꿔서 출력하세요 !!
		System.out.println("숫자입력 >> ");
		int a = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int b = sc.nextInt();
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		/*
		 * 임의의 두 자리 정수(10 ~ 99)를 입력받아서 
		 * 십의자리와 일의자리로 분리하여 출력하는 프로그램을 
		 * 작성하세요 !!
		 * 
		 * 출력 예)
		 * 10 ~ 99 사이의 정수를 입력 >> 45
		 * 십의자리 : 4
		 * 일의자리 : 5
		 */
		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();
		int result1 = num / 10;
		int result2 = num % 10;
		System.out.println("십의자리 : " + result1);
		System.out.println("일의자리 : " + result2);
		
		
		
		
	}
}
