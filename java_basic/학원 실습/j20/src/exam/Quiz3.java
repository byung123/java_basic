package exam;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 1 ~ 100까지 8을 포함하지 않는 수는 몇 개인지 출력하고
		 * 그 해당 숫자를 출력하세요.
		 */
		
		//내가 쓴 답 -> 배열 틀린듯
		int count = 0;
		int[] num = null;
		
		for(int i = 1; i < 101; i++) {
			if(i <= 10) {
				if(i != 8) {
					count++;
					num[i] = i;
				}
			} else {
				if((int)(i / 10) != 8) {
					count++;
					num[i] = i;
				} else if(i % 10 != 8) {
					count++;
					num[i] = i;
				}
			}
		}
		System.out.println("개수 : " + count);
		System.out.println("해당 숫자 : " + num);
		
		//강사님 답
		int count1 = 0;
		String str = "";
		for(int i = 1; i <= 100; i++) {
			str = String.valueOf(i);
			if(!str.contains("8")) {
				System.out.printf("%s ", str);
				count1++;
			}
		}
		System.out.println();
		System.out.println("8을 포함하지 않는 수의 개수 : " + count1);
	}
}
