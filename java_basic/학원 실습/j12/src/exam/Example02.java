package exam;

import java.util.Scanner;

class MethodTest{ //메소드 이름은 동일하지만 매개 변수의 개수가 다른 경우 (오버로딩 예시), 타입을 다르게 해도 됨
	public int getSum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int getSum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}

public class Example02 {
	public static void main(String[] args) {
		/*
		 * 오버라이딩과 오버로딩의 차이
		 * 
		 * 오버로딩
		 * - 메서드 이름이 같고 매개변수의 개수 타입이 다른 함수
		 * 
		 * 오버라이딩
		 * - 이름 같고 갯수나 타입도 동일해야 한다
		 * - 상속받은 메소드의 내용만 변경하는 것
		 * 
		 * 메소드 오버로딩과 생성자 오버로딩
		 * 
		 * 오버로딩
		 * - 자바에서는 한 클래스 내에 이름이 같지만 매개변수의
		 *   타입이나 개수가 서로 다른 여러개의 메소드를 통해 작성할 수 있다
		 * 
		 */
		MethodTest test = new MethodTest();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int num2 = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int num3 = sc.nextInt();
		
		System.out.println(test.getSum(num1, num2));
		System.out.println(test.getSum(num1, num2, num3));
	}
	
}
