package exam;

class Coffee {
	public void make() {
		
	}
}

public class Example07 {
	public static void main(String[] args) {
		/*
		 * 익명클래스
		 * - 이름이 없는 클래스를 의미
		 * - 클래스의 선언과 객체의 생성을 동시에 하므로 단 한번만 사용할 수 있고
		 *   고 오직 하나의 객체만을 생성할 수 있는 일회용 클래스이다
		 * - 단발성(1회용) 클래스 -> gui에서 사용
		 * 
		 * 익명클래스가 되기위한 조건
		 * - 상위클래스를 상속받거나 인터페이스를 구현해야 한다!!
		 */
		
		Coffee coffee = new Coffee() { // Coffee클래스를 상속받는 익명클래스 (선언과 함께 생성)
			@Override
			public void make() {
				System.out.println("Override Make!!");
			}	
				/*
				 * new Coffee()를 통해 생성되는 인스턴스는 Coffee 클래스가 아닌 상단에 Coffee클래스를
				 * 상속받는 익명클래스이기 때문에 Coffee클래스 안에 serve() 메소드가 선언되어 있지 않기 때문읻가
				 */
				public void serve() {
					System.out.println("serve");
				}
			};  // 여기 세미콜론 붙여주기!
			coffee.make();
//			coffee.serve();  // 상속받는 익명클래스 안에 없어서 오류가 뜸 
	}
}
//module Day16 { 이건 뭔지 못봤음
//	requires 
//}
