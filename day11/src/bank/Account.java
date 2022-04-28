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

	public String getAccNo() {
		return accNo;
	}

	public double getBalance() {
		return balance;
	}

	// ��� �ݾ��� 1���� ������ �ȵȴ�.
		// ��� �ݾ��� �ܾ׺��� ������ �ȵȴ�.
		
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	public void deposit(double money) throws MinusException {
			if(money < 1) {
				throw new MinusException("���̳ʽ� �Դϴ�."); // "EX100" : �ڵ�� �ٱ��� ����
			}
			this.balance += money;
	}
	
	
	// ������ �� �� �߻��� �� �ִ�.
    public void withdraw(double money) throws MinusException, OverdrawnException {
        if(money < 1) {
            throw new MinusException("���̳ʽ��Դϴ�.");
        }
        if(money > this.balance) {
            throw new OverdrawnException("�ܾ׺���");
        }
        this.balance -= money;
    }
	public double select() {
		return this.balance;
	}
	
	
}
