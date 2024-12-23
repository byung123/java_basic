package exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example09 {
	public static void main(String[] args) {
		/*
		 * List
		 * - List는 배열과 유사한 자료구조로 중복이 허용되면서 저장 순서가 유지되는 구조
		 * - 배열과의 차이점은 크기에 제한이 없고 삽입, 삭제, 수정이 용이함
		 * - List 컬렉션은 List 인터페이스를 생성하여 기능을 정의하고 하위 클래스에 상속해 그 기능을 구현하도록 한다
		 * 
		 * List<Obj> list = new ArrayList<Obj>();
		 * List<Obj> list = new ArrayList<>();
		 * 
		 * Obj : 리스트에 저장할 데이터 유형
		 * ArrayList : 클래스
		 */
		List<String> list1 = new ArrayList<String>();
		list1.add("사과");
		list1.add("딸기");
		list1.add("바나나");
//		list1.add(10); //문자열을 넣어야 하는데 숫자를 넣으면 오류가 뜸
		System.out.println(list1);
		
		/*
		 * Int : 정수형 변수를 선언할 때 사용
		 * Integer : 정수형 데이터를 객체화 시킬 때 사용
		 */
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(2300);
		System.out.println(list2);
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("사과");
		list3.add("딸기");
		list3.add("바나나");
		System.out.println(list3);
		
		///////////////////////////
		/*
		 * List<> list = new ArrayList<>();
		 * SrrayList<> list = new ArrayList<>();
		 * 
		 * List는 인터페이스이고 ArrayList는 이 List를 구현한 클래스이다.
		 * 그러므로 List로 선언을 한 경우 인스턴스를 ArrayList로 받을 수 잇고 LinkedList로도 받을 수 있다.
		 * 
		 * ArrayList로 선언한 경우 ArrayList의 인스턴스를 만들어야 하므로
		 * ArrayList로 받아야 한다
		 */
		List<Integer> linkedList = new ArrayList<Integer>();
		linkedList = new LinkedList<Integer>();
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList = new LinkedList();
	}
}
