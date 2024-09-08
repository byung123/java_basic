package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 1. 두 정수를 입력받아 순서를 바꿔서 출력하세요
		 * 
		 * 2. 임의의 두 자리 정수(10 ~ 99)를 입력받아서 
		 *    십의 자리와 일의 자리로 분리하여 출력하는 프로그램을 작성하시오.
		 *    
		 * 출력 예)
		 * 10 ~ 99 사이의 정수를 입력 >> 45
		 * 십의 자리 : 4
		 * 일의 자리 : 5
		 */
		
		//문제 1 내가 쓴 답
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1 >>");
		int num1 = sc.nextInt();
		
		System.out.println("정수2 >>");
		int num2 = sc.nextInt();
		
		System.out.println(num2+ "\n" + num1);
		
		
		
		//문제 2 내가 쓴 답
		Scanner sc1 = new Scanner(System.in);
		System.out.println("10 ~ 99 사이의 정수를 입력 >>");
		int num3 = sc1.nextInt();
		if(num3 > 99 || num3 < 10) {
			System.out.println("2자리수가 아닙니다! 다시 입력해주세요");
			sc1.nextInt();
		}
		else { System.out.println("십의 자리 : " + (num3 / 10) + "\n" +
								  "일의 자리 : " + (num3 % 10));
		}

		
		
		//문제 1 강사님 답
		Scanner sc2 = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int a = sc2.nextInt();
		System.out.println("숫자입력 >> ");
		int b = sc2.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a +"\n" + b);
		
		//문제 2 강사님 답
		System.out.println("숫자입력 >>");
		int num10 = sc2.nextInt();
		int result1 = num10 / 10;
		int result2 = num10 % 10;
		System.out.println("십의자리 : " + result1);
		System.out.println("일의자리 : " + result2);
		
		
	}
}
