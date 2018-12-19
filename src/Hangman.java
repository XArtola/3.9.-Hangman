/**
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;
import com.zubiri.hangman.Words;
import java.util.Scanner;
/**
 * @author ik013043z1
 *
 */
public class Hangman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner( System.in);
		
		// Save into an array all the surnames of the people in class
		ArrayList <String> surnames = new ArrayList();
		surnames.add("lazkano");
		surnames.add("intxausti");
		surnames.add("artola");
		surnames.add("alberdi");
		surnames.add("lekubide");
		surnames.add("ortiz");
		surnames.add("gonzalez");

		Words hangman = new Words(surnames);
		// Print the games' description
		System.out.println("Welcome to the famous HANGMAN game.");
		System.out.println("You will have to guess which surname of the people in class is hidden between the voids.");
		System.out.println("For this, you will be able to enter 3 letters that may appear in the surname, or not. After this, you will only have a chance to guess the surname and win the game.");
		boolean playAgain=true;
		while (playAgain == true) {
			// Take randomly a surname between them
			
			String randomSurname = hangman.selectRandomWord() ;
			// Ask the first letter to the player
			System.out.println("Good luck, start with the first letter.");
			// Create a char array with the length of the maximum quantity of letters the player can guess
			char guessed[]=new char[3];
			// Declare a variable that will hold the number of letter that the player guesses
			
			//String arraylsit bezala jarri contains metodoa erabili ahal izateko
			
			
			int guessedCounter=0;
			// Print the word with voids
			for (int i=0;i<randomSurname.length();i++) {
				System.out.print("_ ");
			}
			// Open a loop that will go asking to the player a possible letter in each turn
			int cnt=0;
			while (cnt<3) {
					// Create a string object with the letter's value
					String possibleLetter=sc.nextLine().toLowerCase();
					
					ArrayList<Integer> positions = new ArrayList<Integer>();
					
					if(hangman.validInput(possibleLetter)) {
						
						if (hangman.letterMatch(possibleLetter))
							
							
							ArrayList<Integer> positions = (ArrayList<Integer>)hangman.matchPositions(possibleLetter).clone();
							
							
						/*
							// Open a loop that will go checking if the letter the player entered is in the surname
							for (int i=0;i<randomSurname.length();i++) {
								if (randomSurname.charAt(i)==possibleLetter.charAt(0)) {
									// If it is, open another loop which will go checking if the player had already guessed that letter
									boolean found = false;
									int j=0;
									while (j<guessed.length && guessed[j]!=letterArray[0].charAt(0) && !found ){
										if (!Character.isLetter(guessed[j])) {
											// If he/she had not done so, save the letter in the array 'guessed'
											guessed[guessedCounter] = randomSurname.charAt(i);
											// Increment once the variable 'guessedCounter' for a future possible letter
											guessedCounter++;
											// Define the variable 'found' as true so as to get out of the loop
											found = true;
										}
										// Increment the variable 'index2' so as to check the next letter of the array 'guessed'
										index2++;
									}
								}
							}
							
							*/
							
							
							// Increment 'flag' so as to ask for another letter
							cnt++;
						}
						// If the player entered more than one characters, ask him/her to enter just one
						else {
							System.out.println("Don't cheat, please enter just a letter.");
						}
					}
					
				
				}
				// Print the surname with only the letters that the player guessed
				for (int i=0;i<randomSurname.length();i++) {
					boolean found = false;
					for (int j=0;j<guessed.length;j++) {
						if (guessed[j]==randomSurname.charAt(i)) {
							System.out.print(randomSurname.charAt(index4)+ " ");
							found = true;
						}
					}
					if (!found) {
						System.out.print("_ ");
					}
				}
				// Print to the letters that the player has left
				if (flag == 1) {
					System.out.println("You have two letters left.");
				}
				else if (flag==2){
					System.out.println("You have just a letter left.");
				}
			}
			// Ask to the player a possible word
			System.out.println("It's the time, you have to guess the word.");
			boolean wordEntered2=false;
			while (wordEntered2==false) {
				String playerWord = sc.nextLine().toLowerCase();
				String[] playerWordArray=playerWord.split(" ");
				if (playerWordArray.length==1) {
					boolean numberFound2=false;
					for (int i=0;i<playerWordArray[0].length();i++) {
						if (playerWordArray[0].charAt(i)=='0'||playerWordArray[0].charAt(i)=='1'||playerWordArray[0].charAt(i)=='2'||playerWordArray[0].charAt(i)=='3'||playerWordArray[0].charAt(i)=='4'||playerWordArray[0].charAt(i)=='5'||playerWordArray[0].charAt(i)=='6'||playerWordArray[0].charAt(i)=='7'||playerWordArray[0].charAt(i)=='8'||playerWordArray[0].charAt(i)=='9') {
							numberFound2=true;
						}
					}
					if (numberFound2==false) {
						wordEntered2=true;
						if (playerWordArray[0].equals(randomSurname)) {
							System.out.println("Congrats, you won the game.");
						}
						else {
							System.out.println("I'm sorry, you lost the game. The surname was " + randomSurname);
						}
					}
					else {
						System.out.println("Please, enter a real surname.");
					}
				}
				else {
					System.out.println("Please, enter just a surname.");
				}
			}
			// Ask if the player wants to play again
			System.out.println("Would you like to play again?(y/n)");
			boolean askAgain = true;
			while (askAgain==true) {
				String back = sc.next().toLowerCase();
				sc.nextLine();
				switch ( back ) {
				   	case "y":
				   		// Get out of the loop and play again
				   		askAgain=false;
				   		break;
				   	case "n":
				   		// Get out of the loop and terminate the program
				   		playAgain=false;
				   		askAgain=false;
				   		break;
				   	default:
				   		// Ask for a possible value again
				   		System.out.println("Please, select a possible value(y/n)");
				   		break;
			   	}
			}
		}
		sc.close();
	}
}
		
		
		

	}

}
