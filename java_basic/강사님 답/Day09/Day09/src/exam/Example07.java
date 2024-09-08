package exam;

public class Example07 {
	public static void main(String[] args) {
		
		// 3행 2열 
		int[][] arr = {{1,2},{3,4},{5,6}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		int[][] arr1 = new int[2][3];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		
		arr1[1][0] = 11;
		arr1[1][1] = 12;
		arr1[1][2] = 13;
		
		System.out.println("행의 크기 : " + arr.length);
		System.out.println("열의 크기 : " + arr[0].length);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
