package ch04;

public class P132 {

	public static void main(String[] args) {
		// i�� ¦���� ���� ����Ͻÿ�
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 0) {
				System.out.println("For Loop:"+i);
			}
			
		} // end for
		
		System.out.println("--------------------");
		
		int s = 1;
		while (s <= 10) {
			if(s%2 == 0) {
				System.out.println("While Loop:"+s);
			}
			s++;
		}
		
		
	}

}
