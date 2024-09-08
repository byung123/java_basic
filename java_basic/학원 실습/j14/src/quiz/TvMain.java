package quiz;

class TV{
	private int size;
	
	public TV(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}

public class TvMain {
	public static void main(String[] args) {
		/*
		 * 다음 TV클래스가 있고
		 * main() 메소드의 실행결과를 참고하여 TV 클래스를 상속받은 ColorTV 클래스를 작성하시오
		 * 
		 * 실행결과)
		 * 32인치 검정색
		 */
		
		ColorTV myTV = new ColorTV(32, "검정색");
		myTV.printProperty();
	}
}

//내가 쓴 답 -> private size를 어떻게 인수로 받는지 자꾸 오류가 떠서 못품
//class ColorTV extends TV {
//	
//	String color;
//	
//	public ColorTV(int size, String color) {
//		setSize(size);
//		this.size = size;
//		this.color = color;
//	}
//	
//	void printProperty() {
//		System.out.println(getSize() + "인치 " + color);
//	}
//}

//강사님 답
class ColorTV extends TV{
	
	private String color;
	
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ColorTV(int size, String color) {
		super(size);
		this.color = color;
	}
	
	void printProperty() {
		System.out.println(this.getSize() + "인치 " + getColor());
	}
}

//객체와 클래스에 대한 설명으로 틀린 것은?
//1. new 연산자로 클래스의 생성자를 호출하여 객체가 생성된다
//2. 하나의 클래스로 하나의 객체(인스턴스)만 생성이 가능함
//3. 클래스는 객체를 생성하기 위한 설계도이다.
//4. 클래스로 메소드를 호출할 수 있다.
// 답 2번 -> 여러개 만들 수 있다 (붕어빵 클로 붕어빵 여러개 만들 수 있다)


