package exam;

public class Example04 {
	public static void main(String[] args) {
		/*
		 * 실수형 간의 형 변환
		 * - 크기가 큰 자료형(double)에서 작은 자료형(float)
		 * 으로 변환할 때 float의 저장 범위를 넘어서는 값을 
		 * 대입하면 무한대가 되거나 0이된다 
		 */
		double d1 = 1.0e100;
		float f1 = (float) d1; // float의 최대 범위를 초과함 !!
		System.out.println(f1);
		
		double d2 = 1.0e-100;
		float f2 = (float) d2;
		System.out.println(f2);
		
		System.out.println("=================");
		
		double pie = 3.14;
		int pieIne = (int) pie;
		System.out.println(pieIne);
		
		int num = 100;
		double numD = (double) num;
		float numF = (float) 100;
		System.out.println(numD);
		System.out.println(numF);
	}
}
