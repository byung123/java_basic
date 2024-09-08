package phone;

public class SamsungPhone implements Phone{ //인터페이스를 상속받을 때는 implements를 씀

	@Override
	public void sendCall() {
		System.out.println("따르르릉~~~~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다");
	} 
	
}
