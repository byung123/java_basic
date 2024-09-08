package exam;

public class Example02 {
	public static void main(String[] args) {
		/*
		 * IndexOf()
		 * - 저장된 문자열 중에서 찾는 특정  단어 또는 문장의 시작 위치를 알려주는 메소드
		 */
		String str = "Hello World_MyWorld";
		//World 중 맨처음 위치에 있는 World의 시작 위치를 찾아줌
		System.out.println("World 단어 위치 : " + str.indexOf("World"));
		
		//몇 번째 위치부터 해당 단어를 찾을지 지정할 수 있다.
		// 10번째 위치에서 시작해서 World가 있는 단어의 위치를 찾겠다
		System.out.println("World 단어 위치 : " + str.indexOf("World", 10)); //14가 나옴
		
		String indexOfTest = "Hello World";
		System.out.println(indexOfTest.indexOf("o"));
		System.out.println(indexOfTest.indexOf(" "));
		System.out.println(indexOfTest.indexOf("o", 5));
	}
}
