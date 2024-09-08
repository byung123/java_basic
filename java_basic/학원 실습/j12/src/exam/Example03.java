package exam;

import java.util.Scanner;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 객체배열
		 * - 자바에서는 기본 타입 데이터뿐 아니라, 객체를 원소로 하는
		 *   객체 배열도 만들 수 있다
		 * - 자바의 객체 배열은 객체에 대한 레퍼런스를 원소로 갖는 배열임
		 */
		Book[] book = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < book.length; i++) {
			System.out.println("제목 >> ");
			String title = sc.nextLine();
			System.out.println("저자 >> ");
			String author = sc.nextLine();
			book[i] = new Book(title,author);
		}
		
		for(int i = 0; i < book.length; i++) {
			System.out.println("(" + book[i].getTitle() + ", " + book[i].getAuthor()
								+ ")");
		}
		
	}
}
