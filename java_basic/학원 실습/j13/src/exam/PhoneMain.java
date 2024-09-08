package exam;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}

public class PhoneMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phone[] phone = null; 
		
		
		while(true) {
			System.out.println("1.입력|2.검색|3.프로그램 종료");
			System.out.println("메뉴를 선택해 주세요 >> ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("인원수 >> ");
				int count = sc.nextInt();
				phone = new Phone[count];
				
				for(int i = 0; i < phone.length; i++) {
					System.out.println("이름과 전화번호(이름과 번호 입력) >> ");
					String name = sc.next();
					String phonenumber = sc.next();
					phone[i] = new Phone(name, phonenumber);
				}
			} else if(choice == 2) {
				System.out.println("검색할 이름 >> ");
				String search_name = sc.next();
				boolean found = false;
				
				for(int i = 0; i < phone.length; i++) {
					if(phone[i].getName().equals(search_name)) {
						System.out.println(search_name + "의 번호는 " + phone[i].getTel() + "입니다.");
						found = true;
						break;
					}
				}
				if(!found) {
					System.out.println(search_name + " 이름은 없습니다.");
				}
			} else if(choice == 3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
