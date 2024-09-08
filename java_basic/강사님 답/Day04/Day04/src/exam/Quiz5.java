package exam;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		/*
		 * 합격 불합격 판별
		 * 입력받은 숫자가 70점 이상이면 합격
		 * 그렇지 않으면 불합격 
		 * 삼항연산자로 작성하세요 
		 * 
		 * 입력 >> 70
		 * 출력 >> 합격입니다
		 * 
		 * 입력 >> 69
		 * 출력 >> 불합격입니다
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력 >> ");
		
		int score = sc.nextInt();
		String result = (score >= 70) ? "합격입니다." : "불합격입니다.";
		System.out.println(result);
	}
}
