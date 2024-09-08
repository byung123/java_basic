package exam;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++ ) {
			System.out.println(i + 1 + "번 입력 >> ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
