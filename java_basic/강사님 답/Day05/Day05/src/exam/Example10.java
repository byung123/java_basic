package exam;

public class Example10 {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		//System.out.println(str1);
		//System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(str1.equals(str2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
