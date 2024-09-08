package quiz;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"사랑","아기","돈","미래","희망"};
	
	private static String[] eng = {"love", "baby","money","future","hope"};
	
	public static String kor2Eng(String word) {
		//강사님답
		//for(int i = 0; i < kor.length; i++) {
		//		if(kot[i].equals(word)) {
		//			for(int j = 0; j < eng.length; j++) {
		//				if(kor[i] == kot[j]) {
		//					return kor[i] + "은 " + eng[j];
		//				}
		//          }
		//		}
		//	}
		
		//if(word.equals("그만")) {
		//	System.out.println("프로그램 종료!!");
		//	System.exit(0);
		//}
		//return word + "는 저의 사전에 없습니다.";
		return "";	
	}

	public static String[] getKor() {
		return kor;
	}

	public static void setKor(String[] kor) {
		Dictionary.kor = kor;
	}

	public static String[] getEng() {
		return eng;
	}

	public static void setEng(String[] eng) {
		Dictionary.eng = eng;
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
		 * 한들단어?
		 * 돈
		 * 돈 money
		 * 한영 단어 검색 프로그램입니다.
		 * 한글단어?
		 * 지갑
		 * 지갑은 저의 사전에 없습니다.
		 * 한영 단어 검색 프로그램입니다.
		 * 그만
		 * 프로그램 종료!!
		 */
		
		//내가 쓴 답 -> 입력한 단어가 배열안에 있는 단어(요소)인지 검사하는 함수가 뭔지 모르겠음, 그래서 그냥 내 방식대로 해버림
		Scanner sc = new Scanner(System.in);
		
		Dictionary dic = new Dictionary();
		
		while(true) {
			System.out.println("한영 단어 검색 프로그램입니다.");
			System.out.println("한글단어? ");
			String word = sc.nextLine();
			
			switch(word) {
				case "사랑" :
					System.out.println();
					System.out.println(Dictionary.getKor()[0] + " " +Dictionary.getEng()[0]);
					System.out.println();
					break;
				case "아기" :
					System.out.println();
					System.out.println(Dictionary.getKor()[1] + " " +Dictionary.getEng()[1]);
					System.out.println();
					break;
				case "돈" :
					System.out.println();
					System.out.println(Dictionary.getKor()[2] + " " +Dictionary.getEng()[2]);
					System.out.println();
					break;
				case "미래" :
					System.out.println();
					System.out.println(Dictionary.getKor()[3] + " " +Dictionary.getEng()[3]);
					System.out.println();
					break;
				case "희망" :
					System.out.println();
					System.out.println(Dictionary.getKor()[4] + " " +Dictionary.getEng()[4]);
					System.out.println();
					break;
				case "그만" :
					break;
				default :
					System.out.println();
					System.out.println(word + "은 저의 사전에 없습니다.");
					System.out.println();
					break;
			}
			if(word.equals("그만")) {
				System.out.println();
				System.out.println("프로그램 종료!!");
				break;
			}
		}
		
		//강사님 답  -> getKor, getRng, setKor, setEng 없이 작성하심
//		Sca scanner
		
//		while(true) {
//			System.out.println("한영 단어 검색 프로그램입니다.");
//			System.out.println("한글단어? ");
//			String word = sc.nextLine();
//			System.out.println(Dictionary.kor2Eng(word));
//			}
//		
	}
}


//

