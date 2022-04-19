package ch05;

import java.util.Arrays;
import java.util.Random;

public class P150 {

	public static void main(String[] args) {
		int ar [] = new int[10];
		
		// for문을 이용하여 1~9까지 난수를 만들어 배열에 넣으시오
		Random r = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(9)+1;
		}
		
		// 배열 내용을 출력하시오
		System.out.println(Arrays.toString(ar));
		
		// 배열에 대한 합과 평균을 출력하시오
		double sum = 0.0;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
				sum += ar[i];
		}
		System.out.println(sum);
		System.out.println(sum/ar.length);
	}


}
