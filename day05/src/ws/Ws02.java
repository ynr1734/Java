package ws;

import java.util.Arrays;
import java.util.Random;

public class Ws02 {

	public static void main(String[] args) {
		
//		int형 배열 사이즈 10인 배열을 만들고 1~99까지의 랜덤한 숫자를 입력 한다.
//		배열의 값이 홀수의 값들만의 합과 평균을 구한다.
		
		int ar[] = new int[10];
		Random rd = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rd.nextInt(99)+1;
		}
		System.out.println(Arrays.toString(ar));
		
		double sum = 0.0;
		int cnt = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2 == 1) {
				sum += ar[i];
				cnt++;
			}
		}
		
		System.out.println(sum);
		System.out.println(cnt);
		System.out.printf("result: %.2f \n",sum/cnt);
		
	}

}
