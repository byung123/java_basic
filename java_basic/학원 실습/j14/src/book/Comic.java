package book;

public class Comic extends Book{
	
	public boolean isColor;
	
	public Comic(String title, String author) {
		super(title, author);
		this.isColor = isColor;
	}

//	void info_title() {      // 오류 발생 -> final을 했기 떄문에 재정의 못함
//		
//	}
	
	void info_autjor() {       // final로 만들지 않은건 이렇게 재정의 가능
		System.out.println("이 만화책의 저자는 " + author + "입니다.");
	}
	
	void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다");
		} else {
			System.out.println("이 만화책은 흑백입니다");
		}
	}
}
