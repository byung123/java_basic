package exam;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 국사점수 : 88
		 * 국어점수 : 85
		 * 수학점수 : 85
		 * 영어점수 : 75
		 * 네 과목의 합계(정수)와 평균(실수)를 출력하세요 
		 * 333 
		 * 83.25
		 */
		int kor = 85;
		int mat = 85;
		int eng = 75;
		int his = 88;
		
		int sum = kor + mat + eng + his;
		double avg = sum / (double)4;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
}
