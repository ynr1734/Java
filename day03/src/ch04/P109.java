package ch04;

import java.util.Scanner;

public class P109 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 1 number ..?");
		String n1 = sc.next();
		System.out.println("Input 2 number ..?");
		String n2 = sc.next();
		
		System.out.println("Input 2 Op ..?");
		String op = sc.next();
		
		
		// �Է� ���� ���ڰ� ���ڸ� ���� �ƴϸ� ����
		if (n1.length() > 1 || n2.length() > 1 || op.length() > 1) {
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		
		// ���ڸ� �Է� �޴´�.
		
		// "1" -> '1' 
		char c1 = n1.charAt(0);
		char c2 = n2.charAt(0);
		if( !(c1 >= '1' && c1 <= '9')  ||  !(c2 >= '1' && c2 <= '9')  ) {
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		// System.out.println(n1.length());
				System.out.printf("�Է��� ���ڴ� %s, %s �Դϴ�. \n", n1,n2);
				
				sc.close();
				System.out.println("End");
				
		
		sc.close();
		System.out.println("End");
	}

}
