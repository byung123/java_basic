package pet;

abstract public class Pet {
	// 추상메소드 선언
	abstract public void walk();
	abstract public void eat();
	
	public int health; // 필드 
	
	public void run()
	{
		System.out.println("run");
	}
}
