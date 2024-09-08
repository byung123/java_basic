 package exam;

public class Quiz5 {
	public static void main(String[] args) {
		/*
		 * arr 배열에 저장돼 있는 데이터를 짝수만 출력하시오
		 * int arr[] = {100,150,7,3,70,65,43};
		 */
		
		//내가 쓴 답
		int arr[] = {100,150,7,3,70,65,43};
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(); System.out.println();
		
		//강사님 답
		//나와 같음 
	}
}
