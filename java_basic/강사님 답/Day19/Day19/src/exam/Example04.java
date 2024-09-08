package exam;

import java.util.HashMap;
import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		/*
		 * Map
		 * - key(키), value(값)으로 구분하여 데이터를 저장하는 방식
		 * - Map의 구현 클래스로는 HashMap, LinkedHashMap,
		 * HashTable
		 * - HashMap은 데이터의 순서가 보장되지 않는다 
		 * - HashMap의 순서를 보장하고 싶은 경우 LinkedHashMap
		 * 을 사용하면 된다 
		 */
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("apple", "사과");
		dic.put("banana", "바나나");
		dic.put("grape", "포도");
		System.out.println(dic);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("찾을단어 >> ");
			String find_word = sc.next();
			if(find_word.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			// 여러분들이 입력받은 값을 Map에서 가져와라 
			String word = dic.get(find_word);
			// 만약에 입력받은 값이 Map 저장된 key값이랑 비교해서
			// 없다면 null을 반환한다 
			if(word == null) {
				System.out.println(find_word + 
						"는 없는 단어입니다.");
			} else {
				System.out.println(word);
			}
		}
	}
}
