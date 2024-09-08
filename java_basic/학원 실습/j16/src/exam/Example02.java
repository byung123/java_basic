package exam;

interface Test1{
	void test1();
}

interface Test2 {
	void test2();
}

interface Test3 extends Test1, Test2 {
	void test3();
}

class TestCle1 implements Test1 {

	@Override
	public void test1() {
		
	}
}

class TestCle2 implements Test1, Test2 {

	@Override
	public void test2() {
		
	}

	@Override
	public void test1() {
		
	}
	
}

class TestCle3 implements Test1, Test2, Test3 {

	@Override
	public void test3() {
		
	}

	@Override
	public void test2() {
		
	}

	@Override
	public void test1() {
		
	}
	
}

public class Example02 {
	public static void main(String[] args) {
		/*
		 * 인터페이스 상속
		 * - 인테페이스 끼리만 상속 가능함
		 * - 상속을 통해 기존 인터페이스에 새로운 규칙을 추가한 새로운 인터페이스를 만들 수 있다
		 * - 인터페이스끼리의 상속은 extends 키워드를 사용한다
		 */
	}
}
