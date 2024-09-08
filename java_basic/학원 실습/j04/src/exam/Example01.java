package exam;

public class Example01 {
	public static void main(String[] args) {
		//복합 대입 연산자
		int x = 10;
		int y =1;
		
		
		// y = y + 1 과 같은 의미
		y += 1;
		System.out.println(y);
		
		y *= x;
		System.out.println(y);
		
		y %= x;
		System.out.println(y);

	}

}
