package exam;

public class Example02 {
	public static void main(String[] args) {
		int IntArray[] = new int[5];
		String strArray[] = new String[5];
		
		// 5개의 값을 가진 배열 선언
		int[] varArray = {1,2,3,4,5};
		
		System.out.println("IntArray[0] = " + IntArray[0]); //아무것도 안나옴 -> 아직 값을 넣은게 아니라서
		
		System.out.println("varArray[0] = " + varArray[0]);
		
		int arr[] = {10,20,30,40,50,60,70,80};
		//다음 배열중 인덱스가 3인곳에 접근하여 해당 인덱스에 저장된 데이터를 출력하세요
		System.out.println("arr[3] = " + arr[3]);
	}
}
