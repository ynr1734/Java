package ch04;

import java.util.Scanner;

public class WS01 {

	public static void main(String[] args) {
		// 1. 두 개의 숫자를 Scanner로 입력 받는다. 
		// 조건 : 두 수는 숫자여야 하며 1~99까지의 숫자여야 한다. 
		//       첫번째 숫자는 두번째 숫자보다 작아야한다.
		// 2. 첫번째 숫자부터 두번째 숫자까지의 합과 평균을 구하시오.
		
		System.out.println("Start");
		
		// 1. 두 개의 숫자를 Scanner로 입력 받는다. 
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num1:");
		String snum1 = sc.next();
		System.out.println("Input num2:");
		String snum2 = sc.next();
		
		// 조건 :두 수는 숫자여야 하며 1~99까지의 숫자여야 한다. 
		//       첫번째 숫자는 두번째 숫자보다 작아야한다.
		int num1 = 0;
		int num2 = 0;
		try {
			num1 = Integer.parseInt(snum1);
			num2 = Integer.parseInt(snum2);
		}catch(Exception e) {
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		if( (num1 < 1 || num1 > 99) || (num2 < 1 || num2 > 99) || num1 > num2) {
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		// 2. 첫번째 숫자부터 두번째 숫자까지의 합과 평균을 구하시오.
		double sum = 0.0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println(sum/Math.abs(num1-num2)+1);
		
		sc.close();
		
	}
	
}
	

