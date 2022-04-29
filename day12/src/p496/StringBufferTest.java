package p496;

public class StringBufferTest { //string은 변경 불가능, stringBuffer는 변경 가능

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdef");
		sb.append("ghi"); // 기존 String에 더 붙혀서 출력
		System.out.println(sb);
		sb.reverse(); // 순서 거꾸로 출력
		System.out.println(sb); 
		sb.delete(2, 3); // 지우고 출력
		System.out.println(sb);
	}

}
