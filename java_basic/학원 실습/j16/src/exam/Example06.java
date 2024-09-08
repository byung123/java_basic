package exam;

class OuterClass {
	void method() {
		class LocalInner { //메소드 내에서 지역클래스
			int a = 5;
		}
		LocalInner li = new LocalInner(); //메소드 안에서 객체 생성 가능
		System.out.println(li.a);
	}
}

public class Example06 {
	public static void main(String[] args) {
		/*
		 * 지역클래스
		 * - 외부클래스의 메소드 내에서 선언되어 사용하는 클래스
		 * - 메소드 내에 선언되기 때문에 메소드 내에서만 사용할 수 있다
		 */
		
		OuterClass out = new OuterClass();
		out.method();  // 잘나옴
	}
}
