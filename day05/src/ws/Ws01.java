package ws;

import java.util.Arrays;
import java.util.Random;

public class Ws01 {

	public static void main(String[] args) {
//		double 형 배열사이즈 5인 배열을 만들고 0.0 ~ 10.0 사이의 랜덤한 값을
//		넣는다. 값을 출력한다.
		
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
