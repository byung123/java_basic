package exam;

public class Example04 {
	public static void main(String[] args) {
		/*
		 * substring() 
		 * - 원하는 위치의 문자열을 잘라서 사용할 수 잇는 메소드
		 * - 입력된 문자열 중 특정 위치의 문자열을 추출할 수 있다
		 */
		String str = "1234-5678";
		// 문자열의 5번째 위치부터 끝까지 문자열 추출
		String subStr = str.substring(5);
		System.out.println(subStr);
		
		//0번째 인덱스부터 6(마지막 7에서 1빼야함)번째 인덱스 까지 문자열 추출
		String rangeStr = str.substring(0,7);
		System.out.println(rangeStr);
	}
}
