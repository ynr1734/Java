package p496;

public class StringTest {

	public static void main(String[] args) {
		String str = "abcdef "; // String은 한 번 만들면 변경 불가능
				
		char c = str.charAt(3);
		System.out.println(c);
		
		int i = str.indexOf('c');
		System.out.println(i);
		
		String str2 = str.substring(1, 3);
		System.out.println(str2);
		
		String str3 = str.trim(); // trim은 공백을 사라지게 함
		
		char cs[] = str.toCharArray(); // 여러개를 담을 수 있음
		for (char d : cs) {
			System.out.println(d);
		}
		
		String ss = "1,2,3,4,5";
		String result [] = ss.split(","); // ,를 기준으로 잘라서 출력
		
		for (String st : result) {
			System.out.println(st);
		}
	}

}
