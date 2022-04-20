package ws;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws02 {

	public static void main(String[] args) {
//		Lotto Game
//		=
//		
//		
//		
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		// 1. int 6 사이즈 배열 만들기
		int ar[] = new int[6];
		int user[] = new int[6];
		int num = 0;
		
		// 2. 로또번호 만들기 (1~45)
        for (int i = 0; i < ar.length; i++) {
        	ar[i] = rd.nextInt(45)+1;
        	// * 중복 난수 제외
    		for (int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					i--;
				}
    		}
        }
        
        // 3. 유저에게 번호 받기
        	for (int i = 0; i < ar.length; i++) {
        		System.out.printf("Guess a number%d: ", i+1);
        		String snum = sc.next();
        		
        		// * 숫자 외 문자 제외
        		try {
        			num = Integer.parseInt(snum);
        		}catch(Exception e) {
        			System.out.println("Input a number. \n");
        			i--;
        			continue;
        		}
        		user[i] = num;
        		// * 중복 번호 입력 시 다시.
        		for (int j = 0; j < i; j++) {
					if(user[i] == user[j]) {
						System.out.println("Input a same number. \n");
						i--;
					}
				}
        		// * 범위 외 숫자 제외 (1~45)
        		if(num < 0 || num > 45) {
        			System.out.println("Input a number in the range. \n");
        			i--;
        		}
        	}
        	
        // 4. 받은 번호 비교하기
        	int correct = 0;
			for (int i = 0; i < user.length; i++) {
				if(ar[i] == user[i]) {
					correct++;
				}
			}
			
		// 5. 결과 도출
			System.out.println(Arrays.toString(ar));
			System.out.println(Arrays.toString(user));
			System.out.printf("당신은 %d개를 맞추셨습니다. \n", correct);
        	
		// 6. 등수 도출 (1등-6개, 2등-5개, 3등-4개, 4등-3개, 5등-2개, 낙첨 <)
			if(correct == 6) {
				System.out.println("축하합니다! 1등입니다!");
			}else if(correct == 5) {
				System.out.println("축하합니다! 2등입니다!");
			}else if(correct == 4) {
				System.out.println("축하합니다! 3등입니다!");
			}else if(correct == 3) {
				System.out.println("축하합니다! 4등입니다!");
			}else if(correct == 2) {
				System.out.println("축하합니다! 5등입니다!");
			}else{
				System.out.println("낙첨입니다 ..");
			}
		sc.close();
	}
	
}
