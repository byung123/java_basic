package exam;

public class Example04 {
	public static void main(String[] args) {
		char[] card = {'1','L','O','2','V','3','E'};
		
		for(int i = 0; i < card.length; i++) {
			if(card[i] >= 65 && card[i] <= 90) {
				System.out.printf("%c", card[i]);
			}
		}
		
	}
}
