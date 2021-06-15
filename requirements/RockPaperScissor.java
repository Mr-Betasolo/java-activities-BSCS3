package requirements;
import java.util.Scanner;
public class RockPaperScissor {

	public static void main(String[] args) {
		String userChoice;
		int userScore = 0, compScore = 0;
		String[] gameList = {"Rock", "Paper", "Scissor"};
		Scanner scan = new Scanner(System.in);
		int randomNum = (int)Math.floor(Math.random() * 3);
		
		while(true) {
			System.out.print("Choose Rock, Paper, or Scissor : ");
			userChoice = scan.nextLine();
			String compChoice = gameList[randomNum];			

			String result = "";
			
			if (userChoice.equals(compChoice)) {
				result = "Tie! Try Again";
				
			} else if (userChoice.equals("Rock")) {
				if (compChoice.equals("Scissor")) {
					result = "You Won!";
					userScore += 1;
				} else {
					result = "You Lose!";
					compScore += 1;
				}
			} else if (userChoice.equals("Paper")) {
				if (compChoice.equals("Rock")) {
					result = "You Won!";
					userScore += 1;
				} else {
					result = "You Lose!";
					compScore += 1;
				}
			} else if (userChoice.equals("Scissor")) {
				if (compChoice.equals("Paper")) {
					result = "You Won!";
					userScore += 1;
				} else {
					result = "You Lose!";
					compScore += 1;
				}
			} else {
				System.out.println("\nInvalid Move. Try Again");
				System.out.println("\n======================================\n");
				continue;
			}
			
			System.out.println("\nYou choose " + userChoice + ". The computer choose " + compChoice + ".\n" + result);
			System.out.println("\nPlayer wins: " + userScore + "\nComputer wins: " + compScore);
			
			System.out.print("\nDo you want to try again? (Yes|No) ");
			String choice = scan.nextLine();
			if (choice.equals("Yes") ) {
				System.out.println("\n======================================\n");
				continue;
			} else if (choice.equals("No")) {
				System.out.println("Thanks for playing!");
				break;
			} else {
				break;
			}
		
		}
		scan.close();
	}

}
