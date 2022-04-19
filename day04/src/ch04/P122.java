package ch04;

import java.util.Scanner;

public class P122 {

	public static void main(String[] args) {
		// Scanner�� �̿��Ͽ� 2~99������ ������ �Է� �޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number(2~99)");
		String snum = sc.next();
		System.out.println(snum);
		
		// 1���� �Է� �޴� �������� �հ� ����� ����Ͻÿ�. (While��)
		
		// ������ ����� Bye ���α׷� ����
		
		int num = 0;
		try {
			num = Integer.parseInt(snum); // ���ڸ� ���� ����
			
			// ���� 2 ~ 99 ����
			if (num < 2 || num > 99) {
				System.out.println("Bye 1");
				sc.close();
				return;
			}
		}catch(Exception e) {
			System.out.println("Bye 2");
			sc.close();
			return;
		}
		
		
		double sum = 0.0;
		int s = 1;
		
		while(s <= num) {
			sum += s;
			s++;
		}
		
		System.out.println(sum);
		System.out.println(sum/(s-1));
		sc.close();
	}
	
}

