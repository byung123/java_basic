package exam;

public class Example05 {
	public static void main(String[] args) {
		//for문으로 무한루프
		for(int i = 1;  ; i++) {
			System.out.println(i);
			if(i == 10) { //조건을 걸면 멈춤
				break;
			}
		}
	}
}
