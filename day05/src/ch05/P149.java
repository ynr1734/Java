package ch05;

import java.util.Arrays;

public class P149 {

	public static void main(String[] args) {
		int a = 10;
		
		int ar [] = {10,11,12,13}; // -> 아래와 같은 배열
//		int ar [] = new int[4];
//		ar[0] = 10;
//		ar[1] = 11;
//		ar[2] = 12;
//		ar[3] = 13;
		
		System.out.println(a);
		System.out.println(ar);
		System.out.println(Arrays.toString(ar));
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
	}

}
