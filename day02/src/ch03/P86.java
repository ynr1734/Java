package ch03;

public class P86 {

	public static void main(String[] args) {
		String str = "NaN";
		char c = 'A';
		double a = Double.valueOf(str);
		double result = 0.0;
		
		if (Double.isNaN(a)) {
			System.out.println("입력 오류");
		}else {
			result = a * 100;
		}
		
		System.out.println(result);
		
		
	}

}
