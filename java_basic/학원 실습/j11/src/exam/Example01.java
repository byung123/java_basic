package exam;

public class Example01 {
	
	public static void printHello() {
		System.out.println("Hello Java");
	}
	
	/*
	 * 메소드(Method)
	 * - 함수는 독립적으로 사용할 수 있지만, 메소드는 해당 객체?에 종속되어 있는것이 차이점
	 * - 클래스 안에서 특정 기능을 수행하기 위해 코드들을 따로 하나의 블록으로 묶어놓은 것
	 * - 메소드를 사용하면 같은 내용의 코드를 반복적으로 사용하는 것을 피할 수 있다.
	 * 
	 * 즉) 반복되는 문장들을 묶어서 처리하면 필요할 때마다 제 사용이 가능하고
	 *    중복코드를 제거할 수 있다
	 *    
	 * 형식
	 * 접근제한자 반환타입 메소드이름() {
	 * 		실행코드...
	 * 		return 변수 혹은 값 (리턴은 있을 수도 있고 없을 수도 있다)
	 * }
	 * 
	 * 접근제한자 : public, protected, private, default(아무것도 명시하지 않았을 때)
	 * 
	 * public : 모든 패키지, 모든 클래스에서 접근이 가능하다
	 * protected : 같은 패키지에서만 접근을 허용하고 다른 패키지에서 접근하려면
	 * 			   해당 클래스를 상속받아야 한다
	 * private : 같은 클래스 내에서만 접근 허용
	 * default : 같은 클래스 내에서만 접근 가능
	 */
	public static void main(String[] args) {
		printHello();
	}
}
