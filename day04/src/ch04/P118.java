package ch04;

import java.util.Random;

public class P118 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(3) + 1; // 1 ~ 3
		System.out.println(n);

		switch (n) {
		case 1:
			System.out.println("³ÃÀå°í");
		case 2:
			System.out.println("¼¼Å¹±â");
		case 3:
			System.out.println("ÇÚµåÆù");
			break;
		default:
			break;
		}
		
	}

}
