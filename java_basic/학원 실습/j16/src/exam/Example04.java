package exam;

import java.util.Scanner;

class Calculator{
	private int val1;
	private int val2;
	
	public Calculator(int val1, int val2) { //생성자 만듦
		this.val1 = val1;
		this.val2 = val2;
	}

	public int getVal1() {
		return val1;
	}

	public void setVal1(int val1) {
		this.val1 = val1;
	}

	public int getVal2() {
		return val2;
	}

	public void setVal2(int val2) {
		this.val2 = val2;
	}
	
	class Calc {
		public int add() {
			return getVal1() + getVal2();
		}
	}
}

public class Example04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("장수입력 >> ");
		int num2 = sc.nextInt();
		Calculator cal = new Calculator(num1, num2); 
		Calculator.Calc c = cal.new Calc(); 
		System.out.println("입력받은 두 수의 합 : " + c.add());
	}
}
