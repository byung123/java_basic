package exam;

public class Example03 {

	public static void main(String[] args) {
		/*
		 * 메모리에 할당받은 크기가 큰 자료형을 크기가 작은 자료형으로 전환하면 데이터의 손실이 발생한다.
		 * 
		 * 크기가 작은 자료형에서 큰 자료형으로 변환될 떄는 데이터 손실이 없다.
		 * 이 경우엔 형 변환을 생략할 수 있다
		 */
		int i1 =10;
		//byte b1 = i1; -> int로 선언한 값을 byte에 저장하려 해서 오류가 뜸
		byte b1 = (byte)i1;
		System.out.println(b1);
		
		byte b2 = 127;
		int i2 = b2; //int i2 = (int)b2 -> 할 필요 없어도 웬만하면 형 변환해서 붙여주는 것이 좋음
		//이건 에러 안남.
		System.out.println(i2);
		
		
		
	}

}
