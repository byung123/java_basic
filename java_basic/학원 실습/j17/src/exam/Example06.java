package exam;

class Account {
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance = balance + money;
	}
	
	public void withdraw(int money) throws BalanceException {
		System.out.println("현재잔고 : " + balance);
		if(balance < money) {
			throw new BalanceException("잔고가 부족합니다");
		}
		balance = balance - money;
	}
}

class BalanceException extends Exception {     // Exception은 자바 이클립스에서 제공하는 기본 클래스라 이미 있는 것임(정의 안해도됨)
	public BalanceException(String message) {
		super(message);
	}
}

public class Example06 {
	public static void main(String[] args) {
		/*
		 * 사용자 정의 예외
		 * - 프로그램을 개발하다 보면 자바 표준 API에 제공하는 예외 클래스 만으로는
		 *   다양한 종루의 예외를 표현 할 수 없다
		 * - 개발자가 직접 정의해서 제작한다
		 */
		
		Account account = new Account();
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
//		account.withdraw(15000);
//		System.out.println("예금액 : " + account.getBalance());   //이러면 예금액이 -5000이 된다 -> 말이되지 않음 -> 예외처리 class를 만들자
		
		try {
			account.withdraw(15000);
		} catch(Exception e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}
