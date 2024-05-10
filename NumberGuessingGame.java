package Project;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int lower = 1;
		int upper = 100;
		int randomNumber = random.nextInt(upper-lower+1)+lower;
		int maxAttempts = 8;
		int attempts = 0;
		int score = 100; //initially
		
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("The Computer have Selected a number between"+lower+"and"+upper+".Try Guessing the Number");
		
		while(attempts<maxAttempts) 
		{
			System.out.println("Enter your guess:");
			int userGuess = sc.nextInt();
			attempts++;
			
			if(userGuess == randomNumber) 
			{
				System.out.println("Congratulations! You Have Guessed the Correct Number in " +attempts+"attempts");
				System.out.println("Your Score is :"+ score);
				break;	
			} 
			else if (userGuess<randomNumber) 
			{
				System.out.println("Too  Low. Try Again.");
			}
			else 
			{
				System.out.println("Too High.Try Again.");
			}
			score =  score-10;
					
		}
		if(attempts==maxAttempts) {
			System.out.println("Sorry,you ran out of attempts.\n The Correct Number was : "+randomNumber);
		}
		sc.close();
	}

}
