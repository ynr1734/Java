package ch04;

public class P120 {

	public static void main(String[] args) {
		// 1~10까지의 합을 구하시오
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
		System.out.println(sum/count);
		
		System.out.println("-----------------------------");
		
		int s = 1;
		int sum2 = 0;
		while(s <= 10) {
			sum2 += s;
			s++;
		}
		System.out.println(sum2);
		System.out.println(s);
		System.out.println(sum2/(s-1));
	}
	
}