package ws;

import java.util.Random;
import java.util.Scanner;

public class Ws01 {

	public static void main(String[] args) {
//		Number Guessing Game
//		1 ~ 99 랜덤숫자 중 한 개의 숫자를 받는다.
//		숫자를 입력하고 해당 숫자보다 낮으면 UP, 높으면 DOWN을 출력한다.
//		10회 이상 입력하면 GAME OVER를 출력한다.
//		최종 숫자를 맞추면 시스템 종료.
		
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
