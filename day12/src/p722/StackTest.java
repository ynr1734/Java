package p722;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) { // Stack 구조는 먼저 쓰면 밑에 깔림
											// 마지막에 넣은 걸 처음에 뺄 수 있다 ex) 물병
		Stack<String> st = new Stack<String>();
		st.push("a");
		st.push("b");
		st.push("c");
		st.push("d");
		
		while(!st.isEmpty()) {
			String s = st.pop();
			System.out.println(s);
		}
		
		
	}

}
