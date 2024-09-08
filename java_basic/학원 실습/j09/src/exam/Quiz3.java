package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 숫자 한 개를 입력받아 입력받은 수만큼 배열 크기를 지정하여
		 * 3의 배수를 저장하는 배열을 만들고 출력하세요
		 * 
		 * 출력 예)
		 * 5를 입력받았다면
		 * 3  6  9  12  15
		 * 9를 입력받았다면
		 * 3  6  9  12  15  18  21  24  27
		 */
		
		//내가 쓴 답
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 지정해주세요 >> ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 3*(i + 1);
			System.out.print(arr[i] + "  ");
		}
		
		//강사님 답
		//나와 같음 System.out.printf("%d\t", arr[i])로 표현하심 ->\t 히면 tab 만큼 띠어짐
		
	}
}
