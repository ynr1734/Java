package ch04;

public class P130 {

	public static void main(String[] args) {
		// 10���� 1���� ��� �Ͻÿ� -> (int i = 10; i >= 1; i--)
		// i: 7�� �������� ���� �ض�
		for (int i = 1; i <= 10; i++) {
			System.out.println("For Loop:"+i);
			if(i == 7) {
				break;
			}
		} // end for
		
		System.out.println("--------------------");
		int s = 1;
		while (s <= 10) {
			System.out.println("While Loop:"+s);
			if(s == 7) {
				break;
			}
			s++;
		}
		
	}

}
