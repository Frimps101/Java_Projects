import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	
	public static void main(String [] args) {
		
		int low = 1;
		int high = 100;
		
		Scanner s = new Scanner(System.in);
		Random randomNumber = new Random();
		
		int userGuess =low + randomNumber.nextInt(high);
		
		while(true) {
			
			System.out.println("Enter a number. It should be between 1 and 100");
			double userInput = s.nextDouble();
			
			if(userInput == userGuess) {
				System.out.println("Your guess is correct.Congratulations!!!");
				return;
			}	
			else if(userInput < userGuess) {
				System.out.println("Your answer is lesser than the guess. Try again!!!");
			}
			
			else if(userInput > userGuess) {
				System.out.println("Your answer  is greater than the guess. Try again!!!");
			}
			
		}
		
		

}
}