package exam;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * Scanner로 입력받은 이름과 전화번호를 한줄에 한사람씩 
		 * 경로에 저장하세요 "그만"을 입력받으면 프로그램 종료 
		 * 
		 * 실행)
		 * 전화번호 입력 프로그램입니다 
		 * 이름 전화번호 >> 윤준형 010-5555-5555
		 * 이름 전화번호 >> 감자바 010-4445-7777
		 * 이름 전화번호 >> 김자바 010-1111-7777
		 * 이름 전화번호 >> 그만 
		 * c://에 저장하였습니다.
		 */
		Scanner sc = new Scanner(System.in);
		String filePath = "c:/uploadTest/전화번호부.txt";
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
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
