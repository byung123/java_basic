package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * Scanner을 이용하여 한 라인을 읽고, 공백으로 분리된 어절이 몇 개 들어 있는지
		 * "그만"을 입력할 때까지 반복하는 프로그램을 작성하시오.
		 * 
		 * 입력 >> I love Java
		 * 어절 개수 : 3
		 * 입력 >> 자바는 객체 지향 언어로써 매우 좋은 언어이다.
		 * 어덜 개수 : 7
		 * 입력 >> 그만
		 * 종료합니다...
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력 >> ");
			String str = sc.nextLine();
			String str2 = str.replaceAll(" ", "");
			
			int num1 = str.length();
			int num2 = str2.length();
			
			int temp = num1 - num2 + 1;
			
			if(str.equals("종료")) {
				System.out.println("종료합니다...");
				break;
			} else {		
				System.out.println("어절 개수 : " + temp);
			}
		}
		
		//강사님답
//		while()
//			if str.equals까지는 나랑 같고
//			String[] word = str.split(" ");
//		System.out.println("어절 개수는 : " + word.length); 로 나타내심
		
	}
}
