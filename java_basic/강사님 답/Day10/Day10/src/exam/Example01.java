package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 클래스(class)
		 *  - 일종의 틀 설계도 이러한 것들을 클래스라고 한다 
		 *  - 클래스로부터 만들어진 객체를 인스턴스라 한다 
		 *  
		 * 객체지향 프로그래밍 개발 단계
		 * 1. 클래스 설계 
		 * 2. 인스턴스화(클래스를 이용한 객체 생성) 
		 * 3. 생성된 객체 사용 
		 * 
		 * 클래스의 용도
		 * - 라이브러리(API)용 : 다른 클래스에서 사용할 목적으로 설계
		 * - 실행용 : 프로그램의 실행 => main() 메소드를 제공하는
		 * 			 역할을 한다 !! 
		 */
		Student s1 = new Student(); // Student 클래스의 인스턴스
		Student s2 = new Student(); // Student 클래스의 인스턴스 
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
