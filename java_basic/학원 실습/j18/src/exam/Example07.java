package exam;

public class Example07 {
	public static void main(String[] args) {
		/*
		 * StringTokenizer
		 * - 문자열을 특정 구분자로 분리할 때 사용된다
		 */
		String txt = "서울/부산/대구/인천/광주/대전/울산";
		
		StringTokenizer tokens = new StringTokenizer(txt, "/");
		while(tokens.hasMoreTokens()) {
			//공백 기준으로 자르겠다?
			System.out.println(Tokens.nextToken() + "");
		}
	}
}
