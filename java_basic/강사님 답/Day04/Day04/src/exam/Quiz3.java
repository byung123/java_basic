package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * Scanner 클래스를 사용해 정수로 된 돈의 액수를
		 * 입력받아 오만원권, 만원권, 천원권, 백원짜리동전
		 * 50원짜리동전, 10원짜리동전, 1원짜리동전을 
		 * 각 몇 개로 변환되는지 출력하세요 
		 * 
		 * 입력 >> 65376
		 * 오만원권 : 1매
		 * 만원권 : 1매
		 * 천원권 : 5매 
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 2개
		 * 1원 : 6개 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		
		int money = sc.nextInt();
		System.out.println("오만원 권 : " + money / 50000 + "매");
		money = money % 50000;
		System.out.println("만원 권 : " + money / 10000 + "매");
		money = money % 10000;
		System.out.println("천원 권 : " + money / 1000 + "매");
		money = money % 1000;
		System.out.println("백원 : " + money / 100 + "개");
		money = money % 100;
		System.out.println("오십원 : " + money / 50 + "개");
		money = money % 50;
		System.out.println("십원 : " + money / 10 + "개");
		money = money % 10;
		System.out.println("일원 : " + money / 1 + "개");
		
		
		
	}
}
