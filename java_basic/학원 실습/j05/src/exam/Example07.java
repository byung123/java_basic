package exam;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 선택 >> ");
		
		int num = sc.nextInt();
		if(num == 1) {
			System.out.println("커피");
		} else if(num == 2) {
			System.out.println("콜라");
		} else if(num == 3) {
			System.out.println("사이다");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
	}
}
