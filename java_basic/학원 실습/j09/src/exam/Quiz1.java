package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 길이가 5인 배열을 입력받아 배열안에 모든 값의 총합과 평균을 구하시오
		 * 
		 * 출력결과)
		 * 1번쨰 요소 입력 >> 
		 * 50
		 * 2번째 요소 입력 >>
		 * 24
		 * 3번째 요소 입력 >>
		 * 30
		 * 4번째 요소 입력 >>
		 * 22
		 * 5번째 요소 입력 >>
		 * 21
		 * 총합 : 147    평균 : 29.4
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 요소 입력 >> ");
			int num = sc.nextInt();
			arr[i] = num;
			sum = sum + arr[i];
		}
		
		System.out.println("총합 : " + sum + "   평균 : " + (double)sum / arr.length);
		
		//강사님 답
		//sum과 arr[i]를 나눠서 반복문을 2개 따로 쓰심 -> 강사님 왈 : 실무에선 나처럼 따로 나눠서 쓰는것이
		//정신건강에 좋다.
	}
}
