package exam;

import java.io.FileWriter;
import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:/Folder/test.txt");
			while(true) {
				String line = sc.nextLine();
				if(line.length() == 0) {
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}