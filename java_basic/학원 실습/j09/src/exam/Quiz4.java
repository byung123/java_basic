package exam;

public class Quiz4 {
	public static void main(String[] args) {
		int arr[] = {50,100,900,250,2,7,25,40};
		// arr 배열에서 최대값을 구하세요
		
		//내가 쓴 답 -> 못품(최대값 함수가 뭔지 모르겠음)
//		int temp = 0;
//		
//		for(int i = 0; i < arr.length - 1; i++) {
//			for(int j = 0; j < arr.length - 1; j++) {
//				if(arr[j] >= arr[j+1]) {
//					arr[j+1] = arr[j];
//				} else if(arr[j] < arr[j+1]) {
//					arr[j+1] = arr[j+1];
//				} 
//			
//			}
//		}
//		System.out.println(arr[0]);
		
		//강사님 답 -> 최대값 함수 없이 간단하게 푸심
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
	}
}
