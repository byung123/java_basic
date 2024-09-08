package computer;

public class ComputerMain {
	public static void main(String[] args) {
		Samsung s = new Samsung();
		s.powerOn(); //Samsung 클래스에서 오버라이딩 메소드
		s.powerOff(); // Compurter 클래스의 메소드가 호출
		
		System.out.println("------------------------");
		
		Computer c = new Computer();
		c.powerOn();
		c.powerOff();
		
		/*
		 * 메소드 오버라이딩
		 * - 부모 클래스를 상속받은 자식클래스는 부모클래스의 필드와 메소드를
		 *   가져와서 그대로로 사용할 수 잇다
		 * - 하지만 필요하다면 자식클래스가 상속받은 메소드의 내용을 변경해서 사용활 수 있다
		 * 
		 * 즉) 상속받은 메소드를 변경해서 다시 두성하는 것(메소드 객체틀?)
		 */
	}
}
