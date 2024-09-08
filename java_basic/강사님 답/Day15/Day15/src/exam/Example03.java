package exam;

class Animal{
	public void sound() {
		System.out.println("동물이 소리를 냅니다.");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Bird extends Animal{
	@Override
	public void sound() {
		System.out.println("짹짹");
	}
}

public class Example03 {
	/*
	 * 다형성(Polymorphism)
	 * - 객체지향프로그래밍의 대표적인 특징 중 하나로, 하나의 타입으로
	 * 다양한 객체를 사용할 수 있는 것을 의미 
	 * - 자바에서는 이러한 다형성을 부모 클래스 타입의 참조 변수로 
	 * 자식 클래스 타입의 인스턴스를 참조할 수 있도록 구현하고 있다
	 * 
	 * 다형성의 장점 
	 * - 코드의 중복을 줄일 수 있다.
	 */
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		Animal animal3 = new Bird();
		animal1.sound();
		animal2.sound();
		animal3.sound();
	}
}
