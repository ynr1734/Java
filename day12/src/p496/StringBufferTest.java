package p496;

public class StringBufferTest { //string�� ���� �Ұ���, stringBuffer�� ���� ����

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdef");
		sb.append("ghi"); // ���� String�� �� ������ ���
		System.out.println(sb);
		sb.reverse(); // ���� �Ųٷ� ���
		System.out.println(sb); 
		sb.delete(2, 3); // ����� ���
		System.out.println(sb);
	}

}
