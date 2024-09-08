package exam;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String filePath = "c:/Folder/전화번호부.txt";
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