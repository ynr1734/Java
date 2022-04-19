package ch04;

public class P130 {

	public static void main(String[] args) {
		// 10부터 1까지 출력 하시오 -> (int i = 10; i >= 1; i--)
		// i: 7일 때까지만 실행 해라
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
