package RandomNumber;
import java.util.Random;
import java.util.Scanner;

public class randNum {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner read = new Scanner(System.in);
        System.out.println("Hello In GUESS NUMBER GAME. The game starts with choosen a random number in range (0,100), try to guess it. Good Luck\nNow, you have three trys, could you guess the number: ");
		int randomNum = rand.nextInt(100) + 1;//random number between 0 and 100
		int counter = 3; //only 3 attempts allwoed. 
		int win = 0; //to calculate how many times that user win and lose. 
		int lose = 0;
		while(counter > 0 && 0 <= randomNum && randomNum <= 100) {
			int num = read.nextInt();
			counter--;
			if (num == randomNum) { //win case
				System.out.println("Congrats, You Guess It");
			  	counter = 0;
			  	win ++;
			}
			else if(num > randomNum) { //hint
				System.out.println("Your guess was too large, " + counter + " left. ");
			}
			else if(num < randomNum) {	//hint			
				System.out.println("Your guess was too small, " + counter + " left. ");
			}
			
			if (counter==0){ //attempts done. 
				System.out.println("\nGame Over! You Lose! ");
				lose++;
				System.out.println("Would you try again? yes or no?");
				String playagain = read.next(); //play again? 
				if (playagain.equalsIgnoreCase("yes")) {
					counter = 3;
					System.out.println("The game now play with a new number, guess it: ");
					randomNum = rand.nextInt(100)+1;//generate a new number for a new game. 
				}
				
				else if (playagain.equalsIgnoreCase("no")) {
					System.out.println("No problem, hope you enjoy the game. ");
					System.out.println("you win: " + win + " and you lose: " + lose); 
					break; //stop loop/ 
				}
				else {
					System.out.println("No problem, hope you enjoy the game. ");
				}
			}
		}
		read.close();
	}	
}
