package exam;

import java.util.Scanner;

class Man{
	public String name;
	public String address;
	public int a;
	public int b;
	
	public void myInfo() {
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
	}
	
	/*
	 * return
	 * - 메소드를 호출할 때 매개변수를 전달해 준 것처럼 
	 * 필요에 따라 메소드의 실행 결과값을 돌려받는것 
	 */
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}
}

// 파일이름과 동일한 클래스 이름만 public 접근 
// 제한자를 포함할 수 있다 
public class Example02 {
	public static void main(String[] args) {
		Man man = new Man();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름입력 >> ");
		man.name = sc.nextLine();
		System.out.println("주소입력 >> ");
		man.address = sc.nextLine();
		System.out.println("숫자입력 >> ");
		man.a = sc.nextInt();
		System.out.println("숫자입력 >> ");
		man.b = sc.nextInt();
		
		System.out.println("저의 이름은 : " + 
					man.name + "이고");
		System.out.println("사는곳은 : " + man.address
				+ "이고");
		
		System.out.println("사칙연산을 할 수 있어요");
		System.out.println(man.a + " + " + man.b
				+ " = " + man.add(man.a, man.b));
		System.out.println(man.a + " - " + man.b
				+ " = " + man.sub(man.a, man.b));
		System.out.println(man.a + " * " + man.b
				+ " = " + man.mul(man.a, man.b));
		System.out.println(man.a + " / " + man.b
				+ " = " + man.div(man.a, man.b));
		
		
	}
}
