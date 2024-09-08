package exam;

public class Example10 {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		//System.out.println(str1);
		//System.out.println(str2);
		
		//다르다고 나옴 왜냐? str1과 str2가 참조하고 있는 번지가 다르기 때문에 다르다고 나옴
		if(str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		//이건 같다고 나옴 -> 데이터 값만을 비교하기 때문
		if(str1.equals(str2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
