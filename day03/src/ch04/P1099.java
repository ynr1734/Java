package ch04;

import java.util.Scanner;

public class P1099 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Number 1..?");
		String n1 = sc.next();
		
		System.out.println("Input Number 2..?");
		String n2 = sc.next();
		
		System.out.println("Input Op..?");
		String op = sc.next();
				
		
		// OP ����
		
		if (op.length() > 1 || 
				(!(op.equals("+")) && 
				!(op.equals("-")) && 
				!(op.equals("/")) &&
				!(op.equals("x"))) ) {
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		
		// ���ڸ� �Է� �޴´�.
		
		double num1 = 0.0;
		double num2 = 0.0;
		
		try {
			num1 = Double.parseDouble(n1);
			num2 = Double.parseDouble(n2);
		}catch(Exception e) {
			System.out.println("���ڸ� �Է� �ϼ��� Bye...");
			sc.close();
			return;
		}
		
		// System.out.println(n1.length());
		System.out.printf("�Է��� ������ %s %s %s  �Դϴ�. \n",n1,op,n2);
		
		
		// ���� ó��
		double result = 0.0;
		
		if(op.equals("+")) {
			result = num1 + num2;
		}else if(op.equals("-")) {
			result = num1 - num2;
		}else if(op.equals("/")) {
			result = num1 / num2;
		}else if(op.equals("x")) {
			result = num1 * num2;
		}else {
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		System.out.printf("���: %.2f \n", result);
	
		String str = "";
		str = (result < 0) ? "����" : "���" ;
		System.out.println(str);
		
		String str2 = "";
		if(result >= 10) {
			str2 = "ū��";
		}else if(result >= 5) {
			str2 = "�߰���";
		}else {
			str2 = "������";
		}
		System.out.println(str2);
		
		
		sc.close();
		System.out.println("End");
	}

}

