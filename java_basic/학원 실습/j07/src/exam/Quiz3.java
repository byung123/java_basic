package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 1부터 입력받은 수 까지의 합계를 구하시오
		 * 
		 * 예를들어 100을 입력받으면
		 * 답) 5050
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i <= num) {
			sum = sum + i;
			i++;
		}
		System.out.println("1부터 입력받은 수 까지의 합 : " + sum);
		
		//강사님 답
		//for문을 쓰심 for(int i = 0; i <= num; i++) 나와 같음 나머진
	}
}
