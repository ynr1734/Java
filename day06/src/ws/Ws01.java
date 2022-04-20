package ws;

import java.util.Random;
import java.util.Scanner;

public class Ws01 {

	public static void main(String[] args) {
//		Number Guessing Game
//		1 ~ 99 �������� �� �� ���� ���ڸ� �޴´�.
//		���ڸ� �Է��ϰ� �ش� ���ں��� ������ UP, ������ DOWN�� ����Ѵ�.
//		10ȸ �̻� �Է��ϸ� GAME OVER�� ����Ѵ�.
//		���� ���ڸ� ���߸� �ý��� ����.
		
		Random r = new Random();
		int randomNumber = r.nextInt(100)+1;
		int chance = 10;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your guess (1-100)");
			System.out.printf("Chance: %d \n",chance);
			int playerGuess = sc.nextInt();
			if (playerGuess == randomNumber) {
				System.out.println("Clear! You Win!");
				chance --;
				break;
			}else if (playerGuess < randomNumber) {
				System.out.println("No! The Number is Higher! Guess Again.");
				chance --;
				continue;
			}else if (playerGuess > randomNumber) {
				System.out.println("No! The Number is Lower! Guess Again.");
				chance --;
			}
		}
		sc.close();
		System.out.println("End ...");
		
		
	}

}
