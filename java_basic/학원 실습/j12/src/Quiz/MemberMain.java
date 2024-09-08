package Quiz;

public class MemberMain {
	public static void main(String[] args) {
		/*
		 * 회원(Member) 클래스는 회원 아이디를 나타내는 id(문자열)과
		 * 회원 이름을 나타내는 name(문자열), 회원의 point를 나타내는
		 * point(정수) 필드를 가지고 있다
		 * 
		 * 메소드는 각 회원의 필드의 값들을 변경 혹은 입력하는 set 메소드와 이를
		 * 반환하는 get 메소드를 가지고 있다
		 * 
		 * 모든 필드는 외부에서 직접 접근하여 값을 변경하거나 얻지 못하도록
		 * private으로 접근 제한을 막으세요
		 * 
		 * 실행결과)
		 * 아이디 : eeee
		 * 이름 : 손경태
		 * 포인트 : 20000
		 * 
		 * 아이디 : rrrr
		 * 이름 : 손경태
		 * 포인트 : 10000
		 */
		
		Member mem = new Member();
		
		mem.setId("eeee");
		mem.setName("손경태");
		mem.setPoint(20000);
		
		System.out.println("아이디 : " + mem.getId());
		System.out.println("이름 : " + mem.getName());
		System.out.println("포인트 : " + mem.getPoint());
	}
}

//내가 쓴 답 -> 문제가 뭘 구현하라는 건지 명확하지가 않아서 그냥 이렇게만 작성함.(입력받으란 말도 없고, 그냥 class가 익숙해지라고 주신 문제라고 하심)

class Member {
	private String id;
	private String name;
	private int point;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = null;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = null;
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = 0;
		this.point = point;
	}
	
}

//강사님 답
//멤버 클래스 안에 Member(id, name, point)메소드를 만드심 this.id = id 등등등 적으시고
// public void info() { System.oput,prinln("아이디 : " + id); System("이루ㅡㅁ : " + this.name); 등등 만드심
//main에서 그냥 바로 member1.info();로 아이디 이름 포인트 출력하게 만드심
//이 문제는 그냥 내 방식대로 해도 되는듯 -> 좀더 간편하게 info 만드는 건 좋아보임


