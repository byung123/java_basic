package exam;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		/*
		 * Scanner 클래스를 사용해 정수로 된 돈의 액수를 입력받아 
		 * 오만원권, 만원권, 천원권, 백원짜리동전, 50원짜리동전, 10원짜리동전, 1원짜리동전을
		 * 각 몇 개로 변환되는지 출력하세요.
		 * 
		 * 예)
		 * 입력 >> 65376
		 * 오만원권 : 1매
		 * 만원권 : 1매
		 * ...
		 * 10원 : 2개
		 * 1원 : 6개
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		long num = sc.nextLong();
		long res1 = num / 50000; long temp1 = num % 50000;
		long res2 = temp1 / 10000; long temp2 = temp1 % 10000;
		long res3 = temp2 / 1000; long temp3 = temp2 % 1000;
		long res4 = temp3 / 100; long temp4 = temp3 % 100;
		long res5 = temp4 / 50; long temp5 = temp4 % 50;
		long res6 = temp5 / 10; long temp6 = temp5 % 10;
		long res7 = temp6 / 1;
		System.out.println("오만원권 : " + res1 + "\n" + 
						   "만원권 : " + res2 + "\n" +
						   "천원권 : " + res3 + "\n" +
						   "100원 : " + res4 + "\n" +
						   "50원 : " + res5 + "\n" +
						   "10원 : " + res6 + "\n" +
						   "1원 : " + res7);
		//강사님 답
		Scanner sc1 = new Scanner(System.in);
		System.out.println("입력 >> ");
		
		long money = sc.nextLong();
		System.out.println("오만원권 : " + money / 50000 + "개");
		money %= 50000;
		System.out.println("만원권 : " + money / 10000 + "개");
		money %= 10000;
		System.out.println("천원권 : " + money / 1000 + "개");
		money %= 1000;
		System.out.println("100원 : " + money / 100 + "개");
		money %= 100;
		System.out.println("50원 : " + money / 50 + "개");
		money %= 50;
		System.out.println("10원 : " + money / 10 + "개");
		money %= 10;
		System.out.println("1원 : " + money / 1 + "개");
		
	}

}
