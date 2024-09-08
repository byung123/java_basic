package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 길이가 5인 배열을 입력받아 3번인 곳은 출력하지 말고 나머지만 출력하세요
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 +"번째 요소 입력 >> ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			if(i == 2) {
				continue;
			} else {
				System.out.print(arr[i] + " ");
			}	
			
		}
		//강사님 답
		// i == 3으로 고치면 나와 같음
		
	}
}
