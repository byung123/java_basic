package exam;

public class Quiz4 {
	public static void main(String[] args) {
		int arr[] = {50,100,900,250,2,7,25,40};
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
	}
}
