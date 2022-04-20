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
		
		// 1. int 6 ������ �迭 �����
		int ar[] = new int[6];
		int user[] = new int[6];
		int num = 0;
		
		// 2. �ζǹ�ȣ ����� (1~45)
        for (int i = 0; i < ar.length; i++) {
        	ar[i] = rd.nextInt(45)+1;
        	// * �ߺ� ���� ����
    		for (int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					i--;
				}
    		}
        }
        
        // 3. �������� ��ȣ �ޱ�
        	for (int i = 0; i < ar.length; i++) {
        		System.out.printf("Guess a number%d: ", i+1);
        		String snum = sc.next();
        		
        		// * ���� �� ���� ����
        		try {
        			num = Integer.parseInt(snum);
        		}catch(Exception e) {
        			System.out.println("Input a number. \n");
        			i--;
        			continue;
        		}
        		user[i] = num;
        		// * �ߺ� ��ȣ �Է� �� �ٽ�.
        		for (int j = 0; j < i; j++) {
					if(user[i] == user[j]) {
						System.out.println("Input a same number. \n");
						i--;
					}
				}
        		// * ���� �� ���� ���� (1~45)
        		if(num < 0 || num > 45) {
        			System.out.println("Input a number in the range. \n");
        			i--;
        		}
        	}
        	
        // 4. ���� ��ȣ ���ϱ�
        	int correct = 0;
			for (int i = 0; i < user.length; i++) {
				if(ar[i] == user[i]) {
					correct++;
				}
			}
			
		// 5. ��� ����
			System.out.println(Arrays.toString(ar));
			System.out.println(Arrays.toString(user));
			System.out.printf("����� %d���� ���߼̽��ϴ�. \n", correct);
        	
		// 6. ��� ���� (1��-6��, 2��-5��, 3��-4��, 4��-3��, 5��-2��, ��÷ <)
			if(correct == 6) {
				System.out.println("�����մϴ�! 1���Դϴ�!");
			}else if(correct == 5) {
				System.out.println("�����մϴ�! 2���Դϴ�!");
			}else if(correct == 4) {
				System.out.println("�����մϴ�! 3���Դϴ�!");
			}else if(correct == 3) {
				System.out.println("�����մϴ�! 4���Դϴ�!");
			}else if(correct == 2) {
				System.out.println("�����մϴ�! 5���Դϴ�!");
			}else{
				System.out.println("��÷�Դϴ� ..");
			}
		sc.close();
	}
	
}
