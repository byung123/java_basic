package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * while문과 scanner를 이용해 키보드로부터 입력받은 데이터로 예금 출금 조회 종료 기능을 만드시오
		 * 자바 방학특강 반복문퀴즈2
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		
		int sum1 = 0;
		
		while(true) {
			System.out.println("----------------------------------");
			System.out.println(" 1. 예금   2. 출금   3. 잔금   4. 종료");
			System.out.println("----------------------------------");
			System.out.println("입력 >> ");
			int num = sc.nextInt();
			switch(num) {
			case(1) : 
				System.out.println("예금할 금액 >> ");
				int num1 = sc.nextInt();
				System.out.println("예금액 : " + num1);
				sum1 = sum1 + num1;
				System.out.println("예금이 완료되었습니다.");
				System.out.println("현재 잔고 : " + sum1);
				System.out.println(" ");
				break;
			case(2) : 
				System.out.println("출금할 금액 >> ");
			int num2 = sc.nextInt();
				if(num2 <= sum1) {
					System.out.println("출금액 : " + num2);
					sum1 = sum1 - num2;
					System.out.println("출금이 완료되었습니다.");
					System.out.println("현재 잔고 : " + sum1);
					System.out.println(" ");
				} else if(num2 > sum1) {
					System.out.println("잔액이 부족합니다");
					System.out.println(" ");
				}
				break;
			case(3) : 
				System.out.println("잔고 : " + sum1);
				System.out.println(" ");
				break;
			case(4) :
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(num == 4) {
				break;
			}
		}
		
		//강사님 답
		//switch를 안쓰시고 if, else if 문으로만 하심 if num = 1 { System.out.println("예금액 : "); 이런식으로
		
		
		
		
	}
}
