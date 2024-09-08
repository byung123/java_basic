package quiz;

import java.util.Scanner;

class Dictionary{
	private static String[] kor = {"사랑","아기",
			"돈","미래","희망"};
	
	private static String[] eng = {"love", "baby",
			"money","future","hope"};
	
	public static String kor2Eng(String word) {
		for(int i = 0; i < kor.length; i++) {
			if(kor[i].equals(word)) {
				for(int j = 0; j < eng.length; j++) {
					if(kor[i] == kor[j]) {
						return kor[i] + "은 " + eng[j];
					}
				}
			}
		}
		if(word.equals("그만")) {
			System.out.println("프로그램 종료!!");
			System.exit(0);
		}
		return word + "는 저의 사전에 없습니다.";
	}
}

public class DictionaryMain {
	public static void main(String[] args) {
		/*
		 * 해당 단어를 입력받아 그 해당하는 단어의 영어 단어를 찾으세요!
		 * 
		 * 실행예시)
		 * 한영 단어 검색 프로그램입니다.
		 * 한글단어?
		 * 아기
		 * 아기 baby
		 * 한영 단어 검색 프로그램입니다.
		 * 한글단어
		 * 돈
		 * 돈 money
		 * 한영 단어 검색 프로그램입니다.
		 * 한글단어
		 * 지갑
		 * 지갑은 저의 사전에 없습니다.
		 * 한영 단어 검색 프로그램입니다.
		 * 그만
		 * 프로그램 종료 !! 
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("한영 단어 검색 프로그램입니다.");
			System.out.println("한글단어 ? ");
			String word = sc.nextLine();
			System.out.println(Dictionary.kor2Eng(word));
		}
	}
}
