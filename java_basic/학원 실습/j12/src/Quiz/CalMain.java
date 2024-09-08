package Quiz;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		/*
		 * 계산기 클래스를 만들고
		 * 더하기, 빼기, 곱하기, 나누기를 수행하는 클래스를 만드세요
		 * 기호에 따라 연산결과가 다르게 나와야 한다
		 * 
		 * int 타입의 필드 : a, b
		 * int calculate() : 클래스의 목적에 맞는 연산을 설명하고 결과를 리턴
		 * 
		 * 실행) 두 정수와 연산자를 입력하세요 >> 5 7 *
		 * 35
		 */
		Cal cal = new Cal();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수와 연산자를 입력하세요 >> ");
		cal.a = sc.nextInt();
		cal.b = sc.nextInt();
		cal.c = sc.next();

		cal.calculate(cal.a,cal.b,cal.c);
		if(cal.c.equals("/")) {
			System.out.println("몫 : " + cal.result + "    나머지 : " + cal.result2);
		} else {
		System.out.println(cal.result);
		}
	}
}

//내가 쓴 답 -> 많이 보면서 함(아직 익숙하지 않음) : 자꾸 객체 생성 빠져먹고 문법 형식도 까먹는듯
//나만의 방식대로 정석 답에서 고쳐서 작성함(나누기 부분만, 나머진 정석 답대로 함)

class Cal {
	int a;
	int b;
	String c;
	int result;
	int result2;
	
	public int calculate(int a, int b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		if(c.equals("+")) {
			result = a + b;
		} else if(c.equals("-")) {
			result = a - b;
		} else if(c.equals("*")) {
			result = a * b;
		} else if(c.equals("/")) {
			result = a / b;
			result2 = a % b;
		}
		return result;
	
	}
}

//강사님 답  
//클래스 안에 멤버면수 a,b만 만들고 메소드는 a,b char c까지 하고 리턴 값은 0으로 설정하심.
//문자 입력받는건 char c = sc.next().charAt(0);으로 하심
//강사님은 if말고 switch 쓰심
//나머진 나랑 같음.


