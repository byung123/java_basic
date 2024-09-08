package exam;

import java.util.Scanner;

class Grade{
	public int mat;
	public int sci;
	public int eng;
	
	public int average() {
		return (mat + sci + eng) / 3;
	}
}

public class GradeMain {
	public static void main(String[] args) {
		/*
		 * Grade 클래스를 작성하세요 
		 * 3과목의 점수를 입력받아 Grade 객체를 생성하고 
		 * 성적과 평균을 출력하세요
		 * 
		 * 수학, 과학, 영어 순으로 3개 점수 입력 >> 90 88 96
		 * 평균은 91
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		Grade grade = new Grade();
		grade.mat = sc.nextInt();
		grade.sci = sc.nextInt();
		grade.eng = sc.nextInt();
		System.out.println("평균은 : " + grade.average());
	}
}
