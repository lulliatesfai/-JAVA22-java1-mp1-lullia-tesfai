import java.util.Scanner;
import java.util.Random;

public class Main {	 

   
public static void main(String[] args) {


         
		Random rand = new Random();
		Scanner scanner = new Scanner (System.in);
	
	
		
		int randomNumber = rand.nextInt (100) + 0;
		//System.out.println("Random number is " + randomNumber);
		
		System.out.println("Enter your guess (0-100):");
		
		int tryCount = 0;
	
		
		while (true) {
		
		int playerGuess = scanner.nextInt();
		tryCount++;
		
		if (playerGuess == randomNumber) {
			//System.out.println(rättSvar);
			System.out.println("Rätt svar! Det tog dig " + tryCount + " försök");
			break;
		}
		
		
		else if (randomNumber > playerGuess) {
			System.out.println("Högre, gissa igen");
			
		}
		
		else {
			System.out.println("Lägre, gissa igen"); 

		}
		
		}
		
		scanner.close();
	 }
		static boolean nbrCheck (int playerGuess, int randomNumber) {
			return playerGuess ==randomNumber;
	
		}
		
}






		
	

	




		

	
	



	

		

		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

