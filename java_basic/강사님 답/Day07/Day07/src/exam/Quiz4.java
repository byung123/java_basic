package exam;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int computer = (int)(Math.random() * 100) + 1;
		int count = 0;
		System.out.println(computer);
		System.out.println("컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다.");
		System.out.println("이 숫자를 맞춰주세요.");
		while(true) {
			System.out.println("1 ~ 100 숫자 입력 >> ");
			int user = sc.nextInt();
			count++;
			if(computer > user) {
				System.out.println("UP");
			} else if(computer < user) {
				System.out.println("DOWN");
			} else if(computer == user) {
				System.out.println("정답입니다." + count + "회 만에 맞췄어요");
				break;
			}
			
		}
	}
}
