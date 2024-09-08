package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 흔한 수학 문제중 하나는 주어진 점이 어느 사분면에 
		 * 속하는지 알아내는 것이다 
		 * 사분면은 아래와 같이 1부터 4까지 번호를 갖는다 
		 * "Quadrant n"은 "제 n사분면"이라는 뜻이다 
		 * 
		 * Quadrant1 : (12,5)
		 * Quadrant2 : (-12,5)
		 * Quadrant3 : (-12,-5)
		 * Quadrant4 : (12,-5)
		 * 
		 * 예를들어 좌표가 (12,5)인 점 A는 x좌표와 y좌표가 모두 
		 * 양수이므로 제 1사분면에 속한다 
		 * 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제 2사분면에
		 * 속한다 
		 * 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아
		 * 내는 프로그램을 작성하세요 
		 * 
		 * 입력 >> 12 5  출력 : 1
		 * 입력 >> 9 -13 출력 : 4
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			System.out.println(1);
		} else if(num1 < 0 && num2 > 0) {
			System.out.println(2);
		} else if(num1 < 0 && num2 < 0) {
			System.out.println(3);
		} else if(num1 > 0 && num2 < 0) {
			System.out.println(4);
		}
		
		
		
		
		
	}
}
