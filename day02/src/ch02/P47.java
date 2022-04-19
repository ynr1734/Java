package ch02;

public class P47 {

	public static void main(String[] args) {
		int a = 10; 
		double b = 0.0;
		
		double result = a / b;
		System.out.println(result);
		
		System.out.printf("진짜 double 값: %1.50f \n", b); // \n 다음 문장으로
		// %자릿수.소숫점자릿수
		
		double b2 = 14.23543;
		System.out.printf("%5.2f", b2);
	}

}
