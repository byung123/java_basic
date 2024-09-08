package exam;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * Scanner로 입력받은 이름과 전화번호를 한 줄에 한 사람씩
		 * 경로에 지정하세요 "그만"을 입력받으면 프로그램 종료
		 * 
		 * 실행)
		 * 전화번호 입력 프로그램입니다.
		 * 이름 전화번호 >> 윤준형 010-5555-5555
		 * 이름 전화번호 >> 김자바 010-4445-7777
		 * 이름 전화번호 >> 박자바 010-1111-7777
		 * 이름 전화번호 >> 그만
		 * c://에 저장하였습니다.
		 */
		
		//내가 쓴 답 -> 모르겠음
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("전화번호 입력 프로그램입니다.");
//		
//		FileWriter wri = null;
//		try {
//			wri = new FileWriter("C:/UploadTestFolder/이름과전화번호.txt");
//		
//			while(true) {
//				System.out.println("이름 전화번호 >> ");
//				String namephone = sc.nextLine();
//			
//			}	
//		}
		
		//강사님 답
		Scanner sc= new Scanner(System.in);
		String filePath = "c:/UploadTestFolder/전화번호부";
		File file = new File(filePath);
		try {
			FileWriter in = new FileWriter(file);
			while(true) {
				System.out.println("이름 전화번호 >> ");
				String line = sc.nextLine();
				if(line.equals("그만")) {
					break;
				}
				in.write(line, 0, line.length());
				in.write("\r\n", 0, 2);
			}
			in.close();
			System.out.println(file.getAbsolutePath() + "에 저장하였습니다.");
		} catch(Exception e) {
			
		}
	
	}
}
