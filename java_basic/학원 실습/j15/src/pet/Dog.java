package pet;

public class Dog extends Pet{

	@Override
	public void walk() { // 부모클래스에서 선언된 추상메소드를 자식클래스에서 무조건 몸통부분(구현부)을 만들어줘야함
		System.out.println("Dog walk");
	}

	@Override
	public void eat() {
		System.out.println("Dog eat");
	}

}
