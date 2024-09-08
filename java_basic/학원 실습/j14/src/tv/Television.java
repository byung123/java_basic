package tv;

public class Television {
	String model;
	int channel;
	int volume;

	void powerOn() {
	System.out.println("TV를 킵니다");
	}

	void powerOff() {
	System.out.println("TV를 끕니다");
	}

	void changeChannel(int channel) {
	this.channel = channel;
	System.out.println("채널을 " + channel + "번으로 지정합니다");
	}

	void changeSound(int volume) {
	this.volume = volume;
	System.out.println("볼륨을 " +volume + "으로 지정합니다");
	}
}

class IPTelevision extends Television {

	String contents;

	//Television으로부터 상속받은 필드를 그대로 사용할 수 있다
	public IPTelevision(String model) {
	this.model = model;
	}

	void settopBoxOn() {
		System.out.println("셋톱박스를 킵니다");
	}
	
	void settopBoxOff() {
	System.out.println("셋톱박스를 끕니다");
	}
	
	void changeContents(String contents) {
	this.contents = contents;
	System.out.println(contents + "(으)로 전환됩니다");
	}
	
}
	
	
