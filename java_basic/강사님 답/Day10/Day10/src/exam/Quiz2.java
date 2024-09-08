package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 금액을 입력받아 
		 * 그 값을 500, 100, 50, 10원
		 * 동전 개수를 최소한으로 표현하려고 할 때 
		 * 각 동전을 사용한 개수가 몇 개인지 
		 * 구하세요 
		 * 
		 * 입력 >> 2760
		 * 출력)
		 * 500원 : 5개
		 * 100원 : 2개
		 * 50원 : 1개
		 * 10원 : 1개
		 */
		Scanner sc = new Scanner(System.in);
		int coin[] = {500,100,50,10};
		System.out.println("입력 >> ");
		int money = sc.nextInt();
		int result[] = new int[coin.length];
		
		for(int i = 0; i < coin.length; i++) {
			result[i] = result[i] + money / coin[i];
			money = money % coin[i];
		}
		
		for(int i = 0; i < coin.length; i++) {
			if(i != coin.length - 1) {
				System.out.println(coin[i] + "원 : " + result[i] + "개");
			} else {
				System.out.println(coin[i] + "원 : " + result[i] + "개");
			}
		}
	}
}
