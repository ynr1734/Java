package ch05;

public class P146 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if(a >b) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
		
		
		String s1 = "abc";
		String s2 = "abc";
		
		if(s1 == s2) { // == : �ּҰ� ������
			System.out.println("Equal Reference ..");
		}
		
		if(s1.equals(s2)) { // equals : ���� ������
			System.out.println("Equal String ..");
		}
		
	}

}
