package exam;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		String s1 = sc.nextLine();
		
		
		//이렇게 하면 입력창에 apple을 입ㅇ력해도 같지 않다는 결과가 나옴
		if(s1 == "apple") {
			System.out.println("같음");
		} else if(s1 != "apple") {
			System.out.println("같지않음");
		}
		
		/*
		 * == : 객체가 같은지를 비교하지만 객체가 갖고 있는 문자열은 비교하지 않음
		 * equals() : 문자열 데이터 값 그 자체를 비교함
		 */
	}
}
