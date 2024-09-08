package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 아이디와 비밀번호를 입력받아 아이디가 admin 비밀번호가 1234로
		 * 입력받으면 로그인 성공
		 * 
		 * 만약 아이디를 잘못 입력하였으면 "아이디를 잘못 입력하였습니다" 출력
		 *     비밀번호를 잘못 입력하였으면 "비밀번호를 잘못 입력하셨습니다" 출력
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 >> ");
		String id = sc.next();
		
		System.out.println("비밀번호를 입력하세요 >> ");
		int pwd = sc.nextInt();
		
		if(id.equals("admin") && pwd == 1234) {
			System.out.println("로그인 성공");	
		} else if(id.equals("admin") && pwd != 1234) {
			System.out.println("비밀번호를 잘못 입력하셨습니다");
		} else {
			System.out.println("아이디를 잘못 입력하셨습니다");
		}
		
		//강사님 답
		Scanner sc1 = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 >> ");
		String id1 = sc1.nextLine();
		
		System.out.println("비밀번호를 입력하세요 >> ");
		String pwd1 = sc1.nextLine();
		
		if(id1.equals("admin") && pwd1.equals("1234")) {
			System.out.println("로그인 성공");	
		} else if(!id1.equals("admin")) {
			System.out.println("아이디를 잘못 입력하셨습니다");
		} else {
			System.out.println("비밀번호를 잘못 입력하셨습니다");
		}
	}
}
