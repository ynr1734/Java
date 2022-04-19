package ch04;

public class P127 { // 주사위 2개의 눈의 합이 8일 때 

	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if((i+j) == 8) {
					System.out.printf("%d %d \t",i,j);
				}
				System.out.println("");
			}
		}

	}
}
