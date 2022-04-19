package ch05;

public class P151 {

	public static void main(String[] args) {
		int ar [] = {1,2,3,4,5,6,7,8,9};
		
		// 배열에 홀수번째 값들의 합과 평균을 구하시오
		// *배열은 항상 0번째부터 시작 !! 2,4,6,8이 홀수번째
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
