package ch03;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// 단항 연산자
		int aa = -a;
		int bb = b++;
		System.out.println(bb);
		System.out.println(b);
		
		int c = 10;
		int d = 10;
		int sum = c++ + ++d;
		System.out.println(sum);
		System.out.println(c);
		System.out.println(d);
		
		
		// 이항 연산자
		int result = a % b;
		System.out.println(result);
		int data = 100;
		// data = data + 1;
		data += 1;
		
		// 비교연산
		int a1 = 10;
		int a2 = 20;
		
		if(a1 <= a2) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
		}
		
		// 논리연산
		int b1 = 10;
		int b2 = 20;
		int d1 = 10;
		int d2 = 20;
		
		// || or   true
		// && and  true true
		
		if( (b1 > b2) && (d1 < d2) ) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
			System.out.println(d2);
		}
		
		if( ! (b1 > b2) ) { // ! not 아니면
			System.out.println("b2가 크다");
		}else {
			System.out.println("b1이 크다");
		}
		
		// 삼항연산
		int e1 = 10;
		int e2 = 20;
		int eresult = 0;
		if(e1 <= e2) {
			eresult = 100;
		}else {
			eresult = 200;
		}
		System.out.println(eresult);
		
		int eresult2 = (e1 <= e2) ? 100 : 200;
		System.out.println(eresult2);
	}

}
