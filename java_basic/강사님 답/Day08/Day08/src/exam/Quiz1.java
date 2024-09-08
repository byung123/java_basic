package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔금 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("메뉴입력 >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("예금액 >> ");
				int money = sc.nextInt();
				balance = balance + money;
			} else if(menu == 2) {
				System.out.println("출금액 >> ");
				int money = sc.nextInt();
				if(money > balance) {
					System.out.println("잔액이 부족합니다.");
				} else {
					balance = balance - money;
				}
			} else if(menu == 3) {
				System.out.println("잔고 : " + balance);
			} else if(menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
