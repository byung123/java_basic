package exam;

public class Example06 {
	public static void main(String[] args) {
		/*
		 * if ~ else if
		 * 
		 * 형식)
		 * if(조건식){
		 * 		실행문...
		 * } else if(조건식) {
		 * 		실행문...
		 * } else if(조건식) {
		 * 		실행문...
		 * } else {
		 * 		실행문..
		 * }
		 */
		// 두 과목의 평균 점수를 산출해서 70점 이상이면 합격
		// 70점 미만이거나 한 과목이 50점 미만이면 불합격
		
		int kor = 80; 
		int eng = 100;
		double avg = (kor + eng) / 2.0;
		
		if(kor < 50 || eng < 50) {
			System.out.println("한 과목이 50점 미만이므로");
			System.out.println("불합격(과락) 입니다.");
		} else if(avg >= 70) {
			System.out.println("두 과목의 평균 점수가 70점 이상이므로");
			System.out.println("합격");
		} else {
			System.out.println("두 과목의 평균 점수가 70점 미만이므로");
			System.out.println("불합격");
		}
	}
}
