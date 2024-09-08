package exam;

public class Quiz5 {
	public static void main(String[] args) {
		/*
		 * arr 배열에 저장되 있는 데이터중 짝수만
		 * 출력하세요 !! 
		 */
		int arr[] = {100,150,7,3,70,65,43};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
