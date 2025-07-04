package ex02_KTH;

public class Account {
	int balance;
	
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}


	void withdraw(int withdraw) throws NumberFormatException{
		if(balance < withdraw) {
			throw new NumberFormatException();
		}
	}

	void deposit(int deposit) {
		balance += deposit;
		System.out.println("입금된 금액은 " + deposit + "원 입니다 현재잔고는 " + balance + "원 입니다");
	}
}
