package ws;

import java.util.Arrays;
import java.util.Random;

public class Team2 {

	public static void main(String[] args) {
//		1. int 형 사이즈 6인 배열을 만든다.
//		2. 1~9까지의 랜덤한 수를 중복되지 않게 넣는다.
//		3. 1~9까지 수 중에 배열값으로 들어가지 않은 수들의 합을 구하라.
		
		int ar[] = new int[6];
		Random rn = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rn.nextInt(8)+1;
			for (int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
		
		int sum = 0;
		for(int i = 1; i < 10; i++) {
			sum += i;
		}
		for (int i = 0; i < ar.length; i++) {
			sum -= ar[i];
			// = sum - ar[i]
		}
		System.out.printf("\n합: %d", sum);
		
	}	
}
	
