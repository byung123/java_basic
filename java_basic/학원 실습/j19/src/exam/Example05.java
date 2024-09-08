package exam;

import java.util.HashMap;
import java.util.Hashtable;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * HashMap, HashTable
		 * 
		 * HashMap
		 * - 단일스레드 환경에서 사용하기 좋은 자료구조
		 * - key, value 값이 null을 허용한다
		 * 
		 * HashTablew
		 * - 멀티스레드 환경에서 사용하기 좋은 자료구조
		 * - key, value 값이 null을 허용하지 않는다
		 */
		
		HashMap<String, String> map1 = new HashMap<String,String>();
		map1.put("apple", "사과");
		map1.put("banana", "바나나");
		map1.put("grape", "포도");
		map1.put(null, "오렌지");
		map1.put("coffee", null);
		System.out.println(map1);
		
		Hashtable<String, String> map2 = new Hashtable<String, String>();
		map2.put("apple", "사과");
		map2.put("banana", "바나나");
		map2.put("grape", "포도");
//		map2.put(null, "오렌지");    //HashTable은 null값을 저장할 수 없기 때문에 오류가 뜸
//		map2.put("coffee", null);
		System.out.println(map2);
	}
}
