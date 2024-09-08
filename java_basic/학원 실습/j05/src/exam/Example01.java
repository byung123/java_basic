package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 비트 연산자
		 * - 비트(bit) 단위로 연산한다
		 * - byte, short, char 타입을 비트 연산하면 int 타입으로 자동타입변환되어 계산된다
		 * 
		 * 종류) ~, &, ^, |, <<. >>
		 * &(논리곱) AND 연산자 : 두 비트가 모두 1일경우 1
		 * |(논리합) OR 연산자 : 두 비트중 하나라도 1일경우 1
		 * ^(배타적 논리합) : 두 비트가 다를 경우 1
		 * ~(비트반전) : 비트를 0에서 1로, 1에서 0으로 반전시킨다(= 보수연산)
		 * <<(쉬프트 연산자) : 왼쪽으로 지정한 숫자만큼 비트 이동
		 * >>(쉬프트 연산자) : 오른쪽으로 지정한 숫자만큼 비트 이동
		 */
		
		int num1 = 15; int num2 = 20;
		int result1 = num1 & num2;
		System.out.println(result1); // 4가 나옴 -> 두 수를 이진수로 변환 후 비트연산 하고 결과값 도출
		
		int result2 = num1 | num2;
		System.out.println(result2);// 31이 나옴
		
		int result3 = num1 ^ num2;
		System.out.println(result3);
		
		int result4 = num1 << 2;
		int result5 = num1 << 3;
		System.out.println(result4);
		System.out.println(result5);
		
		int result6 = num1 >>2;
		System.out.println(result6);
		
		int result7 = ~ num1;
		System.out.println(result7); // 음수가 나옴 (-16) -> 부호 연산자 까지 반대로
		
		
	}
}
