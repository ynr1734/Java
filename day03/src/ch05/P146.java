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
		
		if(s1 == s2) { // == : 주소가 같은지
			System.out.println("Equal Reference ..");
		}
		
		if(s1.equals(s2)) { // equals : 값이 같은지
			System.out.println("Equal String ..");
		}
		
	}

}
