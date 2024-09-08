package exam;

public class Example09 {
	public static void main(String[] args) {
		/*
		 * 난수생성 => Math.random()
		 * - 난수를 생성하고 싶을 때 사용하면 되고 
		 * 실수형이라 정수형으로 형 변환을 해줘야 한다 
		 */
		//System.out.println(Math.random());
		
		// 1 ~ 10까지 숫자를 무작위로 숫자하나 뽑기 
		System.out.println((int)(Math.random() * 10) + 1);
	}
}
