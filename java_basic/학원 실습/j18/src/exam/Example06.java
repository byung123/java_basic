package exam;

public class Example06 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		System.out.println(sb);
		
		//문자열 추가
		System.out.println(sb.append("bbb"));
		System.out.println(sb.append("손경태"));
		
		//문자열 삽입
		System.out.println(sb.insert(2, "김갑룡"));
		
		//삭제
		System.out.println(sb.delete(3,  sb.length()));
		
		//문자열 뒤집기
		System.out.println(sb.reverse());
		
	}
}
