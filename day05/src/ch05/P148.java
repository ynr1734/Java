package ch05;

public class P148 {

	public static void main(String[] args) {
		String str = "abcde";
		
		int c = str.indexOf("c");
		System.out.println(c);
		
		String str2 = str.substring(0, 2); // 0��°���� �����ؼ� 2��°���� ���
		System.out.println(str2);
		
		String mail= "jmlee@tonesol.com";
		// id�� domain�� ����Ͻÿ�
				
		String id = mail.substring(0, mail.indexOf("@"));
		String domain = mail.substring(mail.indexOf("@")+1, mail.indexOf("."));
		
		System.out.printf("%s %s \n", id, domain);
		
		String ss = "  abc  ";
		
		System.out.println(ss.trim());
		
		
	}

}
