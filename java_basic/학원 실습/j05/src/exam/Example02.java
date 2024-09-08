package exam;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력 >> ");
		int num = sc.nextInt();
		String result = (num >=70) ? "합격" : "불합격";
		System.out.println(result);
		
		if(num >= 70) {
			System.out.println("합격");
		} else { System.out.println("불합격");
		}
	}
}
