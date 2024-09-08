package exam;

import java.util.ArrayList;
import java.util.List;

public class Example10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//삽입
		list.add("사과");
		list.add("딸기");
		list.add("망고");
		System.out.println(list);
		list.add("체리");
		list.add("파인애플");
		System.out.println(list);
		
		//2번째 자리에 수박을 넣음
		list.add(2, "수박");
		System.out.println(list);
		
		// 값 변경
		//4 번째 인덱스 값 변경
		list.set(4,  "파인애플");
		System.out.println(list);
		
		/*
		 * 삭제
		 * 단순히 값만 삭제하는 것이 아니라 값과 함께 위치의 공간도 삭제해야 한다. 배열에선 위치 삭제 불가능했었음
		 * - ArrayList의 데이터 삭제는 단지 데이터만 삭제하는게 아닌 값이 있던 공간까지
		 *   삭제됨, 배열의 경우 공간을 삭제할 수 없지만 ArrayList는 원하는 위치의 공간을 삭제할 수 있고
		 *   뒤에 데이터들이 앞으로 이동한다
		 */
		list.remove(1);
		System.out.println(list);
		list.remove("파인애플");
		System.out.println(list);
		
		//리스트 안에 있는 값들을 전부 삭제
		list.clear();
		System.out.println(list);
	}
}
