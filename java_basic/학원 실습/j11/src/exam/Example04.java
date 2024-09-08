package exam;

public class Example04 {
	public static void main(String[] args) {
		/*
		 * Getter와 Setter 메소드
		 * - 객체 지향 프로그램에서 객체 데이터는 객체 외부에서 직접적으로 접근하는 것을 막는다.
		 * - 객체의 데이터를 외부에서 마음대로 읽고 변경할 경우 객체의 무결성이 깨짐
		 * 
		 * Setter(메소드)
		 * - 객체의 무결성을 유지하기 위해 메소드를 통해 데이터를 변경하게 하여
		 *   검증된 값만 데이터로 저장할 수 있게 한다
		 * 
		 * - private 필드의 값을 대입하는 방법으로는 setter 메소드 사용
		 * - 반대로 private 필드의 값을 호출하려면 getter 메소드 사용     
		 */
		
		Book book = new Book();
//		book.title = "손경태"; // 오류가 떠서 안됨 Book 클래스의 필드들을 private(같은 클래스 내에서만 접근 가능)으로 설정해놨기 떄문
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.setTitle("자바의 정석");
		System.out.println(book1.getTitle());
		book1.setAuthor("남궁성");
		System.out.println(book1.getAuthor());
		
		System.out.println("---------------------");
		
		book2.setTitle("열혈 C프로그래밍");
		System.out.println(book2.getTitle());
		book2.setAuthor("윤성우");
		System.out.println(book2.getAuthor());
		
	}
}
