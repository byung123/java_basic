package exam;

public class Example06 {
	public static void main(String[] args) {
		int arr[] = new int[4]; //int형 배열로 선언하였으면 반드시 int 형만 들어가야 함
		arr[0] = 10;
//		arr[1] = "문자열"; //에러가 남
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(); System.out.println();
		
		String str[] = {"사과", "포도", "바나나", "체리"};
		for(int i = 0; i < str.length; i++) {
			System.out.printf("%s\t", str[i]);
		}
		System.out.println(); System.out.println();
		
		int list[] = null;
		list = new int[4];
		for(int i = 0; i < list.length; i++) {
			list[i] = i + 1;
		}
		
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i]);
		}
		System.out.println(); System.out.println();
		
	}
}
