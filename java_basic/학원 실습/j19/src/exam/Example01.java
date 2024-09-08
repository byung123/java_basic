package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 랜덤 함수를 이용해 10개의 수를 추출하여(1~30까지 랜덤 숫자 지정)
		 * list에 저장한 후 지정된 값들 중 최대값과 최소값을 구하는 코드를 작성하세요
		 */
		
		//내가 쓴 답
		List<Integer> list = new ArrayList<Integer>(); 
		int temp = 0;
		
		for(int i = 0; i < 10; i++) {
			int num = (int)(Math.random()*30 + 1);
			list.add(num);
		}
		System.out.println("리스트 항목 : " + list);
		
		for(int i = 0; i < 10; i++) {
			if(temp < list.get(i)) {
				temp = list.get(i);
			}
		} System.out.println("최대값 : " + temp);
		temp = 100;
		
		for(int i = 0; i < 10; i++) {
			if(temp > list.get(i)) {
				temp = list.get(i);
			}
		} System.out.println("최소값 : " + temp);
		
		//강사님 답
		List<Integer> list2 = new ArrayList<Integer>(); 
		
		for(int i = 0; i < 10; i++) {
			int num = (int)(Math.random()*30 + 1);
			list2.add(num);
		}
		System.out.println(list2);
		
		int max = Collections.max(list2);
		int min = Collections.min(list2);
		System.out.println("최개값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
