package ch04;

public class P124 { // 구구단 만들기

	public static void main(String[] args) {
		outter:
		for (int i = 2; i < 10; i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.println(i+" 단 시작 --------");
			for (int j = 1; j < 10; j++) {
				if((i*j) == 99) {
					break outter;
				}
				System.out.printf("%d x %d = %d \t",i,j,(i*j));
			}
			System.out.println("~~~~~~~~~~~~~");
		}
	}

}
