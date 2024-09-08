package exam;

public class Example01 {
	public static void main(String[] args) {
		// 복합 대입 연산자 
		int x = 10;
		int y = 1;
		
		
		// y = y + 1
		y += 1; // 1 + 1을 연산한 후에 y에 넣겠다 !! 
		System.out.println(y); // 2
		
		// y = y * x
		y *= x; // 2 x 10을 연산한 후에 y에 넣겠다 
		System.out.println(y);
		
		y %= x;
		System.out.println(y);
		
		
	}
}
