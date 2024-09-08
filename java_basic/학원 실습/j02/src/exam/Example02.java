package exam;

public class Example02 {

	public static void main(String[] args) {
		//실수 표현
		double a = 1.1;
		System.out.printf("%f\n", a);
		System.out.printf("%f\n", 1.12);
		
		System.out.printf("%.1f\n", 1.12334456);
		System.out.printf("%f.2", 1.123456);
		System.out.println();
		System.out.printf("%.3f", 1.123456);
		System.out.println();
		System.out.printf("%.5f\n", 1.123456);
		
		//문자열
		String str = "Hello Java";
		System.out.printf("%s\n", str);
		
		char c = 'A';
		System.out.printf("%c\n", c);
	}

}
