package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 중첩(if)
		 * - if문 안에 또 다른 if문을 넣을 수 있다 
		 * 
		 * 형식
		 * if(조건){
		 * 		if(조건){
		 * 			실행문...
		 * 		} else {
		 * 			실행문...
		 * 		}
		 * } else {
		 * 		실행문...
		 * }
		 */
		int score = 59;
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
		
			}
		} else if(score >= 80) {
			if(score >= 85) {
				System.out.println("B+학점");
			} else {
				System.out.println("B학점");
			}
		} else if(score >= 70) {
			if(score >= 75) {
				System.out.println("C+학점");
			} else {
				System.out.println("C학점");
			}
		} else if(score >= 60) {
			if(score >= 65) {
				System.out.println("D+학점");
			} else {
				System.out.println("D학점");
			}
		} else {
			System.out.println("F학점");
			System.out.println("자살 놉 ㅠㅠㅠㅠ");
		}
	}
}
