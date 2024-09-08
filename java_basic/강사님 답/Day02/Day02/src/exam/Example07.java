package exam;

public class Example07 {
	public static void main(String[] args) {
		/*
		 * 정수형(byte, short, int, long)
		 * 
		 * 크기가 작은순에서 큰순
		 * byte  ->  short  ->  int  ->  long
		 * (1byte)	 (2byte)	(4byte)	 (8byte)
		 * 
		 * byte : -128 ~ 127
		 * short : -32768 ~ 32767
		 * int : -2147483648 ~ 2147483647
		 * long : -9223372036854775808 ~ 9223372036854775807
		 * 
		 */
		byte num1 = 20;
		//byte num2 = 128;
		//byte num3 = -129;
		
		System.out.println(num1);
		
		short num2 = 30;
		int num3 = 40;
		long num4 = 50;
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		System.out.println("===================");
		
		// 정수형에는 2진수, 8진수, 16진수도 표현 가능하다 
		// 출력은 전부 10진수로 출력된다 !! 
		byte num5 = 0110;
		short num6 = 0107;
		int num7 = 0x46;
		
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		
	}
}
