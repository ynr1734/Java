package ch04;

import java.util.Scanner;

public class P135 { // ���� �ý��� �����

	public static void main(String[] args) {
		System.out.println("Start ...");
		double balance = 10000.0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input cmd(d,w,s,q,i) ...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
				
			}else if(cmd.equals("d")) {
				System.out.println("Deposit ..");
				System.out.println("Amount ..");
				String snum = sc.next();
				System.out.println(snum);
				int amount = Integer.parseInt(snum);
				if(amount < 0) {
					System.out.println("�����Դϴ�. �ٽ� �����ϼ��� ..");
					continue;
				}
				balance += amount;
				System.out.printf("Balance: %.2f \n",balance);
						
			}else if(cmd.equals("w")) {
				System.out.println("Withdraw ..");
				System.out.println("Amount ..");
				String snum = sc.next();
				System.out.println(snum);
				int amount = Integer.parseInt(snum);
				if(amount < 0) {
					System.out.println("�����Դϴ�. �ٽ� �����ϼ��� ..");
					continue;
				}if(amount > balance) {
					System.out.println("�ܾ� ����. �ٽ� �����ϼ��� ..");
					continue;
				}
				balance -= amount;
				System.out.printf("Balance: %.2f \n",balance);
				
			}else if(cmd.equals("s")) {
				System.out.println("Select Balance ..");
				System.out.printf("Balance: %.2f \n",balance);
				
			}else if(cmd.equals("i")) {
				// �������� �Է��ϸ� ���ڰ� �������� ����Ͻÿ�
				// ���ݰ� ����, �������� ���� ����Ͻÿ�
				System.out.println("������ �Է�:");
				String sinterest = sc.next();
				double interestRate = Double.parseDouble(sinterest);
				double interest = balance * (interestRate / 100);
				System.out.printf("%.2f  %.2f  %.2f %% \n",balance,interest,interestRate);
			}
		}
		sc.close();
		System.out.println("End ...");
	}

}
