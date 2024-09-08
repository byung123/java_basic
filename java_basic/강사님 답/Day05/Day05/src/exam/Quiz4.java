package exam;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 연산기호에 따라(덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈(/))을 하는 
		 * 사칙연산을 하는 프로그램을 작성하세요 
		 * 숫자는 int형으로 입력!!
		 * 숫자입력 >> 3
		 * 기호입력 >> +
		 * 숫자입력 >> 3
		 * 결과 : 6
		 * 
		 * 숫자입력 >> 10
		 * 기호입력 >> %
		 * 숫자입력 >> 20
		 * 기호를 잘못입력하였습니다. 
		 * 
		 * char형 입력방법
		 * char 변수명 = sc.next().charAt(0)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("기호입력 >> ");
		char op = sc.next().charAt(0);
		System.out.println("숫자입력 >> ");
		int num2 = sc.nextInt();
		
		if(op == '+') {
			System.out.println(num1 + num2);
		} else if(op == '-') {
			System.out.println(num1 - num2);
		} else if(op == '*') {
			System.out.println(num1 * num2);
		} else if(op == '/') {
			System.out.println(num1 / num2);
		} else {
			System.out.println("기호를 잘못 입력하였습니다");
		}
	}
}
