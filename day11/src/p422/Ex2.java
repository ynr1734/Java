package p422;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number:");
		String num = sc.next();
		int n = 0;
		int result = 0;
		try {
			n = Integer.parseInt(num); 
			result = 100 / n;
			System.out.println(result);
		//	sc.close();  // try �ȿ� ������ ���� �߻� �� ���α׷��� ������ ����
		}catch(ArithmeticException e) {
			System.out.println("�и� 0 �Դϴ�.");
		}catch(NumberFormatException e) {
			System.out.println("���ڰ� �ƴմϴ�.");
		}finally { // ���������� ������ ������������ ������ ����� (���� ����)
			sc.close();
			System.out.println("end");
		}
		
	}

}
