package ws;

import java.util.Arrays;
import java.util.Random;

public class Ws01 {

	public static void main(String[] args) {
//		double �� �迭������ 5�� �迭�� ����� 0.0 ~ 10.0 ������ ������ ����
//		�ִ´�. ���� ����Ѵ�.
		
		Random rd =  new Random();
		double ar[] = new double[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rd.nextDouble()*10;
		}
		System.out.println(Arrays.toString(ar));
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
