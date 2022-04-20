package bank;

public class Account {

	private String accNo;
	private double balance;
	
	public Account() {
		
	}

	public Account(String accNo) {
		this.accNo = accNo;
	}

	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	

	public void deposit(double money) {
		if(money < 1) {
			System.out.println("입금 금액 오류 \n");
			return;
		}
	    this.balance += money;
	}
	
	public void withdraw(double money) {
		if(money < 1) {
			System.out.println("입금 금액 오류");
			return;
		}if(this.balance < money) {
			System.out.println("잔액 부족 오류");
			return;
		}
		this.balance -= money;
	}

	public String getAccNo() {
		return accNo;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	
}
