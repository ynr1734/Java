package ch04;

import java.util.Random;

public class P118 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(3) + 1; // 1 ~ 3
		System.out.println(n);

		switch (n) {
		case 1:
			System.out.println("�����");
		case 2:
			System.out.println("��Ź��");
		case 3:
			System.out.println("�ڵ���");
			break;
		default:
			break;
		}
		
	}

}
