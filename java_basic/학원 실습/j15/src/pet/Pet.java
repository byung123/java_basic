package pet;

abstract public class Pet { //추상클래스는 하나 이상의 추상메소드를 가지고 있어야 함
	//추상 메소드 선언
	abstract public void walk(); 
	abstract public void eat();
	
	public int health; //필드
	
	public void run() {
		System.out.println("run");
	}
}
