package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
	/*
	 * 다음 1 ~ 100 사이의 숫자를 맞추는 게임을 실행하던 도중에
	 * 숫자가 아닌 문자열을 넣어서 에러가 발생했다
	 * 에러처리를 해서 숫자가 아닌 값을 입력햇을 때 숫자를 다시 입력받도록 보완하세요~
	 */
	
	//내가 쓴 답 -> 다 됐는데 1~100까지의 범위가 아닌 숫자를 입력했을 때의 예외처리를 못하겠음.
	Scanner sc = new Scanner(System.in);
	
	int ran = (int)(Math.random() * 100 + 1);
	int i = 1;
	
	try{ System.out.println("1~100 까지의 숫자 맞추기 게임을 시작합니다.");
	System.out.println();
	System.out.println("숫자를 입력해 주세요 >> ");
	while(true) {
		int num = sc.nextInt();
		if (num > ran && num <= 100) {
			System.out.println("DOWN!");
			i++;
		} else if(num < ran && num > 0) {
			System.out.println("UP!");
			i++;
		} else if(num == ran) {
			System.out.println("정답입니다.");
			System.out.println("걸린 횟수 : " + i);
			break;
		} 		
		}
	} catch(InputMismatchException e) {
		System.out.println("숫자를 입력해주세요");
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("1~100 까지의 숫자만 입력해주세요");
	}
	
	// 강사님 답
	//while 반복문 안에 try를 쓰심
	// 예외발생 후 다시 입력받도록 하려면 catch{} 뒤에 바로 sc.nextInt();를 입력하심
	}
}
