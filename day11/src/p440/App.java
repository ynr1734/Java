package p440;

public class App {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		int a = 10;
		int b = 0;
		int result = 0;
		try {
			result = calc.div(a, b);
		} catch (Exception e) {
			System.out.println("분모가 0 입니다.");
		}
		System.out.println(result);
		
		
	
	}

}
