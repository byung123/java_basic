package exam;

public class Example05 {
	public static void main(String[] args) {
		if(true) {
			int n = 5;
			System.out.println("변수 n의 값 : " + n);
		}
		// 변수 n이 if문 블럭 밖을 벗어났으므로 사용할 수 없다. -> 지역변수임 
		//System.out.println("변수 n의 값 : " + n);
		/*
		 * 변수는 선언된 블록 안에서만 사용이 가능하다
		 * 함수 내에서 선언된 변수를 지역변수라고 한다
		 */

	}

}
