package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 1차원 배열을 선언하여 
		 * 총 N개의 정수가 주어졌을 때 정수 v가 몇 개인지 구하세요 
		 * 
		 * 크기 >> 11
		 * 입력
		 * 1 4 1 2 4 2 4 2 3 4 4
		 * 숫자입력 2
		 * 결과) 3
		 */
		Scanner sc = new Scanner(System.in);
		int arr[] = null;
		System.out.println("크기 >> ");
		int len = sc.nextInt();
		arr = new int[len];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("입력 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				count = count + 1;
			}
		}
		System.out.println("개수 : " + count);
	}
}
