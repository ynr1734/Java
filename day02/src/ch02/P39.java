package ch02;

public class P39 {

	public static void main(String[] args) {
		byte b1 = 127;
		System.out.println(b1);
		long b = 9223372036854775807L;
		
		//char c1 = 'A';
		//char c1 = 65; 0x41
		char c1 = '\u0041'; // unicode
		System.out.println(c1);
		
		//char c2 = '\uAC00';
		char c2 = 44032;
		System.out.println(c2);
	}

}
