package exam;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 관계연산자 (< , <=, >, >=, ==, !=)
		 * - 2개의 피연산자를 부호로 비교하여 그 부호 관계가 
		 * true인지 false인지 판별하는 연산자 
		 */
		int a = 10;
		int b = 20;
		
		// a가 b보다 크다 ?
		System.out.println(a > b);
		
		// b가 a보다 같거나 크다 ? 
		System.out.println(a <= b);
		
		// a랑 b가 같냐 ??
		System.out.println(a == b);
		
		// a랑 b가 다르냐 ?? 
		System.out.println(a != b);
		
		char ch1 = 'A'; // int 타입으로 변환되어 연산을 수행
		int num1 = 65;
		System.out.println(ch1 == num1);
		
	}
}
