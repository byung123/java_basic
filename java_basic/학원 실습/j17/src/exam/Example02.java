package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		// 입력받을 문자가 다른 타입일 때
		Scanner sc = new Scanner(System.in);
		try {
			int score = sc.nextInt();
			if(score >= 70) {
				System.out.println("합격입니다");
			} else {
				System.out.println("불합격입니다");
			}
		} catch(InputMismatchException e) {   // 입력을 잘못받았을 때 예외문구
			System.out.println("키보드 입력이 잘못되었습니다");
		}
	}
}
