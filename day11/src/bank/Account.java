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

	// 출금 금액이 1보다 작으면 안된다.
		// 출금 금액이 잔액보다 많으면 안된다.
		
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	public void deposit(double money) throws MinusException {
			if(money < 1) {
				throw new MinusException("마이너스 입니다."); // "EX100" : 코드로 다국어 지원
			}
			this.balance += money;
	}
	
	
	// 문제가 두 개 발생할 수 있다.
    public void withdraw(double money) throws MinusException, OverdrawnException {
        if(money < 1) {
            throw new MinusException("마이너스입니다.");
        }
        if(money > this.balance) {
            throw new OverdrawnException("잔액부족");
        }
        this.balance -= money;
    }
	public double select() {
		return this.balance;
	}
	
	
}
