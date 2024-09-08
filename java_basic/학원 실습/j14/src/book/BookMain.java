package book;

public class BookMain {
	public static void main(String[] args) {
		Comic comicbook = new Comic("주머니 괴물", "미상", title) {
			comicbook.info_title();
			comicbook.info_author();
			comicbook.info_color();
			
			comicbook.title = "자바의 정석"; //final이었기 때문에 수정 못함
		}
	}
}
