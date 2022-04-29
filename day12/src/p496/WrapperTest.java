package p496;

public class WrapperTest { // 자동 컴파일러가 알아서 연산 가능

	public static void main(String[] args) {
		int a = 10;
		Integer i = 10;
		
		int result = a + i;
		System.out.println(result);
		
		if(a == i) {
			System.out.println("ok");
		}
		
		
		
	}

}
