package p422;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number:");
		String num = sc.next();
		int n = 0;
		try {
			n = Integer.parseInt(num);   // String을 정수로 바꿈
		}catch(NumberFormatException e) { // 최상위 클래스인 Exception에서 상속받아서 Exception만 입력해도 실행 가능
			// System.out.println(e.toString()); // 예외 보여줌, toString 이 없어도 실행가능
			// e.printStackTrace(); // 상세한 예외 상황 보여줌
			System.out.println("숫자가 아닙니다.");
		}
		System.out.println(n);
		int result = 0;
		try {
			result = 100 / n;
		}catch(ArithmeticException e) {
			System.out.println("분모가 0 입니다.");
		}
		
		System.out.println(result);
		sc.close();
	}

}
