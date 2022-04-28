package p440;

public class Calc {
	public int div(int a, int b) throws Exception{
		int result = 0;
		try {
			result = a / b;
		}catch(Exception e) {
			throw e; // 문제 발생 시 호출화면에 문제를 던진다
		}
		return result;
	}
}
