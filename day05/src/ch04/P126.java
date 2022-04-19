package ch04;

public class P126 {// (i,j) 좌표값 구하기 (while문)

	public static void main(String[] args) {
		int i = 0;
		while(i < 5) {
			int j = 0;
			while(j < 5) {
				System.out.printf("%d %d \t",i,j);
				j++;
			}
			System.out.println("");
			i++;
		}
	}
	
}


