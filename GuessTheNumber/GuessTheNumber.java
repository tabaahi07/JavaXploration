import java.util.Random ;
import java.util.Scanner;

public class GuessTheNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random randomObj = new Random() ;
		int min = 1 , max = 100 ;
		int randomNumber = randomObj.nextInt(max-min) + min ;
		int userInput ;
		do{
			System.out.println("Guess the Number between " + min + " to " + max + ": ") ;
			userInput = scanner.nextInt() ; 
			if(userInput == randomNumber){
				System.out.println("Yayy !! You have guessed the number") ;
				break ;
			}
			else if(userInput > randomNumber){
				System.out.println("Opps !! Wrong guess , Please guess the smaller number") ;
			}
			else System.out.println("Opps !! Wrong guess , Please guess the larger number") ;
		} while(userInput != randomNumber) ;
	}
}