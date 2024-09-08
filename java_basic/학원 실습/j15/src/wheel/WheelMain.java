package wheel;

public class WheelMain {
	public static void main(String[] args) {
		Bike b = new FourWheelBike("윤기");
		b.info();
		b.ride();
//		b.addWheel();    // 부모 타입(Bike로 선언)이라 자식한테 접근할 수 없다
		
		FourWheelBike fwb = (FourWheelBike) b; // 부모 객체를 자식 타입으로 다시 변환
		fwb.addWheel();    // 이제 다시 되는 걸 확인할 수 있음
		fwb.info();
		fwb.ride();
		/*
		 * 반드시 부모 타입으로 자동 타입 변환되었던 자식 객체를 
		 * 다시 자식 타입으로 변환할 때만 객체 타입 변환을 사용할 수 있다
		 */
	}
}
