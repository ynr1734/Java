package p422;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number:");
		String num = sc.next();
		int n = 0;
		int result = 0;
		try {
			n = Integer.parseInt(num); 
			result = 100 / n;
			System.out.println(result);
		//	sc.close();  // try 안에 넣으면 문제 발생 시 프로그램이 끝나지 않음
		}catch(ArithmeticException e) {
			System.out.println("분모가 0 입니다.");
		}catch(NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		}finally { // 정상적으로 끝나던 비정상적으로 끝나던 진행됨 (종료 역할)
			sc.close();
			System.out.println("end");
		}
		
	}

}
