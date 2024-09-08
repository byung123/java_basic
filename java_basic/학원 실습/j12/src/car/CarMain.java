package car;

public class CarMain {
	public static void main(String[] args) {
//		Car car1 = new C //하고 ctrl + spacebar 누르면 내가 아까 만든 3개의 메소드 형식이 나오는걸 확인할 수 있음
		Car car1 = new Car();
		System.out.println("회사명 : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("SMS", "검정");
		System.out.println("회사명 : " + car2.company);
		System.out.println("모델명 : " + car2.model);
		System.out.println("색상 : " + car2.color);
		System.out.println();
		
		Car car3 = new Car("SMS", "검정", 200);
		System.out.println("회사명 : " + car3.company);
		System.out.println("모델명 : " + car3.model);
		System.out.println("색상 : " + car3.color);
		System.out.println("최고속도 : " + car3.maxSpeed);
		System.out.println();
		
//		System.out.println(car1.model); -> 이건 그냥 null값으로 나오네
	}
}
