package exam;

public class Example06 {

	public static void main(String[] args) {
		/*
		 * 자료형(data type)
		 * - 어떤 변수든지 타입(type)이 있으며, 타입에 따라 저장할 수 있는 값의 종류의 범위가 다르다
		 * 
		 * 정수형
		 * byte, short, int, long
		 * 
		 * 실수형
		 * float, double
		 * 
		 * 논리형
		 * boolean
		 * 
		 */
		//byte 타입 (-128 ~ 127)
		// 색상정보 및 파일 또는 이미지 등의 이진(binary) 데이터를 처리할 때 주로 사용한다!!
		byte value1 = -128;
		byte value2 = -50;
		byte value3 = 127;
		//byte value4 = 128; -> 에러남
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
