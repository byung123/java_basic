package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 키보드를 통해 각 학생수와 점수를 입력받고, 최소 최대 점수 및 평균 점수를 출력하는 프로그램을 작성하세요
		 * 
		 * ---------------------------------------------
		 * 1.학생 수 | 2.점수 입력 | 3.점수 확인 | 4.분석 | 5.종료
		 * ---------------------------------------------
		 * >> 1
		 * 학생 수 : 3
		 * >> 2
		 * [ 학생들의 점수 입력 ]
		 * 1)번 학생의 점수 : 50
		 * 2)번 학생의 점수 : 60
		 * 3)번 학생의 점수 : 76
		 * >> 3
		 * [ 학생들의 점수 확인 ]
		 * 1)번 학생의 점수 : 50
		 * 2)번 학생의 점수 : 60
		 * 3)번 학생의 점수 : 76
		 * >> 4
		 * [ 학생들의 점수 분석 ]
		 * 1) 최고 점수 : 76
		 * 2) 최소 점수 : 50
		 * 3) 평균 점수 : 62.0
		 * >> 5
		 * 
		 */
		
		//내가 쓴 답 --> 모르겠음(학생 수가 몇이냐에 따라 입력하는 점수 개수도 바뀌는 걸 어떻게 구현해야할지 모르겠음 -> 자꾸 오류 뜸)
		//선생님 답 듣다보니 고쳐서 다시 됨. 나중에 혼자서 한 번 더 해보자
		Scanner sc = new Scanner(System.in);
		
//		int score[] = new int[];
		int sum = 0;
		int num = 0;
		int score[] = new int[0];
		
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생 수 | 2.점수 입력 | 3.점수 확인 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.println("입력 >> ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("학생 수 : ");
				int stnum = sc.nextInt();
				num = stnum;
				score = new int[num];
			} else if(select == 2) {
				System.out.println("[ 학생들의 점수 입력 ]");
				for(int i = 0; i < num; i++) {
					System.out.print(i + 1 + ")번 학생의 점수 : ");
					score[i] = sc.nextInt();
					System.out.println();
					sum = sum + score[i];
				}	
			} else if(select == 3) {
				System.out.println("[ 학생들의 점수 확인 ]");
				for(int i = 0; i < num; i++) {
					System.out.println(i + 1 + ")번 학생의 점수 : " + score[i]);
				}
			} else if(select == 4) {
				System.out.println("[ 학생들의 점수 분석 ]");
				int max = 0;
				int min = 100;
				for(int i = 0; i < num; i++) {
					if(max < score[i]) {
						max = score[i];
					}
				}
				for(int i = 0; i < num; i++) {
					if(min > score[i]) {
						min = score[i];
					}
				}
				System.out.println("1) 최고 점수 : " + max);
				System.out.println("1) 최저 점수 : " + min);
				System.out.println("1) 평균 점수 : " + (double)(sum / num));
			} else if(select == 5) {
				System.out.println("종료");
				break;
			} 
		}
		
		//강사님 답
		/*
		 * student = 0
		 * 
		 * if = 1 {
		 * int stunum = sc.nextint();
		 * student = new int[stunum];
		 * 
		 * else if = 2 {
		 * System ~~~
		 * for (i =0; i< student.length; i++) {
		 * System.out(i+1 + ")번 학생 점수");
		 * student[i] = sc.nextint();
		 * 
		 * else if = 3 {
		 * system.out~~~
		 * for(i =0; i< student.length; i++) {
		 * System.out(i+1 + ")번 학생 점수 : " + student[i]
		 * 
		 * else if = 4 {
		 * int max = 0;
		 * int min = student[0];
		 * for(i=0; i<student.length; i++) {
		 * if(student[i] > max) {
		 * max = student[i]
		 * 
		 * for(i = 0; i < student.length; i++) {
		 * if(student[i] < min) {
		 * min = student[i]
		 * }
		 * System.out.println("최대값 : 최소값 : 평균값 : ");
		 * 
		 */
		
		
	}	
}
