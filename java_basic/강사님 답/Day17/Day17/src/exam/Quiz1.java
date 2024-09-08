package exam;

import java.util.Scanner;

public class Quiz1 {
	/*
	 * 다음 1 ~ 100 사이의 숫자를 맞추는 게임을 실행하던 도중에
	 * 숫자가 아닌 문자열을 넣어서 에러가 발생했다 
	 * 예외처리를 해서 숫자가 아닌 값을 입력했을 때 숫자를 
	 * 다시 입력받도록 보완하세요 ~~ 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int computer = (int)(Math.random() * 100) + 1;
		int count = 0;
		while(true) {
			try {
				System.out.println("숫자를 입력해주세요 >> ");
				int num = sc.nextInt();
				count++;
				if(computer > num) {
					System.out.println("up");
				} else if(computer < num) {
					System.out.println("Down");
				} else if(computer == num) {
					System.out.println("정답입니다. "
							+ count + "회 만에 맞췄어요");
					break;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력 가능합니다.");
			}
			sc.nextLine();
		}
	}
}
