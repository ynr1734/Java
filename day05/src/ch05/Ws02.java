package ch05;

import java.util.Arrays;
import java.util.Random;

public class Ws02 {

	public static void main(String[] args) {
		
//		int�� �迭 ������ 10�� �迭�� ����� 1~99������ ������ ���ڸ� �Է� �Ѵ�.
//		�迭�� ���� Ȧ���� ���鸸�� �հ� ����� ���Ѵ�.
		
		int ar[] = new int [10];
		Random r = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(99)+1;
		}
		System.out.println(ar);
		System.out.println(Arrays.toString(ar));
		
		double sum = 0.0;
		int cnt = 0;
		for (int i = 0; i < ar.length; i++) {
			if(i%2 == 1) {
				sum += ar[i];
				cnt++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/cnt);
		
	
	}
}
