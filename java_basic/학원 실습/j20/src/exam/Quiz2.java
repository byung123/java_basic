package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 1차원 배열을 선언하여
		 * 총 N개의 정수가 주어졌을 때 입력한 숫자 정수가 몇 개인지 구하세요.
		 * 
		 * 크기 >> 11
		 * 입력
		 * 1 4 1 2 4 2 4 2 3 4 4
		 * 숫자입력 2 (셀 숫자)
		 * 결과) 3
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		
		System.out.println("크기 >> ");
		int length = sc.nextInt();
		int[] num = new int[length];
		
		System.out.println("입력");
		for(int i = 0; i < length; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("숫자입력");
		int count = sc.nextInt();
		int n = 0;
		for(int i = 0; i < length; i++) {
			if(num[i] == count) {
				n++;
			} else {
				continue;
			}
		}
		System.out.println("결과) " + n);
		
		//강사님 답
		Scanner sc1 = new Scanner(System.in);
		int arr[] = null;
		System.out.println("크기 >> ");
		int len = sc1.nextInt();
		arr = new int[len];
		//나머진 같음
	}
}
