package exam;

public class Example06 {
	public static void main(String[] args) {
		int coffee  = 10;
		while(true) {
			System.out.println("돈을 받았으니 커피를 준다");
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + "입니다");
			if(coffee == 2) {
				System.out.println("남은 커피수는 " + coffee + "개라서 내가 마실게요");
				System.out.println("영업 종료~~~~~~~~~~~");
				break;
			}
		}
	}
}
