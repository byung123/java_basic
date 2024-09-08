package exam;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 배열(array)
		 * - 배열이란 같은 자료형의 변수를 저장하여 여러 데이터를 저장할 수 있는 공간
		 * - 배열은 여러 개의 데이터를 저장하기 위해 별도의 공간이 필요하다
		 * - 배열을 선언만 하고 값으,ㄹ 부여하지 않을 경우 시스템은 배열 변수를 만들 때
		 *   null(공간이 존재하지 않음) 키워드를 부여함
		 * - 배열을 선언한 후에는 가뵤을 저장할 수 있는 공간을 만들어야 한다
		 * - 배열은 데이터를 저장하기 위한 공간이 필요하므로 메모리에 필요한 만큼 공간을 만들도록 선언해야 함!!
		 * 
		 * 형식)
		 * 자료형[] 변수이름; => int[] arr;
		 * 자료형 변수이름[]; => int arr[];
		 */
		
		//배열을 선언만 하고 공간을 생성하지 않았을 때
		int arr1[] = null; //참조할 배열 객체가 없을 경우 null로 초기화 가능
		System.out.println(arr1);
		
		int arr2[] = null;
		System.out.println(arr2);
//		arr2[0] = 10; //에러가 남 -> 참조할 객체가 없는 변수 즉, null값을 가진 참조 타입 변수를 사용하면 발생
	}
}
