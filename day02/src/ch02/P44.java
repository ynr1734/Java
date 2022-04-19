package ch02;

public class P44 {

	public static void main(String[] args) {
		int v1 = 10;  // 10진수
		int v2 = 012; // 8진수
		int v3 = 0x000A; // 16진수
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		byte b1 = 100;
		byte b2 = 100;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b1 + b2);
		
		int vi1 = 1500000000;
		int vi2 = 1500000000;
		long result = (long)vi1 + (long)vi2;
		System.out.println(result);
	}

}
