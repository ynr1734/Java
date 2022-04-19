package ch04;

import java.util.Random;
import java.util.Scanner;

public class P128 {

	public static void main(String[] args) {
		System.out.println("Start ...");
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		
		while(true) {
			System.out.println("Input cmd(w1,w2,q) ...");
			String cmd = sc.next();
			
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
				
			}else if(cmd.equals("w1")) {
				System.out.println("Input num1:");
				String snum1 = sc.next();
				System.out.println("Input num2:");
				String snum2 = sc.next();
				
				int num1 = 0;
				int num2 = 0;
				try {
					num1 = Integer.parseInt(snum1);
					num2 = Integer.parseInt(snum2);
				}catch(Exception e) {
					System.out.println("Bye");
					continue;
				}
				
				if( (num1 < 1 || num1 > 99) || (num2 < 1 || num2 > 99) || num1 > num2) {
					System.out.println("Bye");
					continue;
				
				}
				
				System.out.println(sum);
				System.out.println(sum/Math.abs(num1-num2)+1);
					
				continue;
				
			}else if(cmd.equals("w2")) {
				System.out.println("W2 Input number..");
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Input num:");
				String snum = sc2.next();
				
				int num = Integer.parseInt(snum);
				Random r = new Random();
				int rnum = r.nextInt(num-1)+2;
				
				double sum2 = 0.0;
				int count = 0;
				for (int i = 2; i < rnum; i += 2) {
						sum2 += i;
						count++;
				}
			
				System.out.println(sum2);
				System.out.println(sum2/count);
			}
		}
		sc.close();
		System.out.println("End ...");
	}

}
