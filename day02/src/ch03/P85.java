package ch03;

public class P85 {

	public static void main(String[] args) {
		int a = 100;
		double b = 0.0;
		double result = 0.0;
		
		result = a / b;
		
		if (Double.isInfinite(result)) {
			System.out.println("�и� 0.0 �Դϴ�.");
		}else {
			System.out.println(result);
		}
		
	}

}
