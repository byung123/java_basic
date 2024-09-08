package exam;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 변수(Variable) 
		 * - 변수란 어떤한 값을 저장하고자 할 때 사용하는 메모리 공간
		 * - 변수는 생성하는 즉시 어떠한 값을 넣어줘야 한다(초기화)
		 * - 변수에는 다양한 자료형을 담을 수 있다!
		 * (숫자, 문자, 문자열, boolean 등)
		 * 
		 * 형식)
		 * [데이터타입] [변수명] = [저장할 값]
		 * 
		 * 변수명 생성 규칙 
		 * - 영문 문자와 숫자를 사용할 수 있다 
		 * - 변수는 대소문자를 구분한다 
		 * - 변수명 길이에는 제한이 없다 
		 * - 예약어는 변수명으로 사용할 수 없다(if, else, for 등등) 
		 * * 예약어란
		 *   프로그래밍 언어에서 이미 문법적인 용도로 사용되고 
		 *   있는것들 !! 
		 * - 첫 번째 글자는 문자 $,_ 이어야 하고 숫자로 시작할 수 없다 
		 * - 변수의 의미를 쉽게 파악할 수 있도록 구체적으로 
		 * 명명해주는게 좋다 !! 
		 * 
		 * 변수명 표기법
		 * - 카멜 표기법, 파스칼 표기법, 헝가리안 표기법, 팟홀 표기법
		 * 
		 * 카멜 표기법(Camel Case)
		 * 예) String studentName
		 * - 각 단어의 첫문자를 대문자로 표기하고 맨 처음 문자는
		 * 소문자로 표기 
		 * 
		 * 파스칼 표기법(Pascal Case)
		 * 예) String CarNumberName
		 * - 카멜표기법과 흡사하지만 맨 처음 오는 글자도 대문자로 
		 * 표기!! 
		 * 
		 * 헝가리안 표기법(Hungarian Notation)
		 * 예) String strCarNumber
		 * 	   int intNum
		 * - 변수명 앞에 데이터타입을 표기 
		 * 
		 * 팟홀 표기법(Pothole case)
		 * 예) String car_number
		 * - 단어 사이에 언더바를 넣어서 변수명을 작성하는 방법
		 * 
		 */
		
		int a = 10; System.out.println(a);
		int a1 = 10; System.out.println(a1);
		int A1 = 200; System.out.println(A1);
		int A = 20; System.out.println(A);
		//int 1a = 100;
		//int $a = 20; int %a = 200;
		int $a = 20; System.out.println($a);
		int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa = 2000;
		System.out.println(aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa);
	}
}
