package exam;

public class Example04 {

	public static void main(String[] args) {
		//변수 생성과 동시에 초기화
		int studentAge = 20; //학생의 나이를 저장할 수 있는 변수 선언
		System.out.println("학생의 나이는 : " + studentAge);

		//변수 선언 후 값 대입
		int myAge;
		myAge = 20;
		System.out.println("나의 나이는 : " + myAge);
		
		String myCity = "Seoul";
		System.out.println("I am from " + myCity);
		
		int x = 5;
		System.out.println(x);
		x= 10;
		System.out.println(x);
		
		
		// 변수를 선언하여 사칙연산 수행
		int x1 = 10;
		int x2 = 5;
		System.out.println(x1 + x2);
		System.out.println(x1 - x2);
		System.out.println(x1 * x2);
		System.out.println(x1 / x2);
		
		
	}

}
