package car;

public class CarExam {
	public static void main(String[] args) { //main은 실행하는 것??
		// Car 클래스를 이용해 인스턴스를 정의
		Car car = new Car();
		System.out.println("wheel의 개수는 " + car.wheel + "개 입니다.");
		
		// wheel개수를 4개(Car 클래스에 있음)에서 5개로 바꾸기
		car.wheel = 5;
		System.out.println("wheel의 개수는 " + car.wheel + "개 입니다.");
		
		car.ride();
		car.stop();
		
		System.out.println("----------------------");
		
		Car1 car1 = new Car1();
		
		//필드값 출력
		System.out.println("회사 : " + car1.company);
		System.out.println("모델명 : " + car1.model);
		System.out.println("색깔 : " + car1.color);
		System.out.println("최고속도 : " + car1.maxSpeed);
		System.out.println("현재속도 : " + car1.speed);
		
		//필드 값 변경
		car1.speed = 60;
		System.out.println("현재속도 : " + car1.speed);
	}
}
