package exam;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 컴퓨터가 1~100 숫자(정수 범위) 중 하나를 랜덤으로 정합니다. (이를 알려주지 않습니다.)
           사용자는 이 숫자를 맞추어야 합니다. 입력한 숫자보다 정답이 크면 → "UP" 출력,
           입력한 숫자보다 정답이 작으면 → "DOWN" 출력.
           답을 맞추면 → "정답"을 출력하고, 지금까지 숫자를 입력한 횟수를 알려줍니다.

           실행결과
           (예시) 컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다. 이 숫자를 맞춰주세요.
           입력:50 DOWN
           입력:25 UP
           입력:38 DOWN
           입력:32 UP
           입력:35 UP 
           입력:37 DOWN
           입력:36
           정답입니다! 7회 만에 맞췄어요.
		 */
		
		//내가 쓴 답
		// for로 하니까 조건식을 만들 수가 없어서 포기함
//		int ran = (int)(Math.random()*100) + 1;
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for(int i = 1; num == ran; i++) {	
//		System.out.print("입력 : ");
//		if (num > ran) {
//			System.out.println(" DOWN");
//		} else if(num < ran) {
//			System.out.println(" UP");
//		}
//		System.out.println("정답 입니다! " + i + "회 만에 맞췄어요!");
//		}
		
		
		int ran = (int)(Math.random()*100) + 1;
		Scanner sc = new Scanner(System.in);
		int i = 1;
		
		while(true) {
			System.out.print("입력 : ");
			int num = sc.nextInt();
			if(num > ran) {
				System.out.println(" DOWN");
			} else if(num < ran) {
				System.out.println(" UP");
			} else if(num == ran) {
				System.out.println("정답입니다! " + i + "회 만에 맞췄어요!");
				break;
			}
			i++;
		}
		
		//강사님 답
		//내가 쓴 while문과 같음
		
	}
}
