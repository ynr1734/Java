package ws;

import java.util.Arrays;
import java.util.Random;

public class Team1 {

	public static void main(String[] args) {
		
//		1. int ������ 5 �迭�� �����.
//		2. 1~9������ ���ڸ� �迭�� �����ϰ� ���� �ִ´�.
//		3. �迭�� ���� �� �ִ밪�� ã�´�.
//		4. �ִ񰪰� �ּڰ��� ����Ѵ�. 
		
		Random rn =  new Random();
		int ar[] = new int[5];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rn.nextInt(9)+1;
		}
		System.out.println(Arrays.toString(ar));
		
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] > max) {
				max = ar[i];
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] < min) {
				min = ar[i];
			}else if (min == 0) {
				min = ar[i];
			}
		}
		
		System.out.printf("�ִ�:%d �ּڰ�:%d \n",max,min);
		
		
		
	}

}
