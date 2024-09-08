package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 키보드를 통해 학생 수와 각 학생들의
		 * 점수를 입력받고, 최고 최소 점수 
		 * 및 평균 점수를 출력하는 프로그램을 
		 * 작성하세요 
		 */
		Scanner sc = new Scanner(System.in);
		int student[] = null;
		
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수확인 |4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("입력 >> ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("학생 수 >> ");
				int studentNum = sc.nextInt();
				student = new int[studentNum];
			} else if(choice == 2) {
				System.out.println("[ 학생들의 점수입력 ]");
				for(int i = 0; i < student.length; i++) {
					System.out.println(i + 1 + ")번 학생점수 >> ");
					student[i] = sc.nextInt();
				}
			} else if(choice == 3) {
				System.out.println("[ 학생들의 점수 확인 ]");
				for(int i = 0; i < student.length; i++) {
					System.out.println(i + 1 + ")번 학생 점수 : " + student[i]);
				}
			} else if(choice == 4) {
				int max = 0;
				int min = student[0];
				int sum = 0;
				for(int i = 0; i < student.length; i++) {
					if(student[i] > max) {
						max = student[i];
					}
					sum = sum + student[i];
				}
				for(int i = 0; i < student.length; i++) {
					if(student[i] < min) {
						min = student[i];
					}
				}
				System.out.println("최대값 : " + max);
				System.out.println("최소값 : " + min);
				double avg = (double)sum / student.length;
				System.out.println("평균 : " + avg);
			} else if(choice == 5) {
				System.out.println("프로그램 종료!!");
				break;
			}
		}
		
	}
}
