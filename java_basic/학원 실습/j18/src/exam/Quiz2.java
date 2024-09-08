package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 영문을 입력받아 엔터를 입력하면 입력한 영문을 소문자는 대문자로 대문자는 소문자로 변경하여
		 * 출력하는 프로그램을 작성하세요
		 * 단) 사용자가 END, end 라는 문자열을 입력받으면 프로그램을 종료하시오
		 * 
		 * 입력 >. 
		 * abcdEFG
		 * 대소문자 변환 : ABCDefg
		 * 입력 >. 
		 * end
		 * 프로그램 종료
		 */
		
		//내가 쓴 답 -> 못품
		Scanner sc = new Scanner(System.in);
		
		
//		while(true) {
//			System.out.println("입력 >> ");
//			String str = sc.nextLine();
//			List<String> list = new ArrayList<String>();
//			for(int i = 0; i < str.length(); i++) {
//				list.add(str.charAt[i]);
//			}
//			if(str.equals("end")) {
//				System.out.println("프로그램 종료");
//				break;
//			} else if( str.equals("END")) {
//				System.out.println("프로그램 종료");
//				break;
//			} else {
//				
//			}
//		}
		
		//강사님 답
		Scanner sc1 = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력 >> ");
			String str1 = sc1.nextLine();
			String change_str = "";
			if(str1.equals("END") || str1.equals("end")) {
				System.out.println("프로그램 종료");
				break;
			}
			for(char a : str1.toCharArray()) {
				if(Character.isLowerCase(a)) {
					change_str = change_str + Character.toUpperCase(a);
				} else {
					change_str = change_str + Character.toLowerCase(a);
				}
			}
			System.out.println("대소문자 변환 : " + change_str);
		}
	}
}
