package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 다중 예외처리
		 */
		Scanner sc = new Scanner(System.in);
		try {
			int cards[] = {4,5,1,2,7,8};
			System.out.println("몇 번째 카드를 받을래요 >> ");
			int cardsIndex = sc.nextInt();
			System.out.println("뽑은 카드 번호는 : " + cards[cardsIndex]);
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력이 가능합니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 번호의 카드는 없습니다.");
		}
	}
}
