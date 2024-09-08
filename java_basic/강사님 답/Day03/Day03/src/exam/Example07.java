package exam;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		/*
		 * Scanner() : 사용자가 데이터를 입력받을 때 사용하는 클래스
		 * 
		 * 형식)
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * scanner.nextByte() : byte형 입력 및 리턴 
		 * scanner.nextShort() : short형 입력 및 리턴 
		 * scanner.nextInt() : int형 입력 및 리턴
		 * scanner.nextLong() : long형 입력 및 리턴 
		 * 
		 * scanner.nextFloat() : float형 입력 및 리턴 
		 * scanner.nextDouble() : double형 입력 및 리턴 
		 * 
		 * scanner.next() : String형 입력 및 리턴
		 * scanner.nextLine() : String형 입력 및 리턴 
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 >> ");
		int num = sc.nextInt();
		System.out.println("입력받은 숫자는 : " + num);
		System.out.println("실수를 입력하세요 >> ");
		float num1 = sc.nextFloat();
		System.out.println("입력받은 실수는 : " + num1);
	}
}
