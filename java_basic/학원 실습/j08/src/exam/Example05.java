package exam;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * new 연산자
		 * - new 연산자는 객체를 Heap 영역에 메모리 공간을 할당해주고
		 *   메모리 주소를 변환한 후 생성자를 실행시켜준다
		 * - new 연산자로 생성된 객체는 똑같은 값을 가졌어도 서로 다른
		 *   메모리를 할당하기 때문에 서로 다른 객체로 분류됨
		 */
		
		String str1 = new String("Java");
		String str2 = new String("Java");
		if(str1 == str2) { // 각 str1과 str2가 할당된 메모리 영역이 다르기 때문에 다르다고 나옴
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
