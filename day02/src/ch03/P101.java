package ch03;

public class P101 {

	public static void main(String[] args) {
		int sum = 66;
		char result = 0;
		// 90 �̻��̸� 'A'
		// 80 �̻��̸� 'B'
		// 80 �̸��̸� 'C'
//		if(sum >= 90) {
//			result = 'A';
//		}else if(sum >= 80) {
//			result = 'B';
//		}else {
//			result = 'C';
//		}
		// ���� �����ڷ� �����Ͻÿ�
		
		result = (sum >= 90) ? 'A' : ( (sum >= 80) ? 'B' : 'C');
		System.out.println(result);

		
	}
}
