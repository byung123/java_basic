package exam;

public class Quiz4 {
	public static void main(String[] args) {
		char[] arr = new char[26];
		/*
		 * char 배열을 생성하여 
		 * 알파벳 A ~ Z까지 출력하세요 
		 * 단) 역순으로 출력하세요 !! 
		 */
		 for(int i = 0; i < arr.length; i++) {
			 arr[i] = (char) (90 - i);
		 }
		 
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
        
	}
}
