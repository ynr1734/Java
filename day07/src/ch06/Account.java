package ch06;

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
	public void deposit(double money) {
		this.balance += money;
	}
	
	// ��� �ݾ��� 1���� ������ �ȵȴ�.
	// ��� �ݾ��� �ܾ׺��� ������ �ȵȴ�.
	
	
	public void withdraw(double money) {
		if(money < 1) {
			System.out.println("�Ա� �ݾ� ����");
			return;
		}if(this.balance < money) {
			System.out.println("�ܾ� ���� ����");
			return;
		}
		this.balance -= money;
	}
	public double select() {
		return this.balance;
	}
	
	
}
