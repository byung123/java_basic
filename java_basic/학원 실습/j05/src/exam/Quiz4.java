package exam;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 연산기호에 따라(덧셈(+), 뺼셈(-), 곱셈(*), 나눗셈(/)) 사칙연산을 하는 프로그램을 작성하시오
		 * 숫자는 int형으로 입력!!
		 * 숫자입력 >> 3
		 * 기호입력 >> +
		 * 숫자입력 >> 3
		 * 결과 : 6
		 * 
		 * 숫자입력 >> 10
		 * 기호입력 >> %
		 * 숫자입력 >> 20
		 * 기호를 잘못 입력하셨습니다
		 * 
		 * char형 입력방법
		 * char 변수명 = sc.next().charAt(0)
		 */
		
		//내가쓴 답 -> 기호가 잘못 입력됐다고 나옴 -> 강사님께서 첫 if문 안에 조건식을 default로 빼라고 하심
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("기호입력 >> ");
		char cir = sc.next().charAt(0);
		System.out.println("숫자입력 >> ");
		int num2 = sc.nextInt();
		
		if(cir != '+' || cir != '-' || cir != '*' || cir != '/') {
			System.out.println("기호를 잘못 입력하셨습니다");
		} else if( cir == '+') {
			System.out.println(num1 + num2);
		} else if( cir == '-') {
			System.out.println(num1 - num2);
		} else if( cir == '*') {
			System.out.println(num1 * num2);
		} else if( cir == '/') {
			System.out.println("몫 : " + (num1 / num2) + "나머지 : " + (num1 % num2));
		} else {
			System.out.println("값을 잘못 입력하셨습니다");
		}
		
		//강사님 답
        Scanner sc1 = new Scanner(System.in);
		
		System.out.println("숫자입력 >> ");
		int num3 = sc1.nextInt();
		System.out.println("기호입력 >> ");
		char cir2 = sc1.next().charAt(0);
		System.out.println("숫자입력 >> ");
		int num4 = sc1.nextInt();
		
		if(cir2 == '+') {
			System.out.println(num1 + num2);
		} else if( cir2 == '-') {
			System.out.println(num1 - num2);
		} else if( cir2 == '*') {
			System.out.println(num1 * num2);
		} else if( cir2 == '/') {
			System.out.println(num1 / num2);
		}  else {
			System.out.println("기호를 잘못 입력하셨습니다");
		}
	}
}
