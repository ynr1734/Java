package ch06;

public class BankApp {

	public static void main(String[] args) {
		Account acc1 = new Account("1111-2222");
		System.out.println(acc1.toString());
		
		acc1.deposit(10000);
		System.out.println(acc1.toString());
	
		
		acc1.withdraw(5000);
		System.out.println(acc1);
	
		
		String accNo = acc1.getAccNo();
		double balance = acc1.getBalance();
		System.out.printf("∞Ë¡¬¡§∫∏: %s %.2f \n",accNo,balance);
	}

}
