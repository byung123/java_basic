package exam;

public class Example06 {
	public static void main(String[] args) {
		int arr[] = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String str[] = {"사과","포도","바나나","체리"};
		for(int i = 0; i < str.length; i++) {
			System.out.printf("%s\t", str[i]);
		}
		System.out.println();
		int list[] = null;
		list = new int[4];
		for(int i = 0; i < list.length; i++) {
			list[i] = i + 1;
		}
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
