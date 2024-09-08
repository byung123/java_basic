package phone;

public interface Phone {
	final int TIMEOUT = 10000; //상수필드 선언
	void sendCall(); //추상메소드 선언 (public abstract 생략 가능)
	void receiveCall();
	
	
	/*
	 * Default Method
	 * - 인터페이스에는 기능에 대한 선언만 가능하다 그러므로 실제 코드를 구현한 로직은 
	 *   포함할 수 없는데 자바8에서 어떠한 룰을 꺠는 기능이 나옴
	 * - 메소드 선언시 default를 명시하게 되면 인터페이스 내부에서도 로직이 포함된 메소드를 선언할 수 있다
	 */
	default void printLogo() { //default를 명시하면 몸통(구현부를 만들수 있다?)
		System.out.println("** phone **");
	}
}
