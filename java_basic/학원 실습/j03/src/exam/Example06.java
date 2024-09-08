package exam;

public class Example06 {
	public static void main(String[] args) {
		// 강제 타입 변환
		int intVar = 48149; //'박'의 유니코드 정수 값
		char charVar = (char) intVar;
		System.out.println(charVar);
		
		intVar = 300;
		byte byteVar = (byte)intVar;
		System.out.println(byteVar);
		
		double doubleVar = 3.14;
		intVar = (int)doubleVar;
		System.out.println(intVar);
	}
}
