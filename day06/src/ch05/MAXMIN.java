package ch05;

import java.util.Arrays;
import java.util.Random;

public class MAXMIN {

	public static void main(String[] args) {
			
//			1. int 사이즈 5 배열을 만든다.
//			2. 1~9까지의 숫자를 배열에 랜덤하게 값을 넣는다.
//			3. 배열의 값들 중 최대값을 찾는다.
//			4. 최댓값과 최솟값을 출력한다. 
			
			Random rn =  new Random();
			int ar[] = new int[5];
			
			for (int i = 0; i < ar.length; i++) {
				ar[i] = rn.nextInt(9)+1;
			}
			System.out.println(Arrays.toString(ar));
			
			int max = 0;
			int min = 99;	// 최솟값을 크게 잡아두면 min==0 전제가 필요하지 않음
			
			for (int i = 0; i < ar.length; i++) {
				if(ar[i] > max) {
					max = ar[i];
				}if(ar[i] < min) {
					min = ar[i];
				}if (min == 0) {
					min = ar[i];
				}
			}
			System.out.printf("MAX:%d, MIN:%d \n",max,min);	
		
			
	}

}
