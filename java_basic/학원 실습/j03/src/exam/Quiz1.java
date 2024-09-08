package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 자신의 나이(int), 이름, 학교, 거주지를 입력받아 출력받는 프로그램을 작성하시오
		 * 
		 * 출력결과
		 * 저의 나이는 24살이고, 이름은 손경태, 학교는 코리아대학 거주지는
		 * 부산시 수영구 광안동에 살고 있습니다.
		 * 
		 * 출력결과는 콘솔창에 한줄로 출력되게 하세요!!
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int age = sc.nextInt(); 
		String name = sc.next();
		String school = sc.nextLine();
		String location = sc.nextLine();
		System.out.println("저의 나이는 " + age + "이고, 이름은 " + name + 
							", 학교는 " + school + "이며 거주지는 " + location + "에 살고 있습니다.");
		
		
	    // 강사님 답
		Scanner sc1 = new Scanner(System.in);
		System.out.println("나이 >> ");
		int age1 = sc1.nextInt();
		
		System.out.println("이름 >> ");
		String name1 = sc1.next();
		
		System.out.println("학교 >> ");
        String school1 = sc1.nextLine();
		
		System.out.println("거주지 >> ");
		String location1 = sc1.nextLine();
		
		System.out.printf("저의 나이는 %d살이고," + " 이름은 %s 학교는 %s + " +
		                  "%s에 살고 있습니다.", age1, name1, school1, location1);
		
		
		
		
	}
}
