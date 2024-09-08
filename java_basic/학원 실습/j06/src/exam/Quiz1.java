package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 자신의 몸무게와 키를 입력하고 BMI가 저체중인지, 정상인지, 과체중인지, 비만인지
		 * 판별하는 프로그램을 작성하시오
		 * 
		 * BMI가 18.5이면 저체중
		 * BMI가 18.5 ~ 22.9 사이면 정상
		 * BMI가 23.0 ~ 24.9 사이면 과체중
		 * BMI가 25.0 이상부터는 비만
		 * BMI 공식) 몸무게(kg) / (신장(m) * 신장(m)
		 * 
		 * 몸무게와 키는 실수타입으로 입력받도록 하고
		 * cm -> m 변환하는 법
		 * 1cm = (1/100)
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		System.out.println("몸무게 입력(kg) >> ");
		float wei = sc.nextFloat();
		
		System.out.println("키 입력(cm) >> ");
		float hei = sc.nextFloat();
		
		float hei2 = (hei / 100);
		
		if(wei / (hei2 * hei2) < 18.5) {
			System.out.println("저체중");
		} else if(wei / (hei2 * hei2) >= 18.5 && wei / (hei2 * hei2) < 22.9 ) {
			System.out.println("정상");
		} else if(wei / (hei2 * hei2) >= 23.0 && wei / (hei2 * hei2) < 24.9) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		
		//강사님 답
		//대충 같음
	}
}
