package bank;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Start ...");
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		Account acc = null;
		String accNo = null;
		
		while(true) {
			System.out.println("Input cmd(a,c,d,w,q) ...");
			String cmd = sc.next();
			
			// 메뉴 나가기
			if(cmd.equals("q")) {
				System.out.println("Bye ..");
				break;
				
			// 은행계좌 생성	
			}else if(cmd.equals("a")) {
				System.out.println("Creat an bank account(y/n): ");
				String input = sc.next();
			
				if(input.equals("y")) {
					// 000-00-000000 계좌번호 랜덤 생성
					int accNo1 = rn.nextInt(1000);
					int accNo2 = rn.nextInt(100);
					int accNo3 = rn.nextInt(1000000);
					// 계좌번호 생성
					accNo = new String(accNo1+"-"+accNo2+"-"+accNo3);
					acc = new Account(accNo, 10000);
					System.out.println(acc);
					
				}else if(input.equals("n")) {
					System.out.println("Back to the menu. \n");
					continue;
					
				//* input y or n로 한정
				}else {
						System.out.println("Wrong input. \n");
						continue;
				}
				
			// 은행계좌 조회
			}else if(cmd.equals("c")) { // check
				System.out.printf("Account No.: %s \nBalance: %f \n \n", acc.getAccNo(), acc.getBalance());
				
			// 입금
			}else if(cmd.equals("d")) {
				System.out.printf("Input the amount of deposit: ");
				double deposit = 0.0;
				
				// * 숫자만 입력 가능
				try {
					deposit = Double.parseDouble(sc.next());
				}catch(Exception e) {
					System.out.println("Wrong input. \n");
					continue;
				}
				acc.deposit(deposit);
				System.out.println();
				
			// 출금
			}else if(cmd.equals("w")) {
				System.out.printf("Input the amount of withdrawl: ");
				double withdrawal = 0.0;
				
				//* 숫자만 입력 가능
				try {
					withdrawal = Double.parseDouble(sc.next());
				}catch(Exception e) {
					System.out.println("Wrong input.");
					continue;
				}
				acc.withdraw(withdrawal);
				System.out.println();
					
			}
		}
		
		sc.close();
		System.out.println("Have a good day.");
	}
}
	

