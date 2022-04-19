package ws;

import java.util.Arrays;

public class Ws04 {

	public static void main(String[] args) {
//		이차원 배열에 3명의 학생들의 점수가 있다. 학생 별 점수를 출력한다. 
//		전체 점수의 합과 평균을 구하시오

		int ar[][] = {
				{100,99,80,70},
				{98,91,83,72},
				{89,96,82,75}
		};
		System.out.println(ar.length);
		System.out.println(ar[0].length);
		
		double sum = 0.0;
		
		double as[] = new double[ar.length];
		// {98.2, 89.7, 79.6}
		
		for (int i = 0; i < ar.length; i++) {
			int stSum = 0;
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%d \t",ar[i][j]);
				sum += ar[i][j];
				stSum += ar[i][j];
				as[i] = stSum/ar[i].length;
			}
			System.out.println("");
		}
		System.out.println(Arrays.toString(as));
		
		System.out.println(sum);
		System.out.println(sum/(ar.length * ar[0].length));
	}
	
}
