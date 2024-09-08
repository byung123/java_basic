package exam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 숫자 6개를 입력받아 이를 오름차순으로 정렬하는 프로그램을 작성하시오
		 * 단) 숫자는 중복하지 않습니다
		 * 
		 * 입력 >> 5 5 2 3 4 1
		 * 출력 >> 1 2 3 4 5
		 * 
		 * HashSet을 이용하세요
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> hash = new HashSet<Integer>();
		System.out.println("입력 >> ");
		for(int i = 0; i < 6; i++) {
			hash.add(sc.nextInt());
		} 
		
		List<Integer> list = new ArrayList<Integer>(hash);
		Collections.sort(list);

		System.out.println("출력 >> " + list);
		
		//강사님 답
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		System.out.println("입력 >> ");
		for(int i = 0; i < 6; i++) {
			list1.add(sc.nextInt());
		}
		
		Collections.sort(list1);
		for(Integer item : list1) {
			hashSet.add(item);
		}
		System.out.println(hashSet);
	}
}
