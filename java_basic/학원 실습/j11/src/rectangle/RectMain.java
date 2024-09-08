package rectangle;

import java.util.Scanner;

public class RectMain {
	public static void main(String[] args) {
		/*
		 * Rectangle 클래스를 생성해서 가로와 세로를 필드로 선언하고 사각형의 넓이를 구하시오
		 * 
		 * 실행결과)
		 * 가로입력 >> 10
		 * 세로입력 >> 20
		 * 사각형의 면적은 : 200
		 */
		
		Rectangle rec = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로입력 >> ");
		rec.length = sc.nextDouble();
		System.out.println("세로입력 >> ");
		rec.height = sc.nextDouble();
		
		System.out.println("사각형의 면적은 : " + rec.getArea(rec.length, rec.height));
	}
}

//내가 쓴 답(위에 까지 합해서) -> 앞에꺼 살짝 보면서 했음.

class Rectangle {
	double length;
	double height;
	
	public double getArea(double length, double height) {
		return length * height;
	}
}

//강사님 답
//위에 만들어도 되고 따로 클래스 파일을 하나 생성해서 만들어도 된다고 하심
//강사님은 Rectangle 클래스 안의 getArea함수에서 따로 괄호안에 변수를 적지 않았음
//나머진 나와 같음

