package tv;

public class TVMain {
	public static void main(String[] args) {
		IPTelevision iptv = new IPTelevision("LG");

		//상속된 필드 생성
		System.out.println("모델 : " + iptv.model);

		//상속된 메소드 호출
		iptv.powerOn();
		iptv.changeChannel(5);

		//자식 객체의 메소드 호출
		iptv.settopBoxOn();
		iptv.changeContents("영화");

		//부모와 자식 메소드를 자유롭게 호출
		iptv.changeSound(20);
		iptv.settopBoxOff();
		iptv.powerOff();
	}
}
