package exam;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double srt);
	abstract protected String getSrtString();
	abstract protected String getDestString();
	protected double ratin;
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrtString() + "을 "
				+ getDestString() + "로 바꿉니다");
		System.out.println(getSrtString() +"을 입력하세요 >> ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("반환결과 : " + res + getDestString() + " 입니다");
	}
}

public class quiz {
	public static void main(String[] args) {
		/*
		 * Converter클래스를 상속받아 원화를 달러로 변환하는
		 * Won2Dollar 클래스를 작성하세요
		 * 
		 * 실행결과
		 * 원을 달러로 바꿉니다.
		 * 원을 입력하세요 >>
		 * 24000
		 * 변환결과 : 20.0 달러입니다
		 */
		
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
	
}

//내가 쓴 답
class Won2Dollar extends Converter {
	
	public Won2Dollar(double ratin) {
		this.ratin = ratin;
	}

	@Override
	protected double convert(double srt) {
		ratin = srt / 1200;
		return ratin;
	}

	@Override
	protected String getSrtString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}
}

//강사님 답
// 나랑 거의 같음 1200을 그냥 달러로

