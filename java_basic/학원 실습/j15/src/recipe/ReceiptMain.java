package recipe;

public class ReceiptMain {
	public static void main(String[] args) {
//		Receipt receipt = new Receipt; // 추상클래스는 직접 객체를 생성할 수 없기 때문에 오류가 뜸
		
		PastaReceipt pr = new PastaReceipt("최연식");
		pr.info();
		pr.makeSource();
		
		System.out.println();
				StakeReceipt sr = new StakeReceipt("이연복");
		
		sr.info();
		sr.grillStake();
		
	}
}
