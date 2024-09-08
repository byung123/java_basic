package phone;

public class SamsungPhone implements Phone {

	@Override
	public void sendCall() {
		System.out.println("따르르릉~~~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

}
