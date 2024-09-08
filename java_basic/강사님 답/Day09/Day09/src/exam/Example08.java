package exam;

public class Example08 {
	public static void main(String[] args) {
		/*
		 * 향상된 for문
		 * - 변수를 선언한 뒤 그 변수에 배열의 값이 저장되어 
		 * 반복하게 됨
		 * - 배열의 길이만큼 코드가 반복된다 
		 * 
		 * for(int i : 배열이름){
		 * 
		 * }
		 */
		int array[] = {10,20,30,40,50,60,70,80,90,100};
		
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		String strArray[] = {"사과", "포도", "바나나", "망고"};
		for(String i : strArray) {
			System.out.print(i + " ");
		}
	}
}
