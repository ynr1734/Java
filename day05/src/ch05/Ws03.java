package ch05;

import java.util.Random;

public class Ws03 {

	public static void main(String[] args) {
		
//		int �� �迭 ������ 6�� �迭�� ����� 1~6 ������ ���� �Է��Ѵ�.
//		��, �ߺ����� �ʰ� �Է��Ѵ�. ���� ����Ѵ�.
		int ar[] = new int [6];
		Random r = new Random();
        for (int i = 0; i < ar.length; i++) {
        	for (int j = 0; j < ar.length; j++) {
        		if(ar[i] == ar[j]) { 
        			break;
        		}
        		System.out.printf("%1f \t",ar[i]);
        	}
		}	
		System.out.println("");
 
        
        
        
    }
	
}


		
		
		
	