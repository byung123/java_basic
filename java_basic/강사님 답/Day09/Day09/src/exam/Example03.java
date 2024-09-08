package exam;

public class Example03 {
	public static void main(String[] args) {
		// 배열의 길이가 값의 개수로 결정
		int arr[] = {80,50,25,11,23,41,800,100};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
