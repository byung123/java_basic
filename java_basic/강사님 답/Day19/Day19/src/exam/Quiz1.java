package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 숫자 6개를 입력받아 이를 오름차순으로 정렬하는 
		 * 프로그램을 작성하세요 
		 * 단) 숫자는 중복하지 않습니다 
		 * 
		 * 입력 >> 5 5 2 3 4 1
		 * 출력 >> 1 2 3 4 5
		 * 
		 * HashSet을 이용해봐요 
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i = 0; i < 6; i++) {
			System.out.println("입력 >> ");
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		for(Integer item : list) {
			hashSet.add(item);
		}
		System.out.println(hashSet);
	}
}
