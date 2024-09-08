package exam;

import java.util.Scanner;

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
		
		Grade grade = new Grade();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어순으로 3개 점수 입력 >> ");
		grade.mat = sc.nextInt();
		grade.sic = sc.nextInt();
		grade.eng = sc.nextInt();
		System.out.println("평균은 : " + grade.avg());
	}
}

//내가 쓴 답(위에까지 합해서)

class Grade {
	int mat;
	int sic;
	int eng;
	
	public int avg() {
		return (mat + sic + eng) / 3;
	}
}

//강사님 답
//나와 같음
