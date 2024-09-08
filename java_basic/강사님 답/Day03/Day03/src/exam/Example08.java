package exam;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * next()
		 * - 공백을 기준으로 단어 하나를 읽어들임 
		 */
		System.out.println("문자열 입력 >> ");
		String str = sc.next();
		System.out.println(str);
	}
}
