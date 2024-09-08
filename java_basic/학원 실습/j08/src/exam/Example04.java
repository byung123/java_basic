package exam;

public class Example04 {
	public static void main(String[] args) {
		//배열을 생성하기 위해서는 new와 함께 자료형의 길이를 지정한다
		
		int arr1[] = new int[4]; //4만큼의 크기를 가진 배열을 생성
		int arr2[] = {1,2,3,4,5}; //배열을 이렇게도 즉시 생성 가능
		System.out.println(arr1); //뭔가 이상하게 나옴1
		System.out.println(arr2); //뭔가 이상하게 나옴2
		System.out.println();
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("arr2의 1번쨰 요소 : " + arr2[0]);
		System.out.println("arr2의 2번쨰 요소 : " + arr2[1]);
		System.out.println("arr2의 3번쨰 요소 : " + arr2[2]);
		
		int arr3[] = new int[4]; //4개의 공간을 가진 배열 선언
		System.out.println();
		
		// 배열의 값을 넣기
		arr3[0] = 2;
		arr3[1] = 10;
		arr3[2] = 4;
		arr3[3] = 40;
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
		}
	}
}
