package quiz;

public class TvMain {
	public static void main(String[] args) {
		/*
		 * 다음 main 메소드를 실행하였을 때 다음과 같이 출력하는 Tv 클래스를 작성하시오
		 * 
		 * LG 에서 만든 2017년형 32인치 TV
		 */
		
		Tv1 tv = new Tv1("LG", 2017, 32);
		
		tv.show();
		
		
	}
}

//내가 쓴 답 -> 문자열과 정수와 같이 서로 다른 타입을 가진 요소를 한 배열로 묶는 방법을 모르겠음 

//class Tv {
//	String company;
//	int year;
//	int size;
//	String tele[] = new [3]; 
//	
//	public Tv(String com, int year, int size) {
//		company = com;
//		this.year = year;
//		this.size = size;
//	}
//	
//}

//강사님 답
class Tv1 {
	public String company;
	public int month;
	public int inch;
	
	public Tv1(String company, int month, int inch) {
		this.company = company;
		this.month = month;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(this.company + "에서 만든 " + this.month + "년형 " + this.inch + "인치 TV");
	}
	
	
}


