package exam;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 수를 입력하여 그 수의 구구단을 출력하세요
		 * 
		 * 입력 >> 5
		 * 5 * 1 = 5
		 * 5 * 2 = 10
		 * ....
		 * 5 * 9 = 45
		 * 
		 * 입력 >> 7 
		 * ...
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 >> ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
	}
}
