package exam;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * char 배열을 생성하여 알파벳 A ~ Z까지 출력하세요 
		 * 단) 역순으로 출력하세요 !! 
		 */
		
		//내가 쓴 답
		char arr[] = new char[26];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (char)(90 - i);
			System.out.print(arr[i] + " ");
		}
		
		//강사님 답
		//나와 같음
	}
}
