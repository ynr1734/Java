package ch02;

public class P60 {

	public static void main(String[] args) {
		byte b1 = 100;
		float f1 = 2.5F;
		double d2 = 2.5;
		
		byte bb = (byte)(b1 + b1);
		System.out.println(bb);
		
		int result =  5 + b1;
		
		float ff = 500 + f1;
		double dd = 50000000000000000000000000000.0 + d2;
		
		int result2 = 100 + (int)d2;
		System.out.println(result2);
		
	}

}
