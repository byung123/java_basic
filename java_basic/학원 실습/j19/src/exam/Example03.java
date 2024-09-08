package exam;

import java.util.LinkedList;

public class Example03 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		list.addFirst(100);  //리스트의 가장 앞에 데이터를 추가
		list.addLast(200);   //리스트의 가장 뒤에 데이터를 추가
		System.out.println(list);
		
		list.add(1, 150);   //리스트 첫번째 방에 150 데이터 추가
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.set(4, 2000);  //리스트 4번째 방의 값을 2000으로 변경
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}
}
