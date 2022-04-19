package ch04;

public class P119 {

	public static void main(String[] args) {
		
		System.out.println("Start .....");
		
		// 1부터 10까지 반복하여
		for (int i = 1; i <= 10; i++) {
			System.out.println("For ...." + i);
		} // end for
		
		System.out.println("End .....");
		
		int s = 1;
		while(s <= 10) {
			System.out.println("While ...." + s);
			s++;
		} // end while
	}

}
