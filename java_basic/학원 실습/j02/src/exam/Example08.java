package exam;

public class Example08 {
	public static void main(String[] args) {
		
		
		//long 타입의 큰 정수를 표현하고자 하면(int 범위를 벗어났을 시)
		//숫자 뒤에 소문자 l이나 대문자 L을 반드시 붙여야 한다.
		long num1 = 1000000000000L;
		long num2 = 1000000000000l;
		long num3 = 10000l;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		/*
		 * 실수형(float, double)
		 * 
		 * 크기가 작은 것 : float (4byte)
		 * 크기가 큰 것 : double (8byte)
		 * 
		 * float는 소수점 7자리까지 정확하게 표현하며
		 * double은 소수점 15자리까지 정확하게 표현됨 -> 그래서 웬만하면 소수는 보통 double을 사용
		 * 컴퓨터에서 실수를 가지고 수행하는 모든 연산에는
		 * 작은 오차가 존재한다. 자바뿐 아니라 모든 프로그래밍 언어에서 발생하는 기본적인 문제임 !!
		 */
		double marathon = 42.195;
		// float형은 반드시 뒤에 f or F를 붙여야 함 !!
		float halfMarathon = 21.0975F;
		System.out.println("마라톤은 " + marathon + "km를 달린다.");
		System.out.println("하프 마라톤은 " + halfMarathon + "km를 달린다.");
		
		double pieDouble = 3.141592653589793;
		float pieFloat = 3.141592653589793F;
		System.out.println(pieDouble);
		System.out.println(pieFloat);
		
	}
}
