package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 초등학교에서 중간고사 시험을 보았다
		 * 시험성적이 70점 이상이면 합격 70점 미만이면 불합격을 출력하고
		 * 점수가 0점 미만 100점 초과시 "입력범위를 초과하셨습니다" 라는
		 * 문구를 출력하세요
		 * 
		 * 점수를 입력받으세요
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 >> ");
		long num = sc.nextLong();
		
		if(num >= 70 && num <= 100) {
			System.out.println("합격");
		} else if (num < 0 || num > 100) {
			System.out.println("입력범위를 초과하셨습니다");
		} else {
			System.out.println("불합격");
		}
		
		//강사님 답
		//대충 같음
	}
}
