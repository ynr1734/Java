package ch05;

public class P151 {

	public static void main(String[] args) {
		int ar [] = {1,2,3,4,5,6,7,8,9};
		
		// �迭�� Ȧ����° ������ �հ� ����� ���Ͻÿ�
		// *�迭�� �׻� 0��°���� ���� !! 2,4,6,8�� Ȧ����°
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
