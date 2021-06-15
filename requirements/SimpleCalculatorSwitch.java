package requirements;
import java.util.Scanner;

public class SimpleCalculatorSwitch {

	public static void main(String[] args) {
		int num1, num2, total, remainder;
		char operation;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the first number: ");
		num1 = sc.nextInt();
		System.out.print("Input the second number: ");
		num2 = sc.nextInt();
		
		System.out.println("\nOperation: \nA. Addition \nB. Subtraction\nC. Multiplication\nD. Division");
		System.out.print("\nChoose Operation: ");
		operation = sc.next().charAt(0);
		
		
		switch(operation) {
			case 'A':
				total = num1 + num2;
				System.out.println("\nThe sum of " + num1 + " and " + num2 + " was " + total);
				break;
			case 'B':
				total = num1 - num2;
				System.out.println("\nThe difference of " + num1 + " and " + num2 + " was " + total);
				break;
			case 'C':
				total = num1 * num2;
				System.out.println("\nThe product of " + num1 + " and " + num2 + " was " + total);
				break;
			case 'D':
				total = num1 / num2;
				remainder = num1 % num2;
				System.out.println("\nThe quotient of " + num1 + " and " + num2 + " was " + total + " r." + remainder);
				break;
			default:
				System.out.println("\nInvalid Operation");
				break;
		}
		
		sc.close();
		
	}

}
