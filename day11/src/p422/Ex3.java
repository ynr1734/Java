package p422;

public class Ex3 {

	public static void main(String[] args) {
		String str = "ABC";
		System.out.println(str.toLowerCase()); //nullPointException : str 설정 X
		
		int a[] = new int[3];
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i : a) {					
			System.out.println(i);
		}
		// 같지만 아래 방법이 에러에 더 안전함 (foreach)
	}

}
